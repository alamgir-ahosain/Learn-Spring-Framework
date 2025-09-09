package com.springjdbc.row_mapper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.row_mapper.model.Student;

class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("Mapping row number: " + rowNum);

        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));
        return student;
        // throw new UnsupportedOperationException("Unimplemented method 'mapRow'");
    }

}
