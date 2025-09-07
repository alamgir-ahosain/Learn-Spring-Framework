package com.springcore.xml_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/xml_based/config.xml");
        A a = context.getBean("customA", A.class);
        System.out.println(a);
    }
}
