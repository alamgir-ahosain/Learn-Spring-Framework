package com.springcore.e_constructor_Ambiguity;

public class Addition {

    private int a;
    private int b;

    public Addition(String a, int b) {
        System.out.println("string , int");
        this.a = Integer.parseInt(a);
        this.b = b;
    }

    public Addition(int a, String b) {
        System.out.println("int , string ");
        this.a = a;
        this.b = Integer.parseInt(b);
    }

    public Addition(int aName, int bName) {
        System.out.println("int , int");
        this.a = aName;
        this.b = bName;
    }

    public Addition(double a, double b) {
        System.out.println("double , double");
        this.a = (int) a;
        this.b = (int) b;
    }

    public Addition(float a, float b) {
        System.out.println("float , float");
        this.a = (int) a;
        this.b = (int) b;
    }

    public Addition(String a, String b) {
        System.out.println("string , string");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    public void addFunc() {
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
        System.out.println("Addition :" + (this.a + this.b));
    }

}
