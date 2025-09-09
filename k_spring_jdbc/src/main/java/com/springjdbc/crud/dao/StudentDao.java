package com.springjdbc.crud.dao;

import com.springjdbc.crud.model.Student;

public interface StudentDao {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);

}
