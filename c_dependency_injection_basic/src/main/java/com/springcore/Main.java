package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Depency Injection Basic..!");

        // Load Spring context from config.xml in classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve bean by name
        Student st1 = (Student) context.getBean("student1");
        Student st2 = (Student) context.getBean("student2");
        Student st3 = (Student) context.getBean("student3");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
