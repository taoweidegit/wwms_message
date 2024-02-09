package com.wmms.mutils.configuration;

import com.wmms.mutils.entity.TApply;
import com.wmms.mutils.mapper.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.util.List;

public class ApplyTimeoutJob extends QuartzJobBean
{
    private static final Logger logger = LogManager.getLogger(ApplyTimeoutJob.class.getName());

    @Resource
    private ProcessEngine processEngine;

    @Resource
    private TaskService taskService;

    @Resource
    private RuntimeService runtimeService;

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
        runtimeService = processEngine.getRuntimeService();

        // 备件申请时间超过超过半年,自动取消订单
        List<TApply> applyList = applyMapper.selectByApplicationTimeOverHalfYear();
        for (TApply apply : applyList)
        {
            apply.setState("cancel");
            applyMapper.updateByPrimaryKey(apply);
        }

        // 入库申请超过2天,自动取消
    }
}
