package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.connection_provider.Hibernate;
import com.hibernate.entities.Address;
import com.hibernate.entities.Student;

 class App {

    public void Start() {
        System.out.println("Main Class");

        SessionFactory sessionFactory = Hibernate.getSessionFactory();
        Session session = sessionFactory.openSession(); // getting a connection to DB
        Transaction transaction = null;

        try {

            // create Student
            Student student = new Student();
            student.setName("Hosain");
            student.setEmail("hosain@gmail.com");

            // Create Address
            Address address = new Address();
            address.setCity("Mymensingh");
            address.setStudent(student); // link address to student

            // Add address to student's list
            student.getAddress().add(address);

            transaction = session.beginTransaction();
            session.persist(student); // save the object to DB
            transaction.commit(); // commit change to DB
            System.out.println("saved succesfully");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // if any error
            }
            System.out.println("Error:" + e);
        } finally {
            session.close(); // always close the session
        }
    }

}
