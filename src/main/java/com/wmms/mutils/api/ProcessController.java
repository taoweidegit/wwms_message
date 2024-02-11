package com.wmms.mutils.api;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.wmms.mutils.entity.*;
import com.wmms.mutils.excel.ApplyPlanExcelData;
import com.wmms.mutils.excel.CustomCellWriteWidthConfig;
import com.wmms.mutils.excel.StyleUtils;
import com.wmms.mutils.mapper.*;
import org.flowable.common.engine.impl.identity.Authentication;
import org.flowable.engine.*;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
public class ProcessController
{
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private TApplyMapper applyMapper;

    @Autowired
    private TApplyStartMapper applyStartMapper;

    @Autowired
    private TWareMapper wareMapper;

    @Autowired
    private TWareKindMapper kindMapper;

    @Autowired
    private TModelMapper modelMapper;

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TInventoryMapper inventoryMapper;

    @PostMapping("/process/model/apply/start")
    public String start(@RequestBody Map<String, Object> map)
    {
        String uid = map.get("uid").toString();
        // 数据库中申请者提交数据主键
        String formId = map.get("form").toString();

        repositoryService = processEngine.getRepositoryService();
        runtimeService = processEngine.getRuntimeService();
        taskService = processEngine.getTaskService();

        // 部署流程
        boolean hasApplyDeploy =
                !repositoryService.createDeploymentQuery().deploymentKey("model_apply").list().isEmpty();
        if (!hasApplyDeploy)
            repositoryService.createDeployment().addClasspathResource("process/model_apply.bpmn20.xml").deploy();

        // 开启流程
        Map<String, Object> variables = new HashMap<>();
        variables.put("form", formId);

        Authentication.setAuthenticatedUserId(uid);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("model_apply", variables);
        String processId = processInstance.getId();

        // 查找计量专员开通的采购计划
        TApplyStartExample applyStartClause = new TApplyStartExample();
        applyStartClause.createCriteria().andEndDateIsNull();
        List<TApplyStart> applyStartList = applyStartMapper.selectByExample(applyStartClause);

        // 更改数据库, 添加流程Id和采购计划Id
        TApply apply = applyMapper.selectByPrimaryKey(Long.valueOf(formId));
        apply.setApplyId(processId);
        if (!applyStartList.isEmpty())
            apply.setApplyStartId(applyStartList.get(0).getID());
        else
            apply.setState("cancel");
        TApplyExample applyClause = new TApplyExample();
        applyClause.createCriteria().andIDEqualTo(Long.valueOf(formId));
        applyMapper.updateByExample(apply, applyClause);

        // 查找Task
        List<Task> list = taskService.createTaskQuery()
                .processInstanceId(processId)
                .taskAssignee("sys_check_plan")
                .includeProcessVariables()
                .includeTaskLocalVariables()
                .list();
        Task task = null;
        for (Task value : list)
        {
            String v = value.getProcessVariables().get("form").toString();
            if (Objects.equals(v, formId))
            {
                task = value;
                break;
            }
        }

        // 判断计量专员是否开启采购计划
        boolean isStart = !applyStartList.isEmpty();

        if (task != null)
        {
            // 排他网关, 若开启则为yes, 否则为no
            String result = isStart? "yes" : "no";
            Map<String,Object> vars = new HashMap<>();
            vars.put("result", result);
            taskService.complete(task.getId(), vars);
        }

        return "200";
    }

    @GetMapping("/process/model/apply/state")
    public String getMetrologyHistoryList(@RequestParam String form)
    {
        // form --> 数据库t_apply表主键
        TApply apply = applyMapper.selectByPrimaryKey(Long.valueOf(form));
        historyService = processEngine.getHistoryService();

        List<String> assigneeList = new ArrayList<>();
        List<HistoricTaskInstance> historicTaskInstanceList =
                historyService.createHistoricTaskInstanceQuery().processInstanceId(apply.getApplyId()).list();
        for (HistoricTaskInstance historicTaskInstance: historicTaskInstanceList)
        {
            String assignee = historicTaskInstance.getAssignee();
            assigneeList.add(assignee);
        }

        // 202为未抵达计量专员批准阶段
        // 200计量专员批准
        // 201计量专员拒绝
        // 203已抵达计量专员 待 批准状态

        if (!assigneeList.contains("check_apply"))
            return "202";

        if (!assigneeList.contains("sys_notify_pass") && !assigneeList.contains("sys_notify_not_pass"))
            return "203";

        if (assigneeList.contains("sys_notify_pass"))
            return "200";

        return "201";
    }

    @GetMapping("/process/model/apply/accept")
    public String acceptApply(@RequestParam String applyId)
    {
        TApply apply = applyMapper.selectByPrimaryKey(Long.valueOf(applyId));
        String processId = apply.getApplyId();
        apply.setState("approving");
        applyMapper.updateByPrimaryKey(apply);

        Task task =
                taskService.createTaskQuery().processInstanceId(processId).taskAssignee("check_apply").singleResult();
        Map<String,Object> vars = new HashMap<>();
        vars.put("result", "yes");
        taskService.complete(task.getId(), vars);

        return "200";
    }

    @GetMapping("/process/model/apply/reject")
    public String rejectApply(@RequestParam String applyId)
    {
        TApply apply = applyMapper.selectByPrimaryKey(Long.valueOf(applyId));
        String processId = apply.getApplyId();
        apply.setState("cancel");
        applyMapper.updateByPrimaryKey(apply);

        Task task =
                taskService.createTaskQuery().processInstanceId(processId).taskAssignee("check_apply").singleResult();
        Map<String,Object> vars = new HashMap<>();
        vars.put("result", "no");
        taskService.complete(task.getId(), vars);

        return "200";
    }

