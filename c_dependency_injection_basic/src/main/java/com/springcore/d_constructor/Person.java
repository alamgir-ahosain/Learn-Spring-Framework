package com.springcore.d_constructor;

import java.util.List;

public class Person {
    private String id;
    private Information inf;
    private List<String> list;

    public Person() {

    }

    public Person(String id, Information inf, List<String> list) {
        this.id = id;
        this.inf = inf;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", inf=" + inf + ", list=" + list + "]";
    }

}
