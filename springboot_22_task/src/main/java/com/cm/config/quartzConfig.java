package com.cm.config;

import com.cm.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class quartzConfig {

    @Bean
    public JobDetail printJobDetail() {
//        绑定具体的工作
        return JobBuilder.
                newJob(MyQuartz.class).
                storeDurably().  //storeDurably()设置持久化
                build();
    }
    @Bean
    public Trigger printJobTrigger(){
        ScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/3 * * * * ?");
//        绑定具体的工作详情，设置执行周期
        return TriggerBuilder
                .newTrigger()
                .forJob(printJobDetail())       //绑定工作明细
                .withSchedule(scheduleBuilder).build();     // 绑定执行周期
    }

}
