package com.springcore.using_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(  "com/springcore/using_annotation/config.xml");

        A3 a3 = (A3) context.getBean("beanA3");
        System.out.println(a3.toString());
        context.close(); // Must close context to trigger @PreDestroy

    }

}
