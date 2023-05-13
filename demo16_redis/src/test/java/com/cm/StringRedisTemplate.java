package com.cm;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class StringRedisTemplate {

//    @Autowired
    @Resource
    private org.springframework.data.redis.core.StringRedisTemplate stringRedisTemplate;


    @Test
    void test(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        System.out.println(ops.get("name"));
    }
}
