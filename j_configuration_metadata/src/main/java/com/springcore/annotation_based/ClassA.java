package com.springcore.annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    @Autowired
    private ClassB b2; // dependency injection

    public void func() {
        this.b2.getClassB();
        System.out.println("Alamgir");
    }

}
