package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Student;

public class CrudClass {
    SessionFactory sessionFactory = Hibernate.getSessionFactory();

    public Student ReadStudent(int id) {
        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, id);
            return student;
            
        } catch (Exception e) {
            return null;
        }
    }
}
