package case_study.manage;

import case_study.controller.CustomerController;
import case_study.controller.EmployeeController;
import case_study.controller.FacilityController;
import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;
import case_study.model.modulePerson.Customer;
import case_study.model.modulePerson.Employee;
import case_study.untils.EmployeeCondition;


import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
    private static int count = 0;

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
                    if (facilitys.isEmpty()) {
                        System.out.println("Nothing is this!!");
                    } else {
                        for (Map.Entry<Facility, Integer> map : facilitys.entrySet()) {
                            System.out.println(map.getKey() + " - " + map.getValue());
                        }
                    }
                    break;
                case 2:
                    System.out.println("1. Add New Villa \n" +
                            "2. Add New House \n" +
                            "3. Add New Room \n" +
                            "4. Back to menu");
                    choice = EmployeeCondition.checkChoice(1, 4);
                    switch (choice) {
                        case 1:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                id = String.valueOf(inputIdVilla());
                                isBoolean = facilityController.findId(id);
                                while (isBoolean) {
                                    System.out.println("The id already matches another id!!");
                                    id = String.valueOf(inputIdVilla());
                                    isBoolean = facilityController.findId(id);
                                }
                                facility = inputInforVilla(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 2:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                id = inputIdHouse();
                                isBoolean = facilityController.findId(id);
                                while (isBoolean) {
                                    System.out.println("The id already matches another id!!");
                                    id = inputIdHouse();
                                    isBoolean = facilityController.findId(id);
                                }
                                facility = inputInforHouse(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 3:
                            facilitys = facilityController.showList();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing is this!!");
                            } else {
                                id = inputIdRoom();
                                isBoolean = facilityController.findId(id);
                                while (isBoolean) {
                                    System.out.println("The id already matches another id!!");
                                    id = inputIdRoom();
                                    isBoolean = facilityController.findId(id);
                                }
                                facility = inputInforRoom(id);
                                facility.setCode(id);
                                facilityController.addFacility(facility, count);
                                count++;
                                System.out.println("Add completely !!!");
                            }
                            break;
                        case 4:
                            System.out.println("See you not again!!");
                            return;
                    }
                    break;
                case 3:
                    facilitys = facilityController.showList();
                    System.out.println("What is you want to edit ??");
                    System.out.println("-----------------------");
                    System.out.println("1. Villa \n" +
                            "2. House \n" +
                            "3. Room ");
                    choice = EmployeeCondition.checkChoice(1, 3);
                    switch (choice) {
                        case 1:
                            id = String.valueOf(inputIdVilla());
                            isBoolean = facilityController.findId(id);
                            if (!isBoolean){
                                System.out.println("Not find id!!");
                            }else {
                                facility = inputIdVilla();
                                facilityController.editFacility(id,facilirty);
                                System.out.println("Edit Successful!!!");
                            }
                            break;
                        case 2:
                            id = inputIdHouse();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                isBoolean = facilityController.remove(id);
                                if (isBoolean) {
                                    System.out.println("Succesful!!");
                                } else {
                                    System.out.println("I cant find id you input!!");
                                }
                            }
                            break;
                        case 3:
                            id = inputIdRoom();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                isBoolean = facilityController.remove(id);
                                if (isBoolean) {
                                    System.out.println("Succesful!!");
                                } else {
                                    System.out.println("I cant find id you input!!");
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    facilitys = facilityController.showList();
                    System.out.println("What is you want to delete ??");
                    System.out.println("-----------------------");
                    System.out.println("1. Villa \n" +
                            "2. House \n" +
                            "3. Room ");
                    choice = EmployeeCondition.checkChoice(1, 3);
                    switch (choice) {
                        case 1:
                            id = String.valueOf(inputIdVilla());
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                isBoolean = facilityController.remove(id);
                                if (isBoolean) {
                                    System.out.println("Succesful!!");
                                } else {
                                    System.out.println("I cant find id you input!!");
                                }
                            }
                            break;
                        case 2:
                            id = inputIdHouse();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                isBoolean = facilityController.remove(id);
                                if (isBoolean) {
                                    System.out.println("Succesful!!");
                                } else {
                                    System.out.println("I cant find id you input!!");
                                }
                            }
                            break;
                        case 3:
                            id = inputIdRoom();
                            if (facilitys.isEmpty()) {
                                System.out.println("Nothing!!!!");
                            } else {
                                isBoolean = facilityController.remove(id);
                                if (isBoolean) {
                                    System.out.println("Succesful!!");
                                } else {
                                    System.out.println("I cant find id you input!!");
                                }
                            }
                            break;
                    }
                    break;
                case 5:
                    facilitys = facilityController.showList();
                    if (facilitys.isEmpty()){
                        System.out.println("Nothing!!!");
                    }else {
                        System.out.println("Input name you want to find!!!");
                        String name = scanner.nextLine();
                     Set<Facility> facilityList = facilityController.findName(name);
                     if (facilityList.isEmpty()){
                         System.out.println("Cant find this name");
                     }else {
                         System.out.println("This is list Facility: ");
                         for (Facility facility1 : facilityList){
                             System.out.println(facility1);
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
                        List<Employee> list = employeeController.findName(name);
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
                    return;
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
        String identify = inputLevel();
        System.out.println("Input number employee");
        String number = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email employee");
        String email = EmployeeCondition.checkMail();
        System.out.println("Input level employee");
        String level = EmployeeCondition.checkString();
        String position = inputPosition();
        System.out.println("Input salary employee");
        double salary = EmployeeCondition.checkDouble();
        return new Employee(name, date, gender, identify, number, email, level, position, salary);
    }

    private static String inputLevel() {
        int choice;
        do {
            System.out.println("Level");
            System.out.println("-----------------");
            System.out.println("1. Intermediate \n" +
                    "2. College \n" +
                    "3. University \n" +
                    "4. After University");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Intermediate";
                case 2:
                    return "College";
                case 3:
                    return "University";
                case 4:
                    return "After University";
                default:
                    System.out.println("Input 1-->4 !!!");
            }
        } while (true);
    }

    private static String inputPosition() {
        int choice;
        do {
            System.out.println("Position");
            System.out.println("-----------------");
            System.out.println("1. Receptionist \n" +
                    "2. Serve \n" +
                    "3. Expert \n" +
                    "4. Supervisor \n" +
                    "5. Manager \n" +
                    "6. Director");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Serve";
                case 3:
                    return "Expert";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
                default:
                    System.out.println("Input 1-->6 !!!");
            }
        } while (true);
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
        String level = inputLevelCustomer();
        System.out.println("Input address customer");
        String address = EmployeeCondition.checkString();
        return new Customer(name, date, gender, identify, number, email, level, address);
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

    private static Facility inputInforVilla(String id) {
        System.out.println("Input name Villa");
        String name = EmployeeCondition.checkString();
        System.out.println("Input countPerson Villa");
        int countPerson = EmployeeCondition.checkNumber();
        System.out.println("Input cost Villa");
        long cost = EmployeeCondition.checkNumber();
        System.out.println("Input location Villa");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status Villa");
        String status = EmployeeCondition.checkString();
        System.out.println("Input standar Villa");
        String standar = EmployeeCondition.checkString();
        System.out.println("Input acreage Villa");
        long acreage = EmployeeCondition.checkNumber();
        System.out.println("Input numberfloor Villa");
        int numberfloor = EmployeeCondition.checkNumber();
        Villa villa = new Villa(id, name, countPerson, cost, location, status, standar, acreage, numberfloor);
        return villa;
    }

    private static House inputInforHouse(String id) {
        System.out.println("Input name House");
        String name = EmployeeCondition.checkString();
        System.out.println("Input countPerson House");
        int countPerson = EmployeeCondition.checkNumber();
        System.out.println("Input cost House");
        long cost = EmployeeCondition.checkNumber();
        System.out.println("Input location House");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status House");
        String status = EmployeeCondition.checkString();
        System.out.println("Input standar House");
        String standar = EmployeeCondition.checkString();
        System.out.println("Input numberfloor House");
        int numberfloor = EmployeeCondition.checkNumber();
        House house = new House(id, name, countPerson, cost, location, status, standar, numberfloor);
        return house;
    }

    private static Room inputInforRoom(String id) {
        System.out.println("Input name Room");
        String name = EmployeeCondition.checkString();
        System.out.println("Input countPerson Room");
        int countPerson = EmployeeCondition.checkNumber();
        System.out.println("Input cost Room");
        long cost = EmployeeCondition.checkNumber();
        System.out.println("Input location Room");
        String location = EmployeeCondition.checkString();
        System.out.println("Input status Room");
        String status = EmployeeCondition.checkString();
        System.out.println("Input attrachFreeService Room");
        String attrachFreeService = EmployeeCondition.checkString();
        Room room = new Room(id, name, countPerson, cost, location, status, attrachFreeService);
        return room;
    }

    private static String inputId() {
        System.out.println("Input id Employee");
        return EmployeeCondition.codeEmployee();
    }

    private static String inputIdCustomer() {
        System.out.println("Input id Customer");
        return EmployeeCondition.codeCustomer();
    }

    private static Facility inputIdVilla() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputVilla();
    }

    private static String inputIdHouse() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputHouse();
    }

    private static String inputIdRoom() {
        System.out.println("Input code service");
        return EmployeeCondition.checkInputRoom();
    }
}
