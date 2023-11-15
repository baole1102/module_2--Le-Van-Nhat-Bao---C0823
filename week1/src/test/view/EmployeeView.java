package test.view;

import test.controller.EmployeeController;
import test.model.Employee;
import test.until.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static EmployeeController employeeController = new EmployeeController();
    static final Scanner scanner = new Scanner(System.in);
    static List<Employee> employees;
    static Employee employee;


    public static void main(String[] args) {
        int choice;
        String id;
        Employee inputInfor;
        boolean isBoolean;
        do {
            System.out.println("Manage Employee");
            System.out.println("----------------");
            System.out.println("1. Showlist \n" +
                    "2. Add Employee \n" +
                    "3. Remove Employee \n" +
                    "4. Edit Employee \n" +
                    "5. Find name");
            System.out.print("Nhập số: ");
            choice = Validate.checkChoice(1,5);
            switch (choice) {
                case 1:
                    employees = employeeController.showList();
                    if (employees.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                        break;
                    }
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    employees = employeeController.showList();
                    do {
                        id = inputId();
                        isBoolean = employeeController.findId(id);
                        if (isBoolean) {
                            System.out.println("Id trùng vs nhân viên khác rồi");
                        }
                    } while (isBoolean);
                    inputInfor = inputInfor();
                    inputInfor.setId(id);
                    employeeController.addEmployee(inputInfor);
                    System.out.println("Thêm thành công!!!");
                    break;
                case 3:
                    employees = employeeController.showList();
                    if (employees.isEmpty()){
                        System.out.println("Rỗng");
                    }else {
                        id = inputId();
                        isBoolean = employeeController.remove(id);
                        if (isBoolean){
                            System.out.println("Xóa thành công");
                        }else {
                            System.out.println("KHông tìm thấy id ( Trùng id rồi )");
                        }
                    }
                    break;
                case 4:
                    employees = employeeController.showList();
                    if (employees.isEmpty()){
                        System.out.println("Rỗng");
                    }else {
                        id = inputId();
                        isBoolean = employeeController.findId(id);
                        if (isBoolean){
                            employeeController.editEmployee(id,inputInfor());
                            System.out.println("Edit thanh cong");
                        }else {
                            System.out.println("Không tìm thấy id");
                        }
                    }
                    break;
                case 5:
                    employees = employeeController.showList();
                    if (employees.isEmpty()){
                        System.out.println("Danh sach rỗng");
                    }else {
                        System.out.println("Nhập tên muốn tìm");
                        String name = scanner.nextLine();
                      List<Employee> list = employeeController.findName(name);
                      if (list.isEmpty()){
                          System.out.println("Không có employee nào");
                      }else {
                          for (Employee employee1 : list){
                              System.out.println(employee1);
                          }
                      }
                    }
                    break;
            }
        }
        while (true);
    }

    public static String inputId() {
        System.out.println("Nhập id nhân viên");
        return Validate.checkCode();
    }

    public static Employee inputInfor() {
        System.out.println("Nhập tên");
        String name = Validate.checkString();
        System.out.println("Nhập địa điểm");
        String location = Validate.checkString();
        System.out.println("Nhập vị trí");
        String level = Validate.checkString();
        System.out.println("Nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(name, location, level, salary);
    }
}

