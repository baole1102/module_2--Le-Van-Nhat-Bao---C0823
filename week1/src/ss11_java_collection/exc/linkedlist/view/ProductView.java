package ss11_java_collection.exc.linkedlist.view;

import ss11_java_collection.exc.linkedlist.controller.ProductController;
import ss11_java_collection.exc.linkedlist.module.Product;
import ss11_java_collection.exc.linkedlist.until.CheckExeption;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
  private static   CheckExeption checkExeption = new CheckExeption();

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

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct(productController);
                    break;
                case 2:
                    editProduct(productController);
                    break;
                case 3:
                    deleteProduct(productController);
                    break;
                case 4:
                    showList(productController);
                    break;
                case 5:
                    searchProduct(productController);
                    break;
                case 6:
                    arrangProduct(productController);
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);
    }

    private static void addProduct(ProductController productController) {
        Product product;
        Integer code;
        code = inputCode();
        product = inputInformation();
        product.setCode(code);
        productController.addProduct(product);
    }

    private static void arrangProduct(ProductController productController) {
        int choice;
        List<Product> products;
        System.out.println("1. Sap xep tang dan \n" + "2. Sap xep giam dan");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                productController.sortUpper();
                products = productController.showList();
                for (Product product : products) {
                    System.out.println(product);
                }
                break;
            case 2:
                productController.sortLower();
                products = productController.showList();
                for (Product product : products) {
                    System.out.println(product);
                }
                break;
        }
    }

    private static void searchProduct(ProductController productController) {
        String str;
        System.out.println("Nhap ten san pham muon tim");
        str = scanner.nextLine();
        productController.findName(str);
    }

    private static void showList(ProductController productController) {
        List<Product> products = productController.showList();
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong kho");
        } else {
            System.out.println("---------------");
            System.out.println("Danh sách sản phẩm");
            for (Product temp : products) {
                System.out.println(temp);
            }
        }
    }

    private static void editProduct(ProductController productController) {
        Product product;
        Integer code;
        code = inputCode();
        product = productController.findById(code);
        if (product != null) {
            // System.out.println("Ban co muon xoa"+ +"nay khong");
            productController.editProduct(code, inputInformation());
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Khong tim thay san pham");
        }
    }

    private static void deleteProduct(ProductController productController) {
        Integer code;
        int choice;
        Product product;
        code = inputCode();
        System.out.println("Ban co muon xoa san pham nay khong");
        System.out.println("1. Yes \n" + "2. No");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                product = productController.findById(code);
                if (product != null) {
                    System.out.println("Xoa thanh cong");
                } else {
                    System.out.println("Khong tim thay code");
                }
                break;
            case 2:
                System.out.println("Bye");
                System.exit(0);
        }
    }

    private static Product inputInformation() {
        System.out.println("Nhap ten san pham");
        String name = checkExeption.checkName();
        System.out.println("Nhap gia san pham");
        Long price = checkExeption.checkPrice();
        return new Product(name, price);
    }

    private static Integer inputCode() {
        System.out.println("Nhap id san pham");
        return checkExeption.checkId();
    }
}

