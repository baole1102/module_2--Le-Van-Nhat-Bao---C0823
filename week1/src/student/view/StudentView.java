package student.view;

import student.controller.StudentController;
import student.model.Student;
import student.until.Validate;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    static StudentController studentController = new StudentController();
    static int choice;
    static String id;
    static Student student;
    static boolean isBoolean;
    private static final Scanner sc = new Scanner(System.in);
    static List<Student> students;

    public static void main(String[] args) {
        do {
            System.out.println("-----Student------");
            System.out.println("1. Showlist \n" +
                    "2. Add Student \n" +
                    "3. Remove Student \n" +
                    "4. Edit Student \n" +
                    "5. Find name ");
            choice = Validate.checkChoice(1,5);
            switch (choice) {
                case 1:
                    students = StudentController.showList();
                    if (students.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 2:
                    students = StudentController.showList();
                    do {
                        id = inputId();
                        isBoolean = studentController.findId(id);
                        if (isBoolean) {
                            System.out.println("Id trùng rồi");
                        } else {
                            student = inputInfor();
                            student.setId(id);
                            studentController.addStudent(student);
                            System.out.println("Thêm thành công");
                        }
                    }while (isBoolean);
                    break;
                case 3:
                    students = StudentController.showList();
                    if (students.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        id = inputId();
                        isBoolean = checkYesNo(id);
                        if (isBoolean) {
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Không tìm thấy Id");
                        }
                    }
                    break;
                case 4:
                    students = StudentController.showList();
                    if (students.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        do {
                            id = inputId();
                            isBoolean = studentController.findId(id);
                            if (isBoolean) {
                                student = inputInfor();
                                student.setId(id);
                                studentController.editStudent(id, student);
                                System.out.println("Sửa thành công");
                            } else {
                                System.out.println("Không tìm thấy id");
                            }
                        }while (isBoolean);
                    }
                    break;
                case 5:
                    students = StudentController.showList();
                    if (students.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        System.out.println("Nhập tên student muốn tìm");
                        String name = sc.nextLine();
                        students = studentController.findName(name);
                        if (students == null) {
                            System.out.println("Không có student nào");
                        }else {
                            for (Student student1 : students) {
                                System.out.println(student1);
                            }
                            break;
                        }
                    }
                    break;
            }
        } while (true);
    }

    private static boolean checkYesNo(String id) {
        do {
            System.out.println("Bạn có muỗn xóa không");
            System.out.println("1. Yes");
            System.out.println("2. No");
            choice = Validate.checkChoice(1,2);
            switch (choice) {
                case 1:
                    isBoolean = studentController.remove(id);
                    return isBoolean;
                case 2:
                    return isBoolean;
            }
        } while (true);
    }

    private static Student inputInfor() {
        System.out.println("Nhập tên student");
        String name = Validate.checkName();
        System.out.println("Nhập ngày student");
        String date = Validate.checkDate();
        String gender = gender();
        System.out.println("Nhập điểm student");
        int score = Validate.checkScore();
        System.out.println("Nhập lớp student");
        String nameClass = Validate.checkName();
        return new Student(name, date, gender, score, nameClass);

    }

    private static String inputId() {
        System.out.println("Nhập id");
        return Validate.checkId();
    }
    private static String gender(){
        do {
            System.out.println("Chọn giới tính");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            choice = Validate.checkChoice(1,2);
            switch (choice){
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
            }
        }while (true);
    }
}
