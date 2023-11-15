package a.view;

import a.controller.EmployeeController;
import a.module.Employee;
import a.until.Validate;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
   static int choice;
   static final EmployeeController employeeController = new EmployeeController();
   static final Scanner sc  = new Scanner(System.in);
   static List<Employee> employees;
   static Employee employee;
   static boolean isBoolean;
   static String id;

    public static void main(String[] args) throws ParseException {
      do {
          System.out.println("-----Employee-----");
          System.out.println("1. Showlist \n"+
                  "2. Add Employee \n"+
                  "3. Remove Employee \n"+
                  "4. Edit Employee \n"+
                  "5. Find name Employee");
          System.out.print("Nhập số: ");
          choice = Validate.checkMinMax(1,5);
          switch (choice){
              case 1:
                  employees = employeeController.showList();
                  if (employees.isEmpty()){
                      System.out.println("Danh sách rỗng");
                  }else {
                      for (Employee employee: employees ){
                          System.out.println(employee);
                      }
                  }
                  break;
              case 2:
                  employees = employeeController.showList();
                      id = inputId();
                      isBoolean = employeeController.findId(id);
                      if (!isBoolean){
                          employee = inputInfor();
                          employee.setId(id);
                          employeeController.addEmployee(employee);
                          System.out.println("THêm thành công!!!");
                      }else {
                          System.out.println("Trùng id nhân viên khác rồi");
                      }
                      break;
              case 3:
                  employees = employeeController.showList();
                  if (employees.isEmpty()){
                      System.out.println("Danh sách rỗng");
                  }else {
                      do {
                          id = inputId();
                          isBoolean = checkYesNo(id);
                          if (isBoolean){
                              System.out.println("Xóa thành công");
                          }else {
                              System.out.println("Không tìm thấy id");
                          }
                      }while (!isBoolean);
                  }
                  break;
              case 4:
                  employees = employeeController.showList();
                  if (employees.isEmpty()){
                      System.out.println("Danh sách rỗng");
                  }else {
                      do {
                          id = inputId();
                          isBoolean = employeeController.findId(id);
                          if (isBoolean){
                              employeeController.editEmployee(id,inputInfor());
                              System.out.println("Sửa thành công");
                          }else {
                              System.out.println("Không tìm thấy id");
                          }
                      }while (!isBoolean);
                  }
                  break;
              case 5:
                  employees = employeeController.showList();
                  if (employees.isEmpty()){
                      System.out.println("Danh sách rỗng");
                  }else {
                      System.out.println("Nhập tên muốn tìm");
                      String name = sc.nextLine();
                      employees = employeeController.findName(name);
                      for (Employee employee1 : employees)
                          System.out.println(employee1);
                  }
                  break;
          }
      }while (true);
    }
    private static Employee inputInfor() throws ParseException {
        System.out.println("Nhập tên ");
        String name = Validate.checkName();
        System.out.println("Nhập địa điểm ");
        String location = Validate.checkName();
        System.out.println("Nhập ngày sinh ");
        String date = Validate.checkDate();
        System.out.println("Nhập lương ");
        double saraly = Validate.checkDouble();
        return new Employee(name,location,date,saraly);
    }

    private static String inputId() {
        System.out.println("Nhập id");
        return Validate.checkId();
    }
    private static boolean checkYesNo(String id){
        while (true){
            System.out.println("Bạn có muốn xóa hay không");
            System.out.println("1.Yes");
            System.out.println("2.No");
            choice = Validate.checkMinMax(1,2);
            switch (choice){
                case 1:
                    isBoolean = employeeController.remove(id);
                    return isBoolean;
                case 2:
                    System.out.println("Hẹn gặp lại");
                    return isBoolean;
            }
        }
    }
}
