package com.springjdbc.without_xml_use_autowire_nnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.springjdbc.without_xml_use_autowire_nnotation.dao" })
public class config {
    @Bean(name = "dataSourceBean")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbcDB");
        ds.setUsername("root");
        ds.setPassword("mysql");
        return ds;
    }

    @Bean(name = "beanJdbc")
    public JdbcTemplate gJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

}
