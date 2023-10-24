package ss11_java_collection.exc.arrlist.repository;


import ss11_java_collection.exc.arrlist.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager implements IProductRepository {
   private static ArrayList<Product> arrayList = new ArrayList<>();

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm");
        int codeProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double priceProduct = Double.parseDouble(sc.nextLine());
        Product product = new Product(codeProduct, nameProduct, priceProduct);
        arrayList.add(product);
    }

    public void showList() {
        for (Product s : arrayList) {
            System.out.println(s);
        }
    }

    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        int choice;
        System.out.println("Nhập id muốn xóa");
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCode() == code) {
                flag = 1;
                System.out.println("Bạn có muốn xóa không:\n" +
                        "1. Yes.\n" +
                        "2. No.");
                 choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        arrayList.remove(i);
                        break;
                    case 0:
                        System.out.println("Hẹn gặp lại");
                        System.exit(1);
                }
            }
        }
        if (flag != 1) {
            System.out.println("Không tồn tại id này");
        }
    }

    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên sản phẩm bạn muốn tìm kiếm");
        String nameProduct = sc.nextLine();
        int flag = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            flag = 1;
            if (arrayList.get(i).getNameProduct().equals(nameProduct)) {
                System.out.println("Sản phẩm bạn đang tìm kiếm: ");
                System.out.println(arrayList.get(i).toString());
                break;
            }
        }
        if (flag != 1) {
            System.out.println("Không có sản phẩm");
        }
    }

    public void editProduct() {
        int codeProduct;
        String nameProduct;
        double priceProduct;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn sửa");
        int choice = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCode() == choice) {
                System.out.println("Nhập id sản phẩm");
                codeProduct = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tên sản phẩm");
                nameProduct = sc.nextLine();
                System.out.println("Nhập giá sản phẩm");
                priceProduct = Double.parseDouble(sc.nextLine());
                arrayList.get(i).setCode(codeProduct);
                arrayList.get(i).setNameProduct(nameProduct);
                arrayList.get(i).setPrice(priceProduct);
            }
        }
    }


    public void ArrangeToUpper() {
        Comparator comparator = new Comparetor(true);
        Collections.sort(arrayList, comparator);
    }

    public void ArrangToLower() {
        Comparator comparator = new Comparetor(false);
        Collections.sort(arrayList, comparator);
    }

    public void Arrange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn thứ tự muốn sắp xếp \n" + "1. Sắp xếp tăng dần \n" +
                "2. Sắp xếp giảm dần");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                ArrangeToUpper();
                break;
            case 2:
                ArrangToLower();
                break;
        }
    }
}
