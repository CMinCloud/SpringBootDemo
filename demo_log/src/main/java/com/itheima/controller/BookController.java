package com.itheima.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController extends BaseController{
//    1.创建记录日志的对象
//    private static Logger log = LoggerFactory.getLogger(BookController.class);


    @GetMapping
    public String test0(){
        System.out.println("test...");

        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "test0 respond~";
    }
    
}
