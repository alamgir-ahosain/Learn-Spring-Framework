package com.springcore.annotation_based.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.springcore.annotation_based")
public class AppConfig {

    @Bean
    public Address collegeAddress() {
        Address address = new Address();
        System.out.println("College Address");
        address.setName("Collegee");
        return address;
    }
   

  //  @Primary // default bean object
    @Bean
    public Address primaryAddress() {
        Address address = new Address();
        System.out.println("primary Address");
        return address;
    }

}
