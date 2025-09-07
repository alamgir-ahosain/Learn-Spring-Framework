package com.springcore.java_code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.java_code")
public class AppConfig {

    @Bean
    public B2 getB2() {
        return new B2();
    }

    // @Bean // object return to the IoC Container
    @Bean(name = {"beanName1","beanName2","beanName3"})
    public A2 getA2() {
        A2 a2 = new A2(getB2());
        return a2;
    }
}