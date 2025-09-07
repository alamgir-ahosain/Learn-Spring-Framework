package com.springcore.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // stereotype (registers the bean)
@Scope("prototype") // modifies its lifecycle
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
