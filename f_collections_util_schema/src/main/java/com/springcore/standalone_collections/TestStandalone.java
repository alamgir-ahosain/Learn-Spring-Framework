package com.springcore.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/standalone_collections/config.xml");

        A a = context.getBean("beanA", A.class);
        a.showData();
    }
}