package com.hibernate;

import com.hibernate.crud.CrudClass;
import com.hibernate.entities.Student;

public class Test {
    public static void main(String[] args) {
        // App app = new App();
        CrudClass crud = new CrudClass();
        // app.Start();
        Student s = crud.ReadStudent(1);
        System.out.println(s);

    }
}
