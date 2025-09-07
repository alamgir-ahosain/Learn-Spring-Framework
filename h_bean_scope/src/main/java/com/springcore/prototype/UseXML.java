package com.springcore.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customBeanName")
public class UseXML {
    @Value("Alamgir")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UseXML [name=" + name + "]";
    }

}
