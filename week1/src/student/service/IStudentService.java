package student.service;

import student.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> showList();

    boolean findId(String id);

    void addStudent(Student student);

    boolean remove(String id);

    void editStudent(String id, Student student);

    List<Student> findName(String name);
}
