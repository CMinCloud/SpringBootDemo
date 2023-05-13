package com.cm.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationFormat;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

//@Component   //表示受Spring管控
@Data
@ConfigurationProperties(prefix = "servers")
@Validated    //对当前Bean进行规范校验
public class ServerConfig {
    private String ipAddress;       //ip地址
    @Max(value = 8888,message = "最大值不能超过8888")     //规范最大值
    private int port;               //端口号
    private long timeout;           // 超时时间
    @DurationUnit(ChronoUnit.WEEKS)     //大小单位为h
    private Duration ServerTimeOut;
    @DataSizeUnit(DataUnit.MEGABYTES)    //大小单位为kb
    private DataSize dataSize;
}
