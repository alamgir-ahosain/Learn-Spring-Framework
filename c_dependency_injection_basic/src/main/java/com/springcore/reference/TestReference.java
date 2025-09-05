package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceType.xml");

        A a = (A) context.getBean("aReference");
        System.out.println(a.getId());
        System.out.println(a.toString());
        System.out.println(a.getClass().getName());
    }
}
