package com.springcore.d_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("constructorConfig.xml");
        Person p=(Person) context.getBean("person1");
        System.out.println();
       System.out.println(p.toString());
       System.out.println(p.getClass().getName());
       System.out.println(p.getClass().toString());
    }
}
