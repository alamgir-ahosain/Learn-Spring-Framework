package com.springcore.xml_based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customA")
public class A {

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    @Value("Alamgir")
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Value("CE21012")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "A [name=" + name + ", id=" + id + "]";
    }

}
