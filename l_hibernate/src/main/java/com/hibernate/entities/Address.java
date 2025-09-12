package com.hibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "addressTbl")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;

    @ManyToOne // Many addresses can belong to one student
    @JoinColumn(name = "studentId", nullable = false)
    private Student studentField;

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return studentField;
    }

    public void setStudent(Student student) {
        this.studentField = student;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", city=" + city + ", student=" + studentField + "]";
    }

}
