package com.springcore.qualifier_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQualifier {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "com/springcore/qualifier_annotation/config.xml");
        // A a = (A) context.getBean("beanA");
        A3 a = context.getBean("beanA3", A3.class);
        System.out.println(a);
        ((AbstractApplicationContext) context).close();

    }
}
