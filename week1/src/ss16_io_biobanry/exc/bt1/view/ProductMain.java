package ss16_io_biobanry.exc.bt1.view;

import ss16_io_biobanry.exc.bt1.controller.ProductController;
import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.util.CheckCondintion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    private static Scanner scanner = new Scanner(System.in);
    private static CheckCondintion checkCondintion = new CheckCondintion();
    private static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Product product;
        int id;
        do {
            System.out.println("Quan ly san pham");
            System.out.println("-----------------------");
            System.out.println("1. Xem thong tin san pham \n" +
                    "2. Them san pham \n" +
                    "3. Tim kiem san pham \n" +
                    "4. Luu thong tin san pham vao file \n" +
                    "5. Thoat");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productController.showList();
                    break;
                case 2:
                    id = inputId();
                    product = inputInfor();
                    product.setId(id);
                    productController.addProduct(product);
                    System.out.println("Them thanh cong");
                    break;
                case 3:
                    if (products.isEmpty()){
                        System.out.println("Khong co san pham nao");
                    }else {
                        System.out.println("Nhap ten san pham muon tim");
                        String name = checkCondintion.checkName();
                        product = productController.findName(name);
                        if (product == null){
                            System.out.println("Khong co san pham");
                        }else {
                            System.out.println("San pham cua ban dang tim!!");
                            System.out.println(product);
                        }
                    }
                    break;
                case 4:
                    if (products.isEmpty()){
                        System.out.println("Khong co san pham nao!!!");
                        break;
                    }else {
                        System.out.println("Nhap ten file");
                        scanner.nextLine();
                        String nameFile = scanner.nextLine();
                        File file = new File(nameFile);
                        writeFile(file);
                    }
                    break;
                case 5:
                    System.out.println("Hen gap lai");
                    System.exit(1);
            }
        } while (true);
    }

    private static Product inputInfor() {
        System.out.println("Nhap ten san pham");
        String name = checkCondintion.checkName();
        System.out.println("Nhap gia san pham");
        Double price = checkCondintion.checkPrice();
        System.out.println("Nhap hang san xuat");
        String address = checkCondintion.checkName();
        System.out.println("Nhap mo ta san pham");
        String description = checkCondintion.checkName();
        return new Product(name, price, address, description);
    }

    private static int inputId() {
        System.out.println("Nhap id san pham");
        while (true){
            int id =  checkCondintion.checkId();
            boolean isBoolean = false;
            for (Product product: products){
                if (product.getId() == id){
                    System.out.println("Trung id san pham khac roi");
                    isBoolean = true;
                    break;
                }
            }
            if (!isBoolean){
                return id;
            }
        }

    }
    private static void writeFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Product product1: products) {
                oos.writeObject(product1);
            }
            oos.flush();
            oos.close();
            System.out.println("Luu thanh cong");
        }catch (Exception e){
            System.out.println("File ton tai");
            e.printStackTrace();
        }
    }
}
