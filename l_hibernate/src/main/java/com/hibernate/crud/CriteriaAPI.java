package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaAPI {
    SessionFactory sessionFactory = Hibernate.getSessionFactory();

    private void print(Query<Student> query) {
        List<Student> students = query.getResultList();
        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("No students found.");
        }
    }

    // GET all
    public void getAllStudent() {
        try (Session session = sessionFactory.openSession()) {

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> root = cq.from(Student.class);
            cq.select(root); // SELECT * FROM Student

            Query<Student> query = session.createQuery(cq); // executable Hibernate Query
            print(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // single result
    public void getStudentById(int studentId) {
        try (Session session = sessionFactory.openSession()) {
            
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);

            Root<Student> root = cq.from(Student.class);
            cq.select(root).where(cb.equal(root.get("id"), studentId));

            Query<Student> query = session.createQuery(cq); // executable Hibernate Query
            print(query);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
