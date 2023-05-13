package com.cm.service.serviceImpl;

import com.cm.service.bookService;
import org.springframework.stereotype.Service;

@Service("aa1")
//""中的值相当于id
public class bookserviceImple1 implements bookService {
    @Override
    public void check() {
        System.out.println("boolService1...");
    }
}
