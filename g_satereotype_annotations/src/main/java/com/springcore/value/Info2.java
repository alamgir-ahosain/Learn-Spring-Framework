package com.springcore.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customBeanName")
public class Info2 {

    @Value("Alamgir")
    private String id;
    @Value("Ce21012")
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
