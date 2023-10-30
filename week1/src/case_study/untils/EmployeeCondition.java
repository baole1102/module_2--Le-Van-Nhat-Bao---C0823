package case_study.untils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCondition {
    private static Scanner scanner = new Scanner(System.in);

    public static String checkString(){
        while (true){
            try {
                String input = scanner.nextLine();
                if (input.matches(".*\\d.*")){
                    System.out.println("Require input word. Enter again!!");
                }else {
                    return input;
                }
            }catch (InputMismatchException e){
                e.printStackTrace();
            }
        }
    }
    public static int checkNumber(){
        while (true){
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            }catch (NumberFormatException e){
                System.err.println("Require input number. Enter again!!");
            }
        }
    }
    public static double checkDouble(){
        while (true){
            try {
                return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Require input number. Enter again!!");
            }
        }
    }
}
