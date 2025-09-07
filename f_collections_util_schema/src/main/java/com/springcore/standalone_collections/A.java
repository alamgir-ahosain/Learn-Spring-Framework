package com.springcore.standalone_collections;

import java.util.*;

public class A {
    private List<String> myList;
    private Map<String, String> myMap;
    private Properties myProperties;

    public void setList(List<String> list) {
        this.myList = list;
    }

    public void setMap(Map<String, String> map) {
        this.myMap = map;
    }

    public void setProperties(Properties properties) {
        this.myProperties = properties;
    }

    public void showData() {
        System.out.println("List: " + myList);
        System.out.println("Map: " + myMap);
        System.out.println("Properties: " + myProperties);
    }
}
