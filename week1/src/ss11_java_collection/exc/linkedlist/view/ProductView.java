package ss11_java_collection.exc.linkedlist.view;

import ss11_java_collection.exc.linkedlist.controller.ProductController;
import ss11_java_collection.exc.linkedlist.module.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        Integer code;
        String str;
        Product product;
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

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    code = inputCode();
                    product = inputInformation();
                    product.setCode(code);
                    productController.addProduct(product);

                    break;
                case 2:
                    System.out.println("Nhap id san pham ban muon sua");
                    choice = Integer.parseInt(scanner.nextLine());
                    product = inputInformation();
                    product.setCode(choice);
                    productController.editProduct(product);
                    break;
                case 3:
                    code = inputCode();
                    System.out.println("Ban co muon xoa san pham nay khong");
                    System.out.println("1. Yes \n"+"2. No");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            boolean isSuccess =   productController.removeProduct(code);
                            if (isSuccess){
                                System.out.println("Xoa thanh cong");
                            }else {
                                System.out.println("Khong tim thay code");
                            }
                            break;
                        case 2:
                            System.out.println("Bye");
                            System.exit(0);
                    }
                    break;
                case 4:
                    List<Product> products = productController.showList();
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
                case 5:
                    System.out.println("Nhap ten san pham muon tim");
                    str = scanner.nextLine();
                    productController.findName(str);
                    break;
                case 6:
                    System.out.println("1. Sap xep tang dan \n"+ "2. Sap xep giam dan");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            productController.sortUpper();
                            break;
                        case 2:
                            productController.sortLower();
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);
    }

    private static Product inputInformation() {
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        Long price = Long.valueOf(scanner.nextLine());
        return new Product(name,price);
    }

    private static Integer inputCode() {
        System.out.println("Nhap code san pham");
        return Integer.valueOf(scanner.nextLine());
    }
}

