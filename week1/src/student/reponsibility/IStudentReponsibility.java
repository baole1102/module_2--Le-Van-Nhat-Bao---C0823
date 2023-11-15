package student.reponsibility;

import student.model.Student;

import java.util.List;

public interface IStudentReponsibility {
    List<Student> showList();

    boolean findId(String id);

    void addStudent(Student student);

    void remove(String id);

    void editStudent(String id, Student student);

    List<Student> findName(String name);
}
