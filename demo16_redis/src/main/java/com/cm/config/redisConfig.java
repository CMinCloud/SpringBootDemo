package com.cm.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.Resource;

@Configuration
public class redisConfig {

    //    重写redis序列化方法，不要以原先JDK的序列化方式，那样浪费空间且可读性差
//    一般key为String，值为Object
    @Bean
    RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
//        创建redisTemplate对象
        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        设置连接工厂
        template.setConnectionFactory(connectionFactory);
//        创建Json序列化工具
        GenericJackson2JsonRedisSerializer jsonRedisSerializer
                = new GenericJackson2JsonRedisSerializer();
//        设置key的序列化
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());
//        设置value的序列化  ,  序列化为json格式
        template.setValueSerializer(jsonRedisSerializer);
        template.setHashValueSerializer(jsonRedisSerializer);
//        返回
        return template;
    }

}
