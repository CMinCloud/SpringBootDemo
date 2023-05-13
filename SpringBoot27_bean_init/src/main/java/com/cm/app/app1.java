package com.cm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app1 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
//        Object cat = ctx.getBean("cat");
//        Object dog = ctx.getBean(dog.class);
//        System.out.println(cat);
//        System.out.println(dog);
        int count = 1;
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println((count++) + ":" + name);
        }
    }
}
