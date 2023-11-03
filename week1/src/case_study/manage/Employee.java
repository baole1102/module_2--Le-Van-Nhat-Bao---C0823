package case_study.manage;

import case_study.controller.EmployeeController;
import case_study.untils.EmployeeCondition;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeController employeeController = new EmployeeController();
    private static List<case_study.model.modulePerson.Employee> employees;
    private static case_study.model.modulePerson.Employee employee;
    private static boolean isBoolean;
    private static String inputIdEmployee() {
        System.out.println("Input id Employee");
        return EmployeeCondition.codeEmployee();
    }

    public static void managementEmployee() throws ParseException {
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
                    for (case_study.model.modulePerson.Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    employees = employeeController.showList();
                    id = inputIdEmployee();
                    isBoolean = employeeController.findId(id);
                    while (isBoolean) {
                        System.out.println("The id already matches another id!!");
                        id = inputIdEmployee();
                        isBoolean = employeeController.findId(id);
                    }
                    employee = inputInforEmployee();
                    employee.setCode(id);
                    employeeController.addEmployee(employee);
                    System.out.println("Add Completed!!");
                    break;
                case 3:
                    id = inputIdEmployee();
                    isBoolean = employeeController.findId(id);
                    if (!isBoolean) {
                        System.out.println("Not find id");
                    } else {
                        employeeController.editEmployee(id, inputInforEmployee());
                        System.out.println("Edit Successful!!!");
                    }
                    break;
                case 4:
                    employees = employeeController.showList();

                    if (employees.isEmpty()) {
                        System.out.println("Employee List isEmpty");
                    } else {
                        id = inputIdEmployee();
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
                        List<case_study.model.modulePerson.Employee> list = employeeController.findName(name);
                        if (employees.isEmpty()) {
                            System.out.println("Cant find this name");
                        } else {
                            System.out.println("This is list employee: ");
                            for (case_study.model.modulePerson.Employee employee1 : list) {
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

    private static case_study.model.modulePerson.Employee inputInforEmployee() throws ParseException {
        System.out.println("Input name employee");
        String name = EmployeeCondition.checkName();
        String date = EmployeeCondition.inputBirthday();
        System.out.println("Input gender employee");
        String gender = EmployeeCondition.checkString();
        String identify = EmployeeCondition.checkIndentify();
        System.out.println("Input number employee");
        String number = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email employee");
        String email = EmployeeCondition.checkMail();
        System.out.println("Input level employee");
        String level = inputLevel();
        String position = inputPosition();
        System.out.println("Input salary employee");
        double salary = EmployeeCondition.checkDouble();
        return new case_study.model.modulePerson.Employee(name, date, gender, identify, number, email, level, position, salary);
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
}
