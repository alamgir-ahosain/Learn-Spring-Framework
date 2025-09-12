package com.hibernate.connection_provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

    private static SessionFactory sessionFactory;
    static { // Static block - runs once when the class is loaded.
        try {
            if (sessionFactory == null) { // Ensures singleton - creates factory only once.
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            }

        } catch (Exception e) {
            System.out.println("SessionFactory Error: ");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
