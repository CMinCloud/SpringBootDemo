package com.cm;

import com.cm.service.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot23MailApplicationTests {

    @Autowired
    private SendMailService service;

    @Test
    void contextLoads() {
    }

    @Test
    void sendMessage(){
        service.sendMail();
    }


}
