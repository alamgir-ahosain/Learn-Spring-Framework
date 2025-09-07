package com.springcore.annotation_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        ClassA a = context.getBean(ClassA.class);
        a.func();
    }
}
