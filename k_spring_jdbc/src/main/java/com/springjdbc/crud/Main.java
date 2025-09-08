package com.springjdbc.crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.crud.dao.StudentDao;
import com.springjdbc.crud.model.Student;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/crud/config.xml");

        StudentDao studentDao = context.getBean("beanStudentDao", StudentDao.class);

        Student st = new Student();
        st.setId(15);
        st.setName("JK");
        st.setName("jk@gmail.com");
        int res = studentDao.insert(st);
        System.out.println(res);

    }
}
