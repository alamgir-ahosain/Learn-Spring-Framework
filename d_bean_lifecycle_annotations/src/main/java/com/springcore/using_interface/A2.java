package com.springcore.using_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A2 implements InitializingBean, DisposableBean {
    private String name;

    public A2() {

    }

    public A2(String name) {
        System.out.println("In Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "A1 [name=" + this.name + "]";
    }

    // called after dependencies are injected.
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is  Initialized");
    }

    // called when container shuts down.
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed");
    }

               // Using XML and init and destroy method
    // public void init() {
    // System.out.println("Bean is Initialized");
    // }

    // public void destroy() {
    // System.out.println("Bean is Destroyed");
    // }

}
