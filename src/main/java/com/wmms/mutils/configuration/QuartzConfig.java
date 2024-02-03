package com.wmms.mutils.configuration;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig
{
    @Bean
    public JobDetail jobPassDetail()
    {
        //指定任务描述具体的实现类
        return JobBuilder.newJob(SMSJob.class)
                // 指定任务的名称
                .withIdentity("sms_pass")
                // 任务描述
                .withDescription("发送短信")
                .usingJobData("isPass", true)
                // 每次任务执行后进行存储
                .storeDurably()
                .build();
    }

    @Bean
    public JobDetail jobNotPassDetail()
    {
        //指定任务描述具体的实现类
        return JobBuilder.newJob(SMSJob.class)
                // 指定任务的名称
                .withIdentity("sms_not_pass")
                // 任务描述
                .withDescription("发送短信")
                .usingJobData("isPass", false)
                // 每次任务执行后进行存储
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger passTrigger() {
        //创建触发器
        return TriggerBuilder.newTrigger()
                // 绑定工作任务
                .forJob(jobPassDetail())
                // 每隔 5 秒执行一次 job
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(20))
                .build();
    }

    @Bean
    public Trigger notPassTrigger() {
        //创建触发器
        return TriggerBuilder.newTrigger()
                // 绑定工作任务
                .forJob(jobNotPassDetail())
                // 每隔 5 秒执行一次 job
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(20))
                .build();
    }
}
