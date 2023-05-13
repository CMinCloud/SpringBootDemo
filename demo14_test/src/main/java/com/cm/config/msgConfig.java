package com.cm.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration    //设置为配置类
public class msgConfig {

//    @Bean       //设置为Bean
    public String msg(){
        return "msgTest...";
    }
}
