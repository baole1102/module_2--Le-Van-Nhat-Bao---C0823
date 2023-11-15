package student.service;

import student.model.Student;
import student.reponsibility.IStudentReponsibility;
import student.reponsibility.StudentReponsibility;

import java.util.List;

public class StudentService implements IStudentService {
    private static IStudentReponsibility iStudentReponsibility =new StudentReponsibility();

    @Override
    public List<Student> showList() {
        return iStudentReponsibility.showList();
    }

    @Override
    public boolean findId(String id) {
        return iStudentReponsibility.findId(id);
    }

    @Override
    public void addStudent(Student student) {
        iStudentReponsibility.addStudent(student);
    }

    @Override
    public boolean remove(String id) {
        boolean student = iStudentReponsibility.findId(id);
        if (!student) {
            return false;
        } else {
            iStudentReponsibility.remove(id);
            return true;
        }
    }

    @Override
    public void editStudent(String id, Student student) {
        iStudentReponsibility.editStudent(id,student);

    }

    @Override
    public List<Student> findName(String name) {
        return iStudentReponsibility.findName(name);
    }
}
