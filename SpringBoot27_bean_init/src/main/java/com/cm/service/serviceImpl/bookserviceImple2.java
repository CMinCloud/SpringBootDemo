package com.cm.service.serviceImpl;

import com.cm.service.bookService;
import org.springframework.stereotype.Service;

@Service("aaa2")
public class bookserviceImple2 implements bookService {
    @Override
    public void check() {
        System.out.println("boolService2...");
    }
}
