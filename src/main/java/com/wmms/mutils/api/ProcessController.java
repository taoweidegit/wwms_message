package com.wmms.mutils.api;

import com.wmms.mutils.entity.TApply;
import com.wmms.mutils.entity.TApplyExample;
import com.wmms.mutils.entity.TApplyStart;
import com.wmms.mutils.entity.TApplyStartExample;
import com.wmms.mutils.mapper.TApplyMapper;
import com.wmms.mutils.mapper.TApplyStartMapper;
import org.flowable.common.engine.impl.identity.Authentication;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private ProcessEngine processEngine;

    @Autowired
    private TApplyMapper applyMapper;

    @Autowired
    private TApplyStartMapper applyStartMapper;

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
        applyStartClause.createCriteria().andEndDateIsNotNull();
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
}
