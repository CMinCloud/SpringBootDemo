package com.itheima.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {

    public Class aClass;
    public Logger log;

//    初始化对象
    public BaseController(){
        aClass = this.getClass();
        log = LoggerFactory.getLogger(aClass);
    }
}
