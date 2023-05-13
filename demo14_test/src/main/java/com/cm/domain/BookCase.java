package com.cm.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component    //声明该类为一个Bean，从而才能使用ConfigurationProperties来使用配置属性，或者在配置类中声明
               //       EnableConfiguration(xxx.class )
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {
    private int  id;
    private String  name;
    private String  uuid;
    private long  publishTime;
}
