package com.springjdbc.crud.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.crud.model.Student;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String qString = "insert into studentTable values(?,?,?)";
        int r = this.jdbcTemplate.update(qString, student.getId(), student.getName(), student.getEmail());
        return r;
        // throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
