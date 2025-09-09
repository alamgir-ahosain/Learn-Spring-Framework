package com.springjdbc.without_xml_use_autowire_nnotation.dao;
import java.util.List;
import com.springjdbc.without_xml_use_autowire_nnotation.model.Student;


public interface StudentDao {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);
    public Student getStudentById(int id);
    public Student getStudentByIdAnother(int id);
    public List<Student> getAllStudent();

    

}
