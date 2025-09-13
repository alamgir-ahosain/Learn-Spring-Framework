package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDaoImpl;
import com.springorm.entities.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDaoImpl studentDao = context.getBean("StudentDaoImplBean", StudentDaoImpl.class);
        Student s2 = new Student("Alamgir", "alamgir@gmail.com");
        studentDao.insert(s2);
        ((AbstractApplicationContext) context).close();

    }
}