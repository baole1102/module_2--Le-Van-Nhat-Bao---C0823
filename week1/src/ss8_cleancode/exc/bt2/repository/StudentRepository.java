package ss8_cleancode.exc.bt2.repository;

import ss8_cleancode.exc.bt2.model.Student;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentRepository  implements IStudentRepository {
    ArrayList<Student> studentArrayList = new ArrayList<>();


    @Override
    public void showList() {
        for (Student s : studentArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id sinh vien");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        studentArrayList.add(student);

    }

    @Override
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id sinh vien can xoa");
        int identify = scanner.nextInt();
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == identify) {
                studentArrayList.remove(i);
            }
        }
    }

    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id sinh vien can sua");
        int identify = scanner.nextInt();
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == identify) {
                System.out.println("Nhap id sinh vien");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap ten sinh vien");
                String name = scanner.nextLine();
                studentArrayList.get(i).setId(id);
                studentArrayList.get(i).setName(name);
            }
        }
    }

}
