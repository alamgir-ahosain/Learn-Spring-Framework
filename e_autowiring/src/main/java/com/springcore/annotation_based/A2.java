package com.springcore.annotation_based;

import org.springframework.beans.factory.annotation.Autowired;

public class A2 {

    @Autowired // 1. Field / Properties Injection
    private B2 bClass;

    public A2() {

    }

    @Autowired // 2. Constructor Injection
    public A2(B2 bClass) {
        this.bClass = bClass;
        System.out.println("Inside Constructor ");

    }

    @Autowired // 3. Setter Injection
    public void setbClass(B2 bClass) {
        System.out.println("Inside Setter");
        this.bClass = bClass;
    }

    public B2 getbClass() {
        return bClass;

    }

    @Override
    public String toString() {
        return "A2 [bClass=" + bClass + "]";
    }

}
