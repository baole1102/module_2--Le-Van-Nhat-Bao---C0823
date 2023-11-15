package student.reponsibility;

import student.model.Student;
import student.until.ReadandWrite;

import java.util.ArrayList;
import java.util.List;

public class StudentReponsibility implements IStudentReponsibility {
    private static final List<Student> students = ReadandWrite.readFile();
    @Override
    public List<Student> showList() {
        return students;
    }

    @Override
    public boolean findId(String id) {
        for (Student student : students){
            if (student.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        ReadandWrite.writeFile(students);
    }

    @Override
    public void remove(String id) {
        for (Student student : students){
            if (student.getId().equals(id)){
                students.remove(student);
                break;
            }
        }
        ReadandWrite.writeFile(students);
    }

    @Override
    public void editStudent(String id, Student student) {
        for (Student student1 : students){
            if (student1.getId().equals(id)){
                student1.setId(id);
                student1.setName(student.getName());
                student1.setDate(student.getDate());
                student1.setGender(student.getGender());
                student1.setScore(student.getScore());
                student1.setNameClass(student.getNameClass());
                break;
            }
        }
        ReadandWrite.writeFile(students);
    }

    @Override
    public List<Student> findName(String name) {
        List<Student> students1 = new ArrayList<>();
        for (Student student : students){
            if (student.getName().toLowerCase().contains(name.toLowerCase())){
                students1.add(student);
            }
        }
        return students1;
    }
}
