package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Depency Injection Basic..!");

        // Load Spring context from config.xml in classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve bean by ID
        Student st1 = (Student) context.getBean("student1");
        System.out.println(st1);
    }
}
