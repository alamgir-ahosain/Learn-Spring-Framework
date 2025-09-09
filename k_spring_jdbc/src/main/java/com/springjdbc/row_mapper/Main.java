package com.springjdbc.row_mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.row_mapper.dao.StudentDao;
import com.springjdbc.row_mapper.model.Student;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/row_mapper/config.xml");

        StudentDao studentDao = context.getBean("beanStudentDao", StudentDao.class);

      //  Student st = new Student();

        // st.setId(11);
        // st.setName("and up Alamgir");
        // st.setEmail("alamgir@gmail.com");
        // int res = studentDao.insertStudent(st);
        // int res = studentDao.updateStudent(st);

        // int res=studentDao.deleteStudent(11);
        // System.out.println(res);
        Student s=studentDao.getStudentById(11);
        System.out.println(s);

        List<Student> studentList=studentDao.getAllStudent();
        System.out.println(studentList);

        

    }
}
