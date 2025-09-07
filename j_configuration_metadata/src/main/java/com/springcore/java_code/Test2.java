package com.springcore.java_code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        A2 a = context.getBean("beanName1", A2.class);
        a.func();
        context.close();
    }
}
