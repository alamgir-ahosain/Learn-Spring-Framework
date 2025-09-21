package com.springcore.annotation_based.without_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getAddress());

        Address address = student.getAddress();
        System.out.println(address.getName());

    }
}
