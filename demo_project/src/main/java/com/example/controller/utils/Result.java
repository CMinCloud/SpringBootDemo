package com.example.controller.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

// 设计表现层的模型类
// 前后端数据协议
@Data
public class Result {
    private boolean flag;      // 查询结果状态 成功 ? true:false
    private Object data;   // 存储查询出来的数据
    private String msg;    // 查询错误信息

    public Result(){}

    public Result(boolean flag){
        this.flag = flag;
    }

    public Result(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public Result(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public Result(String msg) {
        this.msg = msg;
    }
}
