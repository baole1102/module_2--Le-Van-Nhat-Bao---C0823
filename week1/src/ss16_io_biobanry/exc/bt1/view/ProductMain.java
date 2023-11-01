package ss16_io_biobanry.exc.bt1.view;

import ss16_io_biobanry.exc.bt1.controller.ProductController;
import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.util.CheckCondintion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CheckCondintion checkCondintion = new CheckCondintion();
    private static List<Product> products;
    private static Product product;

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int id;
        int choice;
        do {
            System.out.println("Quan ly san pham");
            System.out.println("-----------------------");
            System.out.println("1. Xem thong tin san pham \n" +
                    "2. Them san pham \n" +
                    "3. Tim kiem san pham \n" +
                    "4. Thoat");
             choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProduct(productController);
                    break;
                case 2:
                    addProduct(productController);
                    break;
                case 3:
                    searchProduct(productController);
                    break;
                case 4:
                    System.out.println("Hen gap lai");
                    System.exit(1);
                case 5:

                    break;
            }
        } while (true);
    }

    private static void showProduct(ProductController productController) {
        products = productController.showList();
        if (products.isEmpty()){
            System.out.println("Danh sach rong!!");
        }else {
        if (products == null){
            System.out.println("Danh sach rong!!!");
        }else {
            for (Product temp: products){
                System.out.println(temp);
            }
        }
        }
    }

    private static void addProduct(ProductController productController) {
        int id;
        id = inputId();
        product = inputInfor();
        product.setId(id);
        productController.addProduct(product);
        System.out.println("Them thanh cong");
    }

    private static void searchProduct(ProductController productController) {
            System.out.println("Nhap ten san pham muon tim");
            String name = CheckCondintion.checkName();
            products =  productController.findName(name);
            if (product == null){
                System.out.println("Khong co san pham");
            }else {
                System.out.println("San pham cua ban dang tim!!");
                for (Product product1: products) {
                    System.out.println(product1);
                }
            }
    }

    private static Product inputInfor() {
        System.out.println("Nhap ten san pham");
        String name = CheckCondintion.checkName();
        System.out.println("Nhap gia san pham");
        Double price = CheckCondintion.checkPrice();
        System.out.println("Nhap hang san xuat");
        String address = CheckCondintion.checkName();
        System.out.println("Nhap mo ta san pham");
        String description = CheckCondintion.checkName();
        return new Product(name, price, address, description);
    }

    private static int inputId() {
        System.out.println("Nhap id san pham");
       return   CheckCondintion.checkId();
    }

}
