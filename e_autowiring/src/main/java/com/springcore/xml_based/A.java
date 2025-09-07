package com.springcore.xml_based;

public class A {
    private B bClass;

    public A() {

    }

    public A(B bClass) {
        this.bClass = bClass;
        System.out.println("Inside Constructor ");

    }

    public B getbClass() {
        return bClass;

    }

    public void setbClass(B bClass) {
        System.out.println("Inside Setter");
        this.bClass = bClass;
    }

    @Override
    public String toString() {
        return "A [bClass=" + bClass + "]";
    }

}
