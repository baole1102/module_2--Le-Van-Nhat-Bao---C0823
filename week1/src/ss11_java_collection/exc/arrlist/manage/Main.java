package ss11_java_collection.exc.arrlist.manage;

import ss11_java_collection.exc.arrlist.controller.ProductController;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do {
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Sửa thông tin sản phẩm. \n" +
                    "3. Xóa sản phẩm. \n" +
                    "4. Hiển thị sản phẩm. \n" +
                    "5. Tìm kiếm sản phẩm. \n" +
                    "6. Sắp xếp sản phẩm. \n" +
                    "7. Thoát. \n");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productController.addProduct();
                    break;
                case 2:
                    productController.editProduct();
                    break;
                case 3:
                    productController.deleteProduct();
                    break;
                case 4:
                    productController.showList();
                    break;
                case 5:
                    productController.searchProduct();
                    break;
                case 6:
                    productController.addProduct();
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);
    }
}


