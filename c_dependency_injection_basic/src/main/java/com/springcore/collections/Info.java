package com.springcore.collections;

import java.util.*;

public class Info {
    private String name;
    private List<String> infoList;
    private Set<String> infoSet;
    private Map<String, String> infoMap;
    private Properties infoProperties;

    // Default constructor required by Spring
    public Info() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<String> infoList) {
        this.infoList = infoList;
    }

    public Set<String> getInfoSet() {
        return infoSet;
    }

    public void setInfoSet(Set<String> infoSet) {
        this.infoSet = infoSet;
    }

    public Map<String, String> getInfoMap() {
        return infoMap;
    }

    public void setInfoMap(Map<String, String> infoMap) {
        this.infoMap = infoMap;
    }

    public Properties getInfoProperties() {
        return infoProperties;
    }

    public void setInfoProperties(Properties props) {
        this.infoProperties = props;
    }

    public Info(String name, List<String> infoList, Set<String> infoSet, Map<String, String> infoMap,
            Properties infoProperties) {
        this.name = name;
        this.infoList = infoList;
        this.infoSet = infoSet;
        this.infoMap = infoMap;
        this.infoProperties = infoProperties;
    }

}
