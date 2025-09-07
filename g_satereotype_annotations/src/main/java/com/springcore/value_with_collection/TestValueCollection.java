package com.springcore.value_with_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestValueCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/value_with_collection/config.xml");

        A a = context.getBean("customBeanA", A.class);
        a.showData();
    }
}