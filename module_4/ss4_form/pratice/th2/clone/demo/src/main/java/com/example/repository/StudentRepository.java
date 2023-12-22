package com.example.repository;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(0, "Bảo", "Nam", 22, "Huế"));
        students.add(new Student(1, "Vi", "Nữ", 18, "Đà Nẵng"));
        students.add(new Student(2, "Độ", "Nam", 21, "Quãng Nam"));
        students.add(new Student(3, "Kiệt", "Nam", 19, "Quãng Bình"));
    }

    @Override
    public List<Student> findByAll() {
        return students;
    }

    @Override
    public void addProduct(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Student student) {
        for (Student student1 : students) {
            if (student1.getId() == id) {
                student1.setId(id);
                student1.setName(student.getName());
                student1.setAddress(student.getAddress());
                student1.setAge(student.getAge());
                student1.setGender(student.getGender());
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student.getId());
                break;
            }
        }
    }

    @Override
    public List<Student> findName(String name) {
        List<Student> students1 = new ArrayList<>();
        for (Student product : students) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                students1.add(product);
            }
        }
        return students1;
    }
}
