package com.example.repository;

import com.example.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findByAll();
    void addProduct(Student student);
    Student findById(int id);
    void update(int id , Student student);
    void delete(int id);
    List<Student> findName(String name);
}
