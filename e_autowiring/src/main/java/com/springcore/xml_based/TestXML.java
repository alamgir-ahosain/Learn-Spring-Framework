package com.springcore.xml_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/xml_based/config.xml");
        // A a = (A) context.getBean("beanA");
        A a = context.getBean("beanA", A.class);
        System.out.println(a);
        ((AbstractApplicationContext) context).close();

    }
}
