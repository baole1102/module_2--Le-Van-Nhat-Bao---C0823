package test.until;

import java.util.Scanner;

public class CustomerValidate {
    static final Scanner sc  = new Scanner(System.in);
    public static String checkString(){
        String input;
        do {
           try {
               input = sc.nextLine();
               if (input.matches("^[A-Z][a-zA-Z\\s]{2,50}$")){
                   return input;
               }else {
                   throw new NumberFormatException();
               }
           }catch (NumberFormatException e){
               System.err.println("Yêu cầu nhập chữ");
           }
        }while (true);
    }
    public static String checkName(){
        String input;
        do {
            try {
                input = sc.nextLine();
                if (input.matches("[a-zA-Z]{1,50}$")){
                    return input;
                }else {
                    throw new NumberFormatException();
                }
            }catch (NumberFormatException e){
                System.err.println("Yêu cầu nhập chữ");
            }
        }while (true);
    }
    public static String checkId(){
        String input;
        do {
            try {
                input = sc.nextLine();
                if (input.matches("^C-[0-9]{3}$")){
                    return input;
                }else{
                    throw new NumberFormatException();
                }
            }catch (NumberFormatException e){
                System.err.println("Yêu cầu nhập theo mẫu C-XXX");
            }
        }while (true);
    }
    public static int checkChoice(int min, int max){
        int choice = 0;
        try {
            choice = Integer.parseInt(sc.nextLine());
            if (choice < min || choice > max) {
                throw new NumberFormatException();
            }
        } catch (RuntimeException e) {
            System.err.println("Nhập từ 1-->5");
        }
        return choice;
    }
}
