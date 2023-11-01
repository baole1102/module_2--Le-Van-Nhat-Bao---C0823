package case_study.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static String checkDate(){
        while (true){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date date = null;
            try {
                date = simpleDateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.err.println("Require input email. Enter again!!");
               e.printStackTrace();
            }
            return simpleDateFormat.format(date);
        }
    }
    public static String checkMail(){
        while (true){
            String input = scanner.nextLine();
           try {
               if (input.matches("^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$")){
                   return input;
               }else {
                   System.out.println("You should input like pattern!! Input Again");
               }
           }catch (InputMismatchException e){
               e.printStackTrace();
           }
        }
    }
}
