package ss8_cleancode.exc.bt2.service;
import ss8_cleancode.exc.bt2.repository.IStudentRepository;
import ss8_cleancode.exc.bt2.repository.StudentRepository;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void showList() {
        iStudentRepository.showList();
    }

    @Override
    public void addStudent() {
        iStudentRepository.addStudent();
    }
}
