package cuoimodule2.view;

import cuoimodule2.controller.BugController;
import cuoimodule2.module.Bug;
import cuoimodule2.repository.BugRepository;
import cuoimodule2.until.Validate;

import java.util.List;
import java.util.Scanner;

public class BugView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BugController bugController = new BugController();
    static int choice;
    static Bug bug;
    static String id;
    static List<Bug> bugs;
    static boolean isBoolean;

    public static void main(String[] args) {
        do {
            System.out.println("-----Manage Bug------");
            System.out.println("1. ShowList Bug \n" +
                    "2. Add Bug \n" +
                    "3. Exit");
            choice = Validate.checkChoice(1, 3);
            switch (choice) {
                case 1:
                    bugs = bugController.showList();
                    if (bugs.isEmpty()) {
                        System.out.println("Không có lỗi bug nào!!!");
                    } else {
                        for (Bug bug : bugs) {
                            System.out.println(bug);
                        }
                    }
                    break;
                case 2:
                    bugs = bugController.showList();
                    id = inputId();
                    isBoolean = bugController.findId(id);
                    if (isBoolean) {
                        System.out.println("Trùng id bug khác rồi");
                    } else {
                        bug = inputInfor();
                        bug.setId(id);
                        bugController.addBug(bug);
                        System.out.println("Thêm thành công");
                    }
                    break;
                case 3:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
            }
        } while (true);
    }

    private static Bug inputInfor() {
        System.out.println("Nhập tên bug");
        String name = Validate.checkName();
        System.out.println("Nhập miêu tả bug");
        String description = Validate.checkName();
        System.out.println("Nhập thời gian bug");
        String time = scanner.nextLine();
        String dangerous = BugRepository.dangerous();
        return new Bug(name, description, time, dangerous);
    }

    private static String inputId() {
        System.out.println("Nhập id bug!!");
        return Validate.checkId();
    }

}
