package com.springcore.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotation_based/config.xml");
        // A a = (A) context.getBean("beanA");
        A2 a2 = context.getBean("beanA2", A2.class);
        System.out.println(a2);
        ((AbstractApplicationContext) context).close();

    }
}
