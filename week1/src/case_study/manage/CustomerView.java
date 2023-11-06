package case_study.manage;

import case_study.controller.CustomerController;
import case_study.model.modulePerson.Customer;
import case_study.untils.EmployeeCondition;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CustomerController customerController = new CustomerController();
    private static List<Customer> customers;
    private static Customer customer;
    private static boolean isBoolean;

    public static void managementCustomer() throws ParseException {
        int choice;
        String id;
        do {
            System.out.println("Function Manager");
            System.out.println("--------------------------");
            System.out.println("1. Display list customers \n" +
                    "2. Add new customers \n" +
                    "3. Edit customers \n" +
                    "4. Delete customers \n" +
                    "5. Search by name customers \n" +
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    customers = customerController.showList();
                    if (customers.isEmpty()) {
                        System.out.println("Nothing is this!!");
                    } else {
                        for (Customer customer1 : customers) {
                            System.out.println(customer1);
                        }
                    }
                    break;
                case 2:
                    customers = customerController.showList();
                    do {
                        id = inputIdCustomer();
                        isBoolean = customerController.findId(id);
                        if (isBoolean) {
                            System.out.println("The id already matches another id!!");
                        }
                    } while (isBoolean);
                    customer = inputInforCustomer();
                    customer.setCode(id);
                    customerController.addCustomer(customer);
                    System.out.println("Add Completely!!");
                    break;
                case 3:
                    do {
                        id = inputIdCustomer();
                        isBoolean = customerController.findId(id);
                        if (!isBoolean) {
                            System.out.println("Not find this id!!");
                        }
                    } while (!isBoolean);
                    customer = inputInforCustomer();
                    customer.setCode(id);
                    customerController.editCustomer(id, customer);
                    System.out.println("Edit Completely");
                    break;
                case 4:
                    customers = customerController.showList();
                    if (customers.isEmpty()) {
                        System.out.println("Employee List isEmpty");
                    } else {
                        id = inputIdCustomer();
                        isBoolean = customerController.remove(id);
                        if (isBoolean) {
                            System.out.println("Remove Completely!!");
                        } else {
                            System.out.println("I can find id you input!!!");
                        }
                    }
                    break;
                case 5:
                    customers = customerController.showList();
                    if (customers.isEmpty()) {
                        System.out.println("Employee List isEmpty");
                    } else {
                        System.out.println("Input name you want to find");
                        String name = scanner.nextLine();
                        customers = customerController.findName(name);
                        if (customers == null) {
                            System.out.println("Nothing!!");
                        } else {
                            System.out.println("This is your list : ");
                            for (Customer customer1 : customers) {
                                System.out.println(customer1);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("See you latter!!");
                    return;
            }
        } while (true);
    }

    private static Customer inputInforCustomer() throws ParseException {
        System.out.println("Input name customer");
        String name = EmployeeCondition.checkName();
        String date = EmployeeCondition.inputBirthday();
        String gender = Employee.checkGender();
        System.out.println("Input identify customer");
        String identify = EmployeeCondition.checkIndentify();
        System.out.println("Input number customer");
        String number = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email customer");
        String email = EmployeeCondition.checkMail();
        String level = inputLevelCustomer();
        System.out.println("Input address customer");
        String address = EmployeeCondition.checkString();
        return new Customer(name, date, gender, identify, number, email, level, address);
    }

    private static String inputIdCustomer() {
        System.out.println("Input id Customer");
        return EmployeeCondition.codeCustomer();
    }

    private static String inputLevelCustomer() {
        int choice;
        do {
            System.out.println("CustomerType");
            System.out.println("-----------------");
            System.out.println("1. Diamond \n" +
                    "2. Platinum \n" +
                    "3. Gold \n" +
                    "4. Silver \n" +
                    "5. Member ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Input 1-->5 !!!");
            }
        } while (true);
    }
}
