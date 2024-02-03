package com.wmms.mutils.configuration;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;
import com.google.gson.Gson;
import com.wmms.mutils.entity.*;
import com.wmms.mutils.mapper.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.flowable.engine.HistoryService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.TaskService;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.task.api.Task;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SMSJob extends QuartzJobBean
{
    private static final Logger logger = LogManager.getLogger(SMSJob.class.getName());

    @Resource
    private ProcessEngine processEngine;

    @Resource
    private TaskService taskService;

    @Resource
    private HistoryService historyService;

    @Resource
    private TUserMapper userMapper;

    @Resource
    private TWareMapper wareMapper;

    @Resource
    private TApplyMapper applyMapper;

    @Resource
    private TModelMapper modelMapper;

    @Resource
    private TWareKindMapper kindMapper;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException
    {
        JobDataMap jobDataMap = context.getMergedJobDataMap();
        boolean isPass = jobDataMap.getBoolean("isPass");
        String taskAssignee = isPass ? "sys_notify_pass" : "sys_notify_not_pass";

        taskService = processEngine.getTaskService();
        historyService = processEngine.getHistoryService();
        List<Task> taskList = taskService.createTaskQuery()
                            .taskAssignee(taskAssignee)
                            .includeProcessVariables()
                            .includeTaskLocalVariables()
                            .list();
        for (Task task: taskList)
        {
            HistoricProcessInstance historicProcessInstance = historyService
                                                            .createHistoricProcessInstanceQuery()
                                                            .processInstanceId(task.getProcessInstanceId())
                                                            .singleResult();
            String uid = historicProcessInstance.getStartUserId();

            TUser tUser = userMapper.selectByPrimaryKey(Long.valueOf(uid));
            String mobile = tUser.getMobile(), name = tUser.getName();

            String formId = task.getProcessVariables().get("form").toString();
            TApply apply = applyMapper.selectByPrimaryKey(Long.valueOf(formId));
            TWare ware = wareMapper.selectByPrimaryKey(apply.getWare());
            TModel model = modelMapper.selectByPrimaryKey(ware.getModel());
            TWareKind wareKind = kindMapper.selectByPrimaryKey(model.getKind());
            String modelName = model.getName(), kind = wareKind.getName();

            Config config = new Config()
                    // 必填，您的 AccessKey ID
                    .setAccessKeyId("LTAI5tFL2ZNX4etwRnV65GkJ")
                    // 必填，您的 AccessKey Secret
                    .setAccessKeySecret("pCSMAFuTbLKbGmBvr7Ad0OXJsKZx97");
            // Endpoint 请参考 https://api.aliyun.com/product/Dysmsapi
            config.endpoint = "dysmsapi.aliyuncs.com";

            Gson gson = new Gson();
            Map<String, String> map = new HashMap<>();
            map.put("name", name);
            map.put("ware", kind + " " + modelName);
            map.put("result", isPass ? "通过" : "被拒");

            try
            {
                Client client = new Client(config);
                SendSmsRequest sendSmsRequest = new SendSmsRequest()
                        .setPhoneNumbers(mobile)
                        .setSignName("tdu个人开发")
                        .setTemplateCode("SMS_465135391")
                        .setTemplateParam(gson.toJson(map));
                SendSmsResponse sendSmsResponse = client.sendSmsWithOptions(sendSmsRequest, new RuntimeOptions());
                String code = sendSmsResponse.body.code;
                if (Objects.equals(code, "OK"))
                    taskService.complete(task.getId());
            }
            catch (Exception e)
            {
                logger.error(e.getMessage());
            }
        }
    }
}
