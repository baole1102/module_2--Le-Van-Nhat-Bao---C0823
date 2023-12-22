package com.example.service;

import com.example.model.Student;
import com.example.repository.IStudentRepository;
import com.example.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private static final IStudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> findByAll() {
        return studentRepository.findByAll();
    }

    @Override
    public void addProduct(Student student) {
        studentRepository.addProduct(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void update(int id, Student student) {
        studentRepository.update(id, student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

    @Override
    public List<Student> findName(String name) {
        return studentRepository.findName(name);
    }
}
