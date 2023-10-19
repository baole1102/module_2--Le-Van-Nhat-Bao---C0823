package ss8_cleancode.exc.bt2.view;
import java.util.Scanner;
import ss8_cleancode.exc.bt2.controller.StudentController;
public class CodegymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        do{
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Xem danh sách.\n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Sửa học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Thoát chương trình");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentController.showList();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    // sua
                    break;
                case 4:
                    //xoa
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        }while (true);

    }
}
