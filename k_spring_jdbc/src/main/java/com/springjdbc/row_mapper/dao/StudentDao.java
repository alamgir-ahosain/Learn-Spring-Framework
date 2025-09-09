package com.springjdbc.row_mapper.dao;

import java.util.List;

import com.springjdbc.row_mapper.model.Student;

public interface StudentDao {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);
    public Student getStudentById(int id);
    public Student getStudentByIdAnother(int id);
    public List<Student> getAllStudent();

    

}
