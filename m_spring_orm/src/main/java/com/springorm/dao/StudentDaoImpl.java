package com.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

public class StudentDaoImpl {
    private HibernateTemplate hibernateTemplate;

    public void insert(Student student) {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        System.out.println(i);

    }

}