package com.springjdbc.crud.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.crud.model.Student;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertStudent(Student student) {
        String qString = "insert into studentTable values(?,?,?)";
        int r = this.jdbcTemplate.update(qString, student.getId(), student.getName(), student.getEmail());
        return r;
        // throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public int updateStudent(Student student) {
        String qString = "update studentTable set name=?,email=? where id=?";
        int r = this.jdbcTemplate.update(qString, student.getName(), student.getEmail(), student.getId());
        return r;
    }
     @Override
    public int deleteStudent(int id) {
        String qString = "delete from studentTable where id=?";
        int r = this.jdbcTemplate.update(qString,id);
        return r;
    }

}
