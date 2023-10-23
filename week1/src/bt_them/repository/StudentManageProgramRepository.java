package bt_them.repository;

import bt_them.model.StudentManageProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageProgramRepository implements IStudentManageProgramRepository {
    ArrayList<StudentManageProgram> studentManagePrograms = new ArrayList<>();

    @Override
    public void addOffice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã giảng viên");
        int codeOffice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên giảng viên");
        String nameOffice = sc.nextLine();
        System.out.println("Nhập ngày sinh giảng viên");
        int dateOffice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính giảng viên");
        String genderOffice = sc.nextLine();
        System.out.println("Nhập chuyên môn giảng viên");
        String specializeOffice = sc.nextLine();
        StudentManageProgram manageProgramOffice = new StudentManageProgram(codeOffice, nameOffice, dateOffice, genderOffice, specializeOffice);
        studentManagePrograms.add(manageProgramOffice);
    }

    @Override
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên");
        int codeOffice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên sinh viên");
        String nameOffice = sc.nextLine();
        System.out.println("Nhập ngày sinh sinh viên");
        int dateOffice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính sinh viên");
        String genderOffice = sc.nextLine();
        System.out.println("Nhập lớp sinh viên");
        int className = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập điểm sinh viên");
        int score = sc.nextInt();
        StudentManageProgram manageProgramStudent = new StudentManageProgram(codeOffice, nameOffice, dateOffice, genderOffice, className, score);
        studentManagePrograms.add(manageProgramStudent);
    }


    @Override
    public void deleteOffice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên/giảng viên");
        int code = sc.nextInt();
        sc.nextLine();
        int flag = 1;
        for (int i = 0; i < studentManagePrograms.size(); i++) {
            if (studentManagePrograms.get(i).getCode() == code) {
                flag = 1;
                System.out.println("Vui lòng chọn chức năng:\n" +
                        "1. Yes.\n" +
                        "2. No.");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        studentManagePrograms.remove(i);
                        break;
                    case 2:
                        System.out.println("Hẹn gặp lại");
                        System.exit(1);
                        break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Không có sinh viên/ giảng viên này");
        }
    }

    @Override
    public void showList() {
        for (StudentManageProgram s : studentManagePrograms) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng chọn chức năng:\n" +
                "1. Sinh viên.\n" +
                "2. Giảng viên.");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                addOffice();
                break;
        }
    }
}
