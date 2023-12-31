//package ss11_java_collection.exc.arrlist.repository;
//
//import ss11_java_collection.exc.arrlist.model.Product;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class ProductManager implements IProductRepository {
//    private static ArrayList<Product> products = new ArrayList<>();
//
//    static {
//        products.add(new Product(1, "Dien thoai", 56l));
//        products.add(new Product(2, "May tinh", 100l));
//        products.add(new Product(3, "Quan ao", 20l));
//    }
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void showList() {
//        for (Product s : products) {
//            System.out.println(s);
//        }
//    }
//
//    public void deleteProduct() {
//        Scanner sc = new Scanner(System.in);
//        int flag = 1;
//        int choice;
//        System.out.println("Nhập id muốn xóa");
//        int code = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getCode() == code) {
//                flag = 1;
//                System.out.println("Bạn có muốn xóa không:\n" +
//                        "1. Yes.\n" +
//                        "2. No.");
//                choice = Integer.parseInt(sc.nextLine());
//                switch (choice) {
//                    case 1:
//                        products.remove(i);
//                        break;
//                    case 0:
//                        System.out.println("Hẹn gặp lại");
//                        System.exit(1);
//                }
//            }
//        }
//        if (flag != 1) {
//            System.out.println("Không tồn tại id này");
//        }
//    }
//
//    public void searchProduct() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tên sản phẩm bạn muốn tìm kiếm");
//        String nameProduct = sc.nextLine();
//        boolean isFlag = false;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getNameProduct().equals(nameProduct)) {
//                System.out.println("Sản phẩm bạn đang tìm kiếm: ");
//                System.out.println(products.get(i).toString());
//                isFlag = true;
//            }
//        }
//        if (!isFlag) {
//            System.out.println("Không có sản phẩm");
//        }
//    }
//
//    public void editProduct() {
//        int codeProduct;
//        String nameProduct;
//        double priceProduct;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập id sản phẩm muốn sửa");
//        int choice = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getCode() == choice) {
//                System.out.println("Nhập id sản phẩm");
//                codeProduct = Integer.parseInt(sc.nextLine());
//                System.out.println("Nhập tên sản phẩm");
//                nameProduct = sc.nextLine();
//                System.out.println("Nhập giá sản phẩm");
//                priceProduct = Double.parseDouble(sc.nextLine());
//                products.get(i).setCode(codeProduct);
//                products.get(i).setNameProduct(nameProduct);
//                //  arrayList.get(i).setPrice(priceProduct);
//            }
//        }
//    }
//
//
//    public void arrangeToUpper() {
//        Comparator comparator = new Comparetor(true);
//        Collections.sort(products, comparator);
//    }
//
//    public void arrangeToLower() {
//        Comparator comparator = new Comparetor(false);
//        Collections.sort(products, comparator);
//    }
//
//    public void arrangeProduct() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Chọn thứ tự muốn sắp xếp \n" + "1. Sắp xếp tăng dần \n" +
//                "2. Sắp xếp giảm dần");
//        int choice = Integer.parseInt(sc.nextLine());
//        switch (choice) {
//            case 1:
//                arrangeToUpper();
//                break;
//            case 2:
//                arrangeToLower();
//                break;
//        }
//    }
//}
