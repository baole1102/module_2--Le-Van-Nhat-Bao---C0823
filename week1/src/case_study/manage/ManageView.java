package case_study.manage;

import case_study.controller.CustomerController;
import case_study.controller.EmployeeController;
import case_study.controller.FacilityController;
import case_study.model.inforFacility.Facility;
import case_study.model.modulePerson.Customer;
import case_study.model.modulePerson.Employee;
import case_study.untils.EmployeeCondition;


import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageView {

    private static EmployeeController employeeController = new EmployeeController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customers;
    private static Customer customer;
    private static List<Employee> employees;
    private static Employee employee;
    private static Map<Facility, Integer> facilitys;
    private static Facility facility;
    private static boolean isBoolean;

    public static void main(String[] args) throws ParseException {
        String id;
        System.out.println("Furama");
        System.out.println("-----------------");
        int choice;
        do {
            System.out.println("1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    managementEmployee();
                    break;
                case 2:
                    managementCustomer();
                    break;
                case 3:
                    managementFacility();
                case 4:
                    managementBooking();
                case 5:
                    managementPromotion();
                case 6:
                    System.out.println("See you again");
                    System.exit(1);
                default:
                    System.out.println("You need input about 1--> 6");
            }
        } while (true);
    }

    private static void managementPromotion() {
        int choice;
        do {
            System.out.println("Facility Management");
            System.out.println("--------------------------");
            System.out.println("1. Display list customers use service \n" +
                    "2. Display list customers get voucher \n" +
                    "3. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("See you latter!!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void managementBooking() {
        int choice;
        do {
            System.out.println("Facility Management");
            System.out.println("--------------------------");
            System.out.println("1. Add new booking  \n" +
                    "2. Display list booking \n" +
                    "3. Create new contrats \n" +
                    "4. Display list contrats \n" +
                    "5. Edit contrats \n" +
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("See you latter!!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void managementFacility() {
        String id;
        int choice;
        do {
            System.out.println("Facility Management");
            System.out.println("--------------------------");
            System.out.println("1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Edit facility \n" +
                    "4. Delete facility \n" +
                    "5. Search by name facility \n" +
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    facilitys = facilityController.showList();
                    if (facilitys.isEmpty()){
                        System.out.println("Nothing is this!!");
                    }else {
                        for (Map.Entry<Facility,Integer> map : facilitys.entrySet()) {
                            System.out.println(map.getKey() + " - " + map.getValue());
                        }
                    }
                    break;
                case 2:
                    System.out.println("1. Add New Villa \n"+
                            "2. Add New House \n +" +
                            "3. Add New Room \n " +
                            "4. Back to menu");
                    choice = EmployeeCondition.checkChoice(1,4);
                    switch (choice){
                        case 1:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()){
                                System.out.println("Nothing is this!!");
                            }else {
                                id = inputIdVilla();
                                isBoolean = facilityController.findId(id);

                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("See you not again!!");
                            System.exit(0);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("See you latter!!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void managementCustomer() throws ParseException {
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
                    id = inputIdCustomer();
                    isBoolean = customerController.findId(id);
                    while (isBoolean) {
                        System.out.println("The id already matches another id!!");
                        id = inputId();
                        isBoolean = customerController.findId(id);
                    }
                    customer = inputInforCustomer();
                    customer.setCode(id);
                    customerController.addCustomer(customer);
                    System.out.println("Add Completely!!");
                    break;
                case 3:
                    System.out.println("Input id customer. You want to edit!!!");
                    id = inputIdCustomer();
                    isBoolean = customerController.findId(id);
                    while (isBoolean) {
                        System.out.println("Not find this id!!");
                        id = inputIdCustomer();
                        isBoolean = customerController.findId(id);
                    }
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
                    System.exit(0);
            }
        } while (true);
    }

    private static void managementEmployee() throws ParseException {
        String id;
        int choice;
        do {
            System.out.println("Function Manager");
            System.out.println("--------------------------");
            System.out.println("1. Display list employee \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Delete employee \n" +
                    "5. Search by name employee \n" +
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0, 6);
            switch (choice) {
                case 1:
                    employees = employeeController.showList();
                    if (employees.isEmpty()) {
                        System.out.println("Dont have employee in this!!");
                        break;
                    }
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    employees = employeeController.showList();
                    id = inputId();
                    isBoolean = employeeController.findId(id);
                    while (isBoolean) {
                        System.out.println("The id already matches another id!!");
                        id = inputId();
                        isBoolean = employeeController.findId(id);
                    }
                    employee = inputInfor();
                    employee.setCode(id);
                    employeeController.addEmployee(employee);
                    System.out.println("Add Completed!!");
                    break;
                case 3:
                    id = inputId();
                    isBoolean = employeeController.findId(id);
                    if (!isBoolean) {
                        System.out.println("Not find id");
                    } else {
                        employeeController.editEmployee(id, inputInfor());
                        System.out.println("Edit Successful!!!");
                    }
                    break;
                case 4:
                    employees = employeeController.showList();

                    if (employees.isEmpty()) {
                        System.out.println("Employee List isEmpty");
                    } else {
                        id = inputId();
                        isBoolean = employeeController.remove(id);
                        if (isBoolean) {
                            System.out.println("Succesful!!");
                        } else {
                            System.out.println("I cant find id you input!!");
                        }
                    }
                    break;
                case 5:
                    employees = employeeController.showList();
                    if (employees.isEmpty()) {
                        System.out.println("Employee List isEmpty");
                    } else {
                        System.out.println("Input name employee u want to find them!!");
                        String name = scanner.nextLine();
                        List<Employee> list =  employeeController.findName(name);
                        if (employees.isEmpty()) {
                            System.out.println("Cant find this name");
                        } else {
                            System.out.println("This is list employee: ");
                            for (Employee employee1 : list) {
                                System.out.println(employee1);
                            }
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("You need input about 1--> 6");
            }
        } while (true);
    }

    private static Employee inputInfor() throws ParseException {
        System.out.println("Input name employee");
        String name = EmployeeCondition.checkString();
        System.out.println("Input date (dd/MM/yyyy) employee");
        String date = EmployeeCondition.checkDate();
        System.out.println("Input gender employee");
        String gender = EmployeeCondition.checkString();
        System.out.println("Input identify employee");
        String identify = EmployeeCondition.checkIndentify();
        System.out.println("Input number employee");
        String number = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email employee");
        String email = EmployeeCondition.checkMail();
        System.out.println("Input level employee");
        String level = EmployeeCondition.checkString();
        System.out.println("Input position employee");
        String position = EmployeeCondition.checkString();
        System.out.println("Input salary employee");
        double salary = EmployeeCondition.checkDouble();
        return new Employee(name, date, gender, identify, number, email, level, position, salary);
    }

    private static Customer inputInforCustomer() throws ParseException {
        System.out.println("Input name customer");
        String name = EmployeeCondition.checkString();
        System.out.println("Input date (dd/MM/yyyy) customer");
        String date = EmployeeCondition.checkDate();
        System.out.println("Input gender customer");
        String gender = EmployeeCondition.checkString();
        System.out.println("Input identify customer");
        String identify = EmployeeCondition.checkIndentify();
        System.out.println("Input number customer");
        String number = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email customer");
        String email = EmployeeCondition.checkMail();
        System.out.println("Input level customer");
        String level = EmployeeCondition.checkString();
        System.out.println("Input address customer");
        String address = EmployeeCondition.checkString();
        return new Customer(name, date, gender, identify, number, email, level, address);
    }

    private static String inputId() {
        System.out.println("Input id Employee");
        return EmployeeCondition.codeEmployee();
    }

    private static String inputIdCustomer() {
        System.out.println("Input id Customer");
        return EmployeeCondition.codeCustomer();
    }
    private static String inputIdVilla(){
        System.out.println("Input code service");
        return EmployeeCondition.checkInputVilla();
    }
    private static String inputIdHouse(){
        System.out.println("Input code service");
        return EmployeeCondition.checkInputHouse();
    }
    private static String inputIdRoom(){
        System.out.println("Input code service");
        return EmployeeCondition.checkInputRoom();
    }
}
