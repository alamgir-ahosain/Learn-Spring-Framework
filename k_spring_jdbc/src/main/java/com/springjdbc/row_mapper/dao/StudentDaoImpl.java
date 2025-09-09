package com.springjdbc.row_mapper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.row_mapper.model.Student;

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
        int r = this.jdbcTemplate.update(qString, id);
        return r;
    }

    @Override
    public Student getStudentById(int id) {
        String query = "select * from studentTable where id=?";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        Student s = this.jdbcTemplate.queryForObject(query, rowMapper, id);
        return s;
    }

    @Override
    public Student getStudentByIdAnother(int id) {
        String query = "select * from studentTable where id=?";

        Student s = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                System.out.println("Mapping row number: " + rowNum);

                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
                return student;
            }
        }, id);

        return s;
    }

    // With lamda
    // @Override
    // public Student getStudentByIdAnother(int id) {
    // String query = "select * from studentTable where id=?";
    // return this.jdbcTemplate.queryForObject(query,
    // (rs, rowNum) -> new Student(rs.getInt(1), rs.getString(2), rs.getString(3)),
    // id);
    // }

    @Override
    public List<Student> getAllStudent() {
        String query = "select * from studentTable";
        RowMapper<Student> rowMapper = new StudentRowMapper();

        List<Student> s = this.jdbcTemplate.query(query, rowMapper);
        // List<Student> s = this.jdbcTemplate.query(query, new StudentRowMapper());

        return s;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAllStudent'");
    }

}
