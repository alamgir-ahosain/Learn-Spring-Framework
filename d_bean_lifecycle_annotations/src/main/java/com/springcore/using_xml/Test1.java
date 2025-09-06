package com.springcore.using_xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("com/springcore/using_xml/config.xml");
        // A1 a1 = (A1) context.getBean("beanA1");
        // System.out.println(a1.toString());

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/using_xml/config.xml");
        A1 a2 = (A1) context.getBean("beanA2");
        System.out.println(a2.toString());
        context.registerShutdownHook(); // call destroy methods of all singleton beans when the JVM shuts down.

    }

}
