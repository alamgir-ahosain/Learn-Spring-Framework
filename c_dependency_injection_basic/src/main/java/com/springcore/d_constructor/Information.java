package com.springcore.d_constructor;

public class Information {
    private String name;

    public Information() {

    }

    public Information(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Information [name=" + name + "]";
    }

}
