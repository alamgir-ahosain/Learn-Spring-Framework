package com.springcore.e_constructor_Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorAmbiguityConfig.xml");

        Addition addition = (Addition) context.getBean("add");
        addition.addFunc();

    }
}
