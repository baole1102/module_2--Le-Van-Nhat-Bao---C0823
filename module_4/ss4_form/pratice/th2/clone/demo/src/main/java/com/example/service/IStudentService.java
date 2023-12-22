package com.example.service;

import com.example.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findByAll();
    void addProduct(Student student);
    Student findById(int id);
    void update(int id , Student student);
    void delete(int id);
    List<Student> findName(String name);
}
