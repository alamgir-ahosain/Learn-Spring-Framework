package com.springcore.value_with_collection;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customBeanA")
public class A {
    

    @Value("#{myListBean}")
    private List<String> myList;

    public void setList(List<String> list) {
        this.myList = list;
    }

    public void showData() {
        System.out.println("List: " + myList);

    }
}
