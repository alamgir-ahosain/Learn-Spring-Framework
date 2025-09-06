package com.springcore.using_interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/using_interface/config.xml");

        A2 a2 = (A2) context.getBean("beanA2");
        System.out.println(a2.toString());
        context.registerShutdownHook(); // call destroy methods of all singleton beans when the JVM shuts down.

    }

}
