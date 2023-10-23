package bt_them.manage;

import bt_them.controller.StudentManageProgramController;

import java.util.Scanner;

public class StudentManageProgramView {
    public static void main(String[] args) {
        StudentManageProgramController studentManageProgramController = new StudentManageProgramController();
        do {
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Xem danh sách.\n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Xóa học viên. \n" +
                    "4. Thoát chương trình");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManageProgramController.showList();
                    break;
                case 2:
                    studentManageProgramController.add();
                    break;
                case 3:
                    studentManageProgramController.deleteOffice();
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);
    }
}
