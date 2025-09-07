package com.springcore.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingleton {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/singleton/config.xml");
        // Info2 info = context.getBean("info2", Info2.class);

        Info info1 = context.getBean("customBeanName", Info.class);
        Info info2 = context.getBean("customBeanName", Info.class);

        System.out.println(info1);
        System.out.println(info2);

        System.out.println("Hash Code info1 instance:" + info1.hashCode());
        System.out.println("Hash Code info2 instance:" + info2.hashCode());

    }
}
