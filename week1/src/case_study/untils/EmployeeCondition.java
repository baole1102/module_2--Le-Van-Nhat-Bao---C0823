package case_study.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCondition {
    private static Scanner scanner = new Scanner(System.in);
    public static String codeEmployee(){
        do {
            try {
                String input = scanner.nextLine();
                if (!input.matches("^NV-\\d{4}$")) {
                  throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input NV-XXXX. Enter again!!");
            }
        }while (true);
    }
    public static String codeCustomer(){
        do {
            try {
                String input = scanner.nextLine();
                if (!input.matches("^KH-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input KH-XXXX. Enter again!!");
            }
        }while (true);
    }

    public static String checkString() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.matches(".*\\d.*")) {
                    System.out.println("Require input word. Enter again!!");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static int checkNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Require input number. Enter again!!");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Require input number. Enter again!!");
            }
        }
    }

    public static String checkDate() throws ParseException, RuntimeException {
        SimpleDateFormat simpleDateFormat;
        Date date;
        do {
            simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            date = null;
            try {
                date = simpleDateFormat.parse(scanner.nextLine());
                return simpleDateFormat.format(date);
            } catch (ParseException e) {
                System.err.println("Require input email. Enter again!!");
            }
        } while (true);
    }

    public static String checkMail() {
        while (true) {
            String input = scanner.nextLine();
            try {
                if (input.matches("^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$")) {
                    return input;
                } else {
                    System.out.println("You should input like pattern!! Input Again");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static int checkChoice(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("You need input about 1-->6");
            }
        }
    }
    public static String checkIndentify(){
        do {
            try {
                String input = (scanner.nextLine());
                if (!input.matches("^[0-9]\\d{8,11}$")){
                    throw new NumberFormatException();
                }
                return input;
            }catch (NumberFormatException e){
                System.err.println("You need input less than 9 numbers");
            }
        }while (true);
    }
    public static String checkNumberPhone(){
        while (true){
            try {
                String input = scanner.nextLine();
                if (!input.matches("^0\\d{9}$")){
                    throw new NumberFormatException();
                }
                return input;
            }catch (NumberFormatException e){
                System.err.println("You need input less than 10 numbers");
            }
        }
    }
    public static String checkInputVilla(){
        do {
            try {
                String input = scanner.nextLine();
                if (!input.matches("^SVVL-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVVL-YYYY. Enter again!!");
            }
        }while (true);
    }
    public static String checkInputHouse(){
        do {
            try {
                String input = scanner.nextLine();
                if (!input.matches("^SVHO-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVHO-YYYY. Enter again!!");
            }
        }while (true);
    }
    public static String checkInputRoom(){
        do {
            try {
                String input = scanner.nextLine();
                if (!input.matches("^SVRO-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVRO-YYYY. Enter again!!");
            }
        }while (true);
    }
}