package case_study.manage;

import case_study.controller.EmployeeController;
import case_study.model.Employee;
import case_study.untils.EmployeeCondition;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static EmployeeController employeeController = new EmployeeController();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees;
    private static Employee employee;
    private static boolean isBoolean;
    public static void main(String[] args) throws ParseException {
        String id;
        System.out.println("Furama");
        System.out.println("-----------------");
        int choice;
        do {
            System.out.println("1. Employee Management \n"+
                    "2. Customer Management \n"+
                    "3. Facility Management \n"+
                    "4. Booking Management \n"+
                    "5. Promotion Management \n"+
                    "6. Exit");
            choice = EmployeeCondition.checkChoice(0,6);
            switch (choice){
                case 1:
                    ManagementEmployee();
                case 2:
                    do {
                        System.out.println("Function Manager");
                        System.out.println("--------------------------");
                        System.out.println("1. Display list employee \n"+
                                "2. Add new employee \n"+
                                "3. Edit employee \n"+
                                "4. Delete employee \n"+
                                "5. Search by name employee \n"+
                                "6. Return main menu");
                        choice = EmployeeCondition.checkChoice(0,6);
                    }while (true);
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("See you again");
                    System.exit(1);
                default:
                    System.out.println("You need input about 1--> 6");
            }
        }while (true);
    }
    private static void ManagementEmployee() throws ParseException {
        String id;
        int choice;
        do {
            System.out.println("Function Manager");
            System.out.println("--------------------------");
            System.out.println("1. Display list employee \n"+
                    "2. Add new employee \n"+
                    "3. Edit employee \n"+
                    "4. Delete employee \n"+
                    "5. Search by name employee \n"+
                    "6. Return main menu");
            choice = EmployeeCondition.checkChoice(0,6);
            switch (choice){
                case 1:
                    employees =  employeeController.showList();
                    System.out.println(employees);
//                    if (employees.isEmpty()){
//                        System.out.println("Dont have employee in this!!");
//                        break;
//                    }
//                    for (Employee employee: employees){
//                        System.out.println(employee);
//                    }
                    break;
                case 2:
                    employees = employeeController.showList();
                    id = inputId();
                    isBoolean = employeeController.findId(id);
                    while (isBoolean){
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
                    if (!isBoolean){
                        System.out.println("Not find id");
                    }else {
                        employeeController.editEmployee(id,inputInfor());
                        System.out.println("Edit Successful!!!");
                    }
                    break;
                case 4:
                     employees = employeeController.showList();
                     id = inputId();
                     if (employees.isEmpty()){
                         System.out.println("Employee List isEmpty");
                     }else {
                         isBoolean = employeeController.remove(id);
                         if (isBoolean){
                             System.out.println("Succesful!!");
                         }else {
                             System.out.println("I cant find id you input!!");
                         }
                     }
                    break;
                case 5:
                   employees = employeeController.showList();
                    if (employees.isEmpty()){
                        System.out.println("Employee List isEmpty");
                    }else {
                        System.out.println("Input name employee u want to find them!!");
                        String name = scanner.nextLine();
                       employee = employeeController.findName(name);
                        if (employee == null){
                            System.out.println("Cant find this name");
                        }else {
                            System.out.println("This is list employee: ");
                            System.out.println(employee);
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("You need input about 1--> 6");
            }
        }while (true);
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
        String number  = EmployeeCondition.checkNumberPhone();
        System.out.println("Input email employee");
        String email  = EmployeeCondition.checkMail();
        System.out.println("Input level employee");
        String level  = EmployeeCondition.checkString();
        System.out.println("Input position employee");
        String position  = EmployeeCondition.checkString();
        System.out.println("Input salary employee");
        double salary  = EmployeeCondition.checkDouble();
        return new Employee(name,date,gender,identify,number,email,level,position,salary);
    }
    private static String inputId() {
        System.out.println("Input id employee");
        return EmployeeCondition.codeEmployee();
    }
}
