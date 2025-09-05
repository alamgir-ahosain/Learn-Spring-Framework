package com.springcore.reference;

public class A {
    private String id;
    private B classB;

    public A() {

    }

    public A(String id, B classB) {
        this.id = id;
        this.classB = classB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public B getClassB() {
        return classB;
    }

    public void setClassB(B classB) {
        this.classB = classB;
    }

    @Override
    public String toString() {
        return "A [id=" + id + ", classB=" + classB + "]";
    }

}
