package ss8_cleancode.exc.bt2.controller;
import ss8_cleancode.exc.bt2.service.IStudentService;
import ss8_cleancode.exc.bt2.service.StudentService;
public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public void showList(){
        iStudentService.showList();
    }
    public void addStudent(){
        iStudentService.addStudent();
    }
    public void deleteStudent(){
        iStudentService.deleteStudent();
    }
    public void editStudent(){
        iStudentService.editStudent();
    }

}
