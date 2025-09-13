package com.hibernate.crud;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Address;
import com.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentAddress {
    public void Start() {
        System.out.println("Insert Student and Address Class");

        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            Student student = new Student();
            student.setName("Alamgir");
            student.setEmail("updatedalamgir@gmail.com");

            Address address = new Address();
            address.setCity("Mankon");
            address.setStudent(student);
            student.getAddress().add(address);

            transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
            System.out.println("saved succesfully");

        } catch (Exception var9) {
            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("Error:" + String.valueOf(var9));
        } finally {
            session.close();
        }

    }
}
