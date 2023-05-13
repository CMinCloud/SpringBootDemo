package com.cm.quartz;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public static int i = 1;

    @Scheduled(cron = "0/1 * * * * ?")
    public void log(){
        System.out.println("logging"+":"+i++);
    }

}
