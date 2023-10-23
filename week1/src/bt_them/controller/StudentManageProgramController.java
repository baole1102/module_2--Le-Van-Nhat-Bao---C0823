package bt_them.controller;

import bt_them.service.IStudentManageProgramService;
import bt_them.service.StudentManageProgramService;

public class StudentManageProgramController {
    private IStudentManageProgramService iStudentManageProgramService = new StudentManageProgramService();


    public void addOffice() {
        iStudentManageProgramService.addOffice();
    }


    public void addStudent() {
        iStudentManageProgramService.addStudent();
    }


    public void deleteOffice() {
        iStudentManageProgramService.deleteOffice();
    }


    public void showList() {
        iStudentManageProgramService.showList();
    }
    public void add(){iStudentManageProgramService.add();}
}
