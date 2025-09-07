package com.springcore.java_code;

public class A2 {
    private B2 b2;

    public void func() {
        this.b2.funcB2();;
        System.out.println("Alamgir");
    }

    public B2 getB2() {
        return b2;
    }

    public void setB2(B2 b2) {
        this.b2 = b2;
    }

    public A2(B2 b2) {
        this.b2 = b2;
    }

    public A2() {

    }
}
