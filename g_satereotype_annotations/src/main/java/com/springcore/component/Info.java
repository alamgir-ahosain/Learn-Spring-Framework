package com.springcore.component;

import org.springframework.stereotype.Component;

@Component
public class Info {

    private String id;
    private String name;

   

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Info [id=" + id + ", name=" + name + "]";
    }

}
