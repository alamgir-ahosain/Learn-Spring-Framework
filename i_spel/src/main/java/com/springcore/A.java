package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customA")
public class A {

    @Value("#{10+2}") // Injecting values
    private int x;

    @Value("#{beanB.name}") // Accessing bean properties
    private String y;

    @Value("#{T(java.lang.Math).sqrt(16)}") // accessing static method
    private double squareRoot;

    @Value("#{T(java.lang.Math).PI}") // accessing static variable
    private double pi;

  
    @Value("#{new String('CE21012')}") //create instance 
    private String id;

    @Value("#{55>12}")
    private boolean isAlive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public void setSquareRoot(double squareRoot) {
        this.squareRoot = squareRoot;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "A [x=" + x + ", y=" + y + ", squareRoot=" + squareRoot + ", pi=" + pi + ", id=" + id + ", isAlive="
                + isAlive + "]";
    }

 

}
