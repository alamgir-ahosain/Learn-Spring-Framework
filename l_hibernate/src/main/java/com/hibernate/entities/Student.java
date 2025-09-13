package com.hibernate.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "studentTbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "studentField", cascade = CascadeType.ALL) // One Student has many addess
    private List<Address> address = new ArrayList<>();

    // constructor,setter and getter always must for Hibernet
    public Student() {

    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAddress(Address address) {
        address.setStudent(this);
        this.address.add(address);
    }

    public void removeAddress(Address addr) {
        addr.setStudent(null);
        this.address.remove(addr);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
