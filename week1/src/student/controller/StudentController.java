package student.controller;

import student.model.Student;
import student.service.IStudentService;
import student.service.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();

    public static List<Student> showList() {
        return iStudentService.showList();
    }

    public boolean findId(String id) {
        return iStudentService.findId(id);
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public boolean remove(String id) {
        return iStudentService.remove(id);
    }

    public void editStudent(String id, Student student) {
        iStudentService.editStudent(id,student);
    }

    public List<Student> findName(String name) {
        return iStudentService.findName(name);
    }
}
