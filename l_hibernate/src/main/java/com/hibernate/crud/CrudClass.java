package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Student;

public class CrudClass {
    SessionFactory sessionFactory = Hibernate.getSessionFactory();

    // Save
    public void saveStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // READ student by Id
    public Student ReadStudentById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, id);
            return student;

        } catch (Exception e) {
            return null;
        }
    }

    // update
    public Student updateStudent(Student student, int id) {
        try (Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();
            Student oldStudent = session.get(Student.class, id);
            if (oldStudent != null) {
                oldStudent.setName(student.getName());
                oldStudent = session.merge(oldStudent);
            }
            transaction.commit();
            return oldStudent;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    // delete
    public void deleteStudent(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class, id);

            if (student != null) {
                session.remove(student);
            }
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
