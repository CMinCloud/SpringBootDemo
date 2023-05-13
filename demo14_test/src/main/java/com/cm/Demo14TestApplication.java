package com.cm;

import com.cm.domain.BookCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(BookCase.class)
public class Demo14TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo14TestApplication.class, args);
    }

}
