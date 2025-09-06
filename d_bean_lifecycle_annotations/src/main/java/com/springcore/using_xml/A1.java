package com.springcore.using_xml;

public class A1 {
    private String name;

    public A1() {

    }

    public A1(String name) {
        System.out.println("In Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "A1 [name=" + this.name + "]";
    }

    public void init() {
        System.out.println("Bean Initialized");
    }

    public void destroy() {
        System.out.println("Bean Destroyed");
    }

}
