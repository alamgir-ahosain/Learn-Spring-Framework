package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionsConfig.xml");
        Info inf = (Info) context.getBean("info1");
        System.out.println(inf.getName());
        System.out.println(inf.getInfoList());
        System.out.println(inf.getInfoSet());
        System.out.println(inf.getInfoMap());
        System.out.println(inf.getInfoProperties());

    }
}
