package com.springcore.using_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A3 {
    private String name;

    public A3() {

    }

    public A3(String name) {
        System.out.println("In Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "A3 [name=" + this.name + "]";
    }

    // Lifecycle method with Annotation
    @PostConstruct
    public void init() {
        System.out.println("Bean is Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean is Destroyed");
    }

    // // called after dependencies are injected.
    // @Override
    // public void afterPropertiesSet() throws Exception {
    // System.out.println("Bean is Initialized");
    // }

    // // called when container shuts down.
    // @Override
    // public void destroy() throws Exception {
    // System.out.println("Bean is destroyed");
    // }

    // Using XML and init and destroy method
    // public void init() {
    // System.out.println("Bean is Initialized");
    // }

    // public void destroy() {
    // System.out.println("Bean is Destroyed");
    // }

}
