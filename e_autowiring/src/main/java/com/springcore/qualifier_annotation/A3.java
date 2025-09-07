package com.springcore.qualifier_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A3 {

    // Field Injection
    @Autowired
    @Qualifier("bClass")
    private B3 fieldB;

    private B3 constructorB;
    private B3 setterB;

    // Constructor Injection
    @Autowired
    public A3(@Qualifier("bClass2") B3 constructorB) {
        this.constructorB = constructorB;
        System.out.println("Inside Constructor Injection");
    }

    // Setter Injection
    @Autowired
    public void setSetterB(@Qualifier("bClass3") B3 setterB) {
        System.out.println("Inside Setter Injection");
        this.setterB = setterB;
    }

    @Override
    public String toString() {
        System.out.println();
        return "A3 [fieldB=" + fieldB +
                ", constructorB=" + constructorB +
                ", setterB=" + setterB + "]";
    }
}
