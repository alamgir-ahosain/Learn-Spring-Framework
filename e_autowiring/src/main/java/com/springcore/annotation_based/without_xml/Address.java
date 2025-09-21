package com.springcore.annotation_based.without_xml;
import org.springframework.stereotype.Component;

@Component("universityAddress")
public class Address {
    private String name;
   


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
