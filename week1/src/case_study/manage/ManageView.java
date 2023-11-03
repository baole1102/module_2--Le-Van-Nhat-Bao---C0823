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

import static case_study.manage.Employee.managementEmployee;
import static case_study.manage.FacilityView.managementFacility;

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
    private static Villa villa;
    private static House house;
    private static Room room;
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
                    CustomerView.managementCustomer();
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


}
