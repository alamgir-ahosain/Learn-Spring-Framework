package com.springjdbc.without_xml_use_autowire_nnotation;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.without_xml_use_autowire_nnotation.dao.StudentDao;
import com.springjdbc.without_xml_use_autowire_nnotation.model.Student;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

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
