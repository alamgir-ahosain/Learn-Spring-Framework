package com.springjdbc.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.springjdbc.without_xml.dao.StudentDaoImpl;

@Configuration
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

    @Bean(name = "beanStudentDao")
    public StudentDaoImpl gStudentDaoImpl() {
        StudentDaoImpl st = new StudentDaoImpl();
        st.setJdbcTemplate(gJdbcTemplate());
        return st;
    }
}
