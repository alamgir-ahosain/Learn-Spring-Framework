package com.springcore.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestValue {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/value/config.xml");
        // Info2 info = context.getBean("info2", Info2.class);
        Info2 info = context.getBean("customBeanName", Info2.class);
        System.out.println(info);

    }
}
