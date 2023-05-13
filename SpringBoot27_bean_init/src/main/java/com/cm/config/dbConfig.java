package com.cm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 加载配置类（之后才可以扫描到该配置类下的bean）
public class dbConfig {
    @Bean   // 加载bean
    public DruidDataSource dataSource2(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }
}
