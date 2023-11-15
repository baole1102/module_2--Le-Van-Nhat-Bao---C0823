package test.view;

import test.controller.CustomerController;
import test.model.Customer;
import test.until.CustomerValidate;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    static final Scanner sc = new Scanner(System.in);
    static List<Customer> customer;
    static CustomerController customerController = new CustomerController();
    static boolean isBoolean;
    static Customer customer1;
    static int choice;

    public static void main(String[] args) {
        String id;
        do {
            System.out.println("-----Customer-------");
            System.out.println("1. ShowList \n" +
                    "2. Add Customer \n" +
                    "3. Remove Customer \n" +
                    "4. Edit Customer \n" +
                    "5. Find name \n");
            System.out.print("Chọn số: ");
            choice = CustomerValidate.checkChoice(1, 5);
            switch (choice) {
                case 1:
                    customer = customerController.showList();
                    if (customer.isEmpty()) {
                        System.out.println("Rỗng");
                    }else {
                        for (Customer customer1 : customer) {
                            System.out.println(customer1);
                        }
                    }
                    break;
                case 2:
                    customer = customerController.showList();
                    do {
                        id = inputId();
                        isBoolean = customerController.findId(id);
                        if (isBoolean) {
                            System.out.println("Trùng id khác rồi");
                        }
                    } while (isBoolean);
                    customer1 = inputInfor();
                    customer1.setId(id);
                    customerController.addCustomer(customer1);
                    System.out.println("Thêm thành công");
                    break;
                case 3:
                    customer = customerController.showList();
                    if (customer.isEmpty()) {
                        System.out.println("Danh sách rong");
                    } else {
                        do {
                            id = inputId();
                            isBoolean = checkYN(id);
                            if (isBoolean) {
                                System.out.println("Xóa thành công");
                            } else {
                                System.out.println("Không tìm thấy id");
                            }
                        } while (!isBoolean);
                    }
                    break;
                case 4:
                    customer = customerController.showList();
                    if (customer.isEmpty()) {
                        System.out.println("Danh sách rong");
                    } else {
                        id = inputId();
                        isBoolean = customerController.findId(id);
                        if (isBoolean) {
                            customer1 = inputInfor();
                            customerController.editCustomer(id, customer1);
                            System.out.println("thêm thành công");
                        } else {
                            System.out.println("Không tìm thấy id");
                        }
                    }
                    break;
                case 5:
                    customer = customerController.showList();
                    if (customer.isEmpty()) {
                        System.out.println("Danh sách rong");
                    } else {
                        System.out.println("Nhập tên");
                        String name = CustomerValidate.checkName();
                        customer = customerController.findName(name);
                        for (Customer customer1 : customer) {
                            System.out.println(customer1);
                        }
                    }
                    break;
            }
        } while (true);
    }

    private static Customer inputInfor() {
        System.out.println("Nhập tên");
        String name = CustomerValidate.checkString();
        System.out.println("Nhập địa điểm");
        String location = CustomerValidate.checkString();
        System.out.println("Nhập ngày sinh");
        String date = CustomerValidate.checkString();
        System.out.println("Nhập lương");
        double saraly = Double.parseDouble(sc.nextLine());
        return new Customer(name, location, date, saraly);
    }

    private static String inputId() {
        System.out.println("Nhập id");
        return CustomerValidate.checkId();
    }

    private static boolean checkYN(String id) {
      while (true){
          System.out.println("Bạn có muốn xóa không");
          System.out.println("1. Yes");
          System.out.println("2. No");
          System.out.println("Nhập số");
          choice = CustomerValidate.checkChoice(1, 2);
          switch (choice) {
              case 1:
                  isBoolean = customerController.remove(id);
                  return isBoolean;
              case 2:
                  return isBoolean;
          }
      }
    }
}