    @PostMapping("/process/plan/apply/end")
    public String endApply(@RequestBody Map<String, Object> map)
    {
        List<String> applyIdList = (List<String>) map.get("data");

        taskService = processEngine.getTaskService();

        for (String processId: applyIdList)
        {
            Task task =
                    taskService.createTaskQuery().processInstanceId(processId).taskAssignee("check_apply").singleResult();
            Map<String,Object> vars = new HashMap<>();
            vars.put("result", "yes");
            taskService.complete(task.getId(), vars);

            TApplyExample applyClause = new TApplyExample();
            applyClause.createCriteria().andApplyIdEqualTo(processId);
            TApply updateApply = new TApply();
            updateApply.setState("approving");
            applyMapper.updateByExampleSelective(updateApply, applyClause);
        }

        return "200";
    }

    @GetMapping("/process/plan/end/excel")
    public String generateEndPlanExcel(@RequestParam String planId) throws IOException
    {
        TApplyExample applyClause = new TApplyExample();
        applyClause.createCriteria().andApplyStartIdEqualTo(Long.valueOf(planId));
        List<TApply> applyList = applyMapper.selectByExample(applyClause);

        List<ApplyPlanExcelData> dataList = new ArrayList<>();
        for (TApply apply: applyList)
        {
            ApplyPlanExcelData applyPlanExcelData = new ApplyPlanExcelData();

            TWare ware = wareMapper.selectByPrimaryKey(apply.getWare());
            TModel model = modelMapper.selectByPrimaryKey(ware.getModel());
            TWareKind wareKind = kindMapper.selectByPrimaryKey(model.getKind());
            TUser user = userMapper.selectByPrimaryKey(apply.getApplicant());

            applyPlanExcelData.setType(wareKind.getName());
            applyPlanExcelData.setApplyCount(apply.getApplyQuantity().toString());
            applyPlanExcelData.setModel(model.getName());
            applyPlanExcelData.setItemNumber(ware.getItemNumber());
            applyPlanExcelData.setName(user.getName());

            dataList.add(applyPlanExcelData);
        }

        HorizontalCellStyleStrategy horizontalCellStyleStrategy =
                new HorizontalCellStyleStrategy(StyleUtils.getHeadStyle(), StyleUtils.getContentStyle());
        com.wmms.mutils.excel.CustomCellWriteWidthConfig customCellWriteWidthConfig = new CustomCellWriteWidthConfig();

        File file = new File("D:\\采购计划.xlsx");
        if (file.exists())
            file.delete();

        EasyExcel.write(file, ApplyPlanExcelData.class)
                .sheet()
                .registerWriteHandler(horizontalCellStyleStrategy)
                .registerWriteHandler(customCellWriteWidthConfig)
                .doWrite(dataList);

        String bucketName = "wmms";

        // OSS上传
        OSS ossClient = null;
        try
        {
            String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
            ossClient = new OSSClientBuilder().build(endpoint, "LTAI5tFL2ZNX4etwRnV65GkJ",
                    "pCSMAFuTbLKbGmBvr7Ad0OXJsKZx97");

            boolean exists = ossClient.doesBucketExist(bucketName);
            if (!exists)
                ossClient.createBucket(bucketName);

            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, "采购计划.xlsx", file);
            ossClient.putObject(putObjectRequest);
        }
        catch (Exception e)
        {

        }
        finally
        {
            if (ossClient != null)
                ossClient.shutdown();
        }

        return "200";
    }

    @PostMapping("/process/instock/apply/start")
    public String startInstockApply(@RequestBody Map<String, Object> map)
    {
        String applyId = map.get("apply_id").toString();
        String modelId = map.get("model_id").toString();
        int wareCount = Integer.parseInt(map.get("ware_count").toString());
        List<Integer> inventoryIdList = (List<Integer>) map.get("inventory_id");
        String applicantId = map.get("applicant_id").toString();

        // 部署流程
        boolean hasApplyDeploy =
                !repositoryService.createDeploymentQuery().deploymentKey("instock_apply").list().isEmpty();
        if (!hasApplyDeploy)
            repositoryService.createDeployment().addClasspathResource("process/instock_apply.bpmn20.xml").deploy();

        for (int inventoryId: inventoryIdList)
        {
            Map<String, Object> variables = new HashMap<>();
            variables.put("apply", applyId);
            variables.put("model", modelId);
            variables.put("inventory", String.valueOf(inventoryId));
            variables.put("count", wareCount);
            variables.put("applicant", applicantId);

            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("instock_apply", variables);
            String processId = processInstance.getId();

            TInventory inventory = inventoryMapper.selectByPrimaryKey((long) inventoryId);
            if (inventory == null)
                continue;

            inventory.setProcess(processId);
            inventoryMapper.updateByPrimaryKey(inventory);

            Task task = taskService.createTaskQuery()
                    .processInstanceId(processId)
                    .taskId("into_sys")
                    .includeProcessVariables()
                    .includeTaskLocalVariables()
                    .singleResult();

            if (task != null)
            {
                taskService.complete(task.getId());
                String updateInventoryId = task.getProcessVariables().get("inventory").toString();
                TInventory updateInventory = inventoryMapper.selectByPrimaryKey(Long.valueOf(updateInventoryId));
                updateInventory.setState("in_check");
                inventoryMapper.updateByPrimaryKey(updateInventory);
            }
        }

        return "200";
    }
}
