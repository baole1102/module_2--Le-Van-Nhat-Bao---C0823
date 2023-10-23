package bt_them.service;

import bt_them.repository.IStudentManageProgramRepository;
import bt_them.repository.StudentManageProgramRepository;

public class StudentManageProgramService implements IStudentManageProgramService {
    private IStudentManageProgramRepository iStudentManageProgramRepository = new StudentManageProgramRepository();

    @Override
    public void addOffice() {
        iStudentManageProgramRepository.addOffice();
    }

    @Override
    public void addStudent() {
        iStudentManageProgramRepository.addStudent();
    }

    @Override
    public void deleteOffice() {
        iStudentManageProgramRepository.deleteOffice();
    }

    @Override
    public void showList() {
        iStudentManageProgramRepository.showList();
    }

    @Override
    public void add() {
        iStudentManageProgramRepository.add();
    }
}
