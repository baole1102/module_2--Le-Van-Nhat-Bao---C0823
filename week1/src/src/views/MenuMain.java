package src.views;

import src.controllers.ProductController;
import src.models.Product;

import java.util.List;
import java.util.Scanner;

public class MenuMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("--------Menu---------");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Quản lý nhân viên");
            System.out.println("4. Quản lý bill");
            System.out.println("0. Exit");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuCustomer();
                    break;
                case 2:
                    menuProduct();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập không đúng lựa chọn");
            }
        }while (true);
    }
    private static void menuCustomer() {
        System.out.println("--------Menu quản lý khách hàng");
    }
    private static void menuProduct() {
        ProductController productController = new ProductController();
        int choice;
        Integer id;
        Product product;
        do {
            System.out.println("----------Menu quản lý sản phẩm--------");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("0. Trở về");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Product> products = productController.getAll();
                    if(products.isEmpty()) {
                        System.out.println("Không có sản phẩm nào trong kho");
                    } else {
                        System.out.println("---------------");
                        System.out.println("Danh sách sản phẩm");
                        for(Product temp: products) {
                            System.out.println(temp);
                        }
                    }
                    break;
                case 2:
                    id = inputId();
                    product = inputInformation();
                    product.setId(id);
                    productController.addProduct(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    id = inputId();
                    Boolean isSuccess = productController.removeProduct(id);
                    if(isSuccess) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Id không tìm thấy");
                    }
                    break;
                case 0:
                    return;
            }
        } while (true);

    }

    private static Product inputInformation() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Long price = Long.valueOf(scanner.nextLine());
        return new Product(name, price);
    }

    private static Integer inputId() {
        System.out.print("Nhập id sản phẩm: ");
        return Integer.valueOf(scanner.nextLine());
    }
}
