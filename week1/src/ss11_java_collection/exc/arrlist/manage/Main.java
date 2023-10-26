package ss11_java_collection.exc.arrlist.manage;

import ss11_java_collection.exc.arrlist.controller.ProductController;
import ss11_java_collection.exc.arrlist.model.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Integer id;
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
                    id = inputId();
                    product = inputInformation();
                    product.setCode(id);
                    productController.addProduct(product);
                    System.out.println("Them moi thanh cong");
                    break;
                case 2:
                    productController.editProduct();
                    break;
                case 3:
                    productController.deleteProduct();
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
                    productController.searchProduct();
                    break;
                case 6:
                    //productController.addProduct();
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);
    }

    private static Integer inputId() {
        System.out.println("Nhap id san pham");
        return Integer.valueOf(scanner.nextLine());
    }
    private static Product inputInformation(){
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        Long price = Long.valueOf(scanner.nextLine());
        return new Product(name,price);
    }
}


