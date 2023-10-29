package ss16_io_biobanry.exc.bt1.util;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckCondintion {
    private static Scanner scanner =new Scanner(System.in);
    public static boolean  checkYesNo(){
        boolean isCheck = false;
        try {
            System.out.println("Y/y or N/n");
            String str = scanner.nextLine();
            if (str.toLowerCase() == "y"){
                isCheck = true;
            }else if (str.toLowerCase() == "n"){
                System.out.println("Ok be!!!");
                System.exit(1);
            }else {
                System.out.println("Enter again!!");;
            }
            if (!isCheck){
               return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public static int checkId(){
       while (true){
           try {
               return Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Can nhap so");
               System.out.println("Enter again!!!");
           }
       }
    }
    public static String checkName(){
        while (true){
            try {
                String input = scanner.nextLine();
                if (input.matches(".*\\d.*")){
                    System.out.println("Khong duoc nhap so. Hay nhap lai!!!");
                }else {
                    return input;
                }
            }catch (InputMismatchException  e){
                System.err.println("Can nhap chu");
                System.err.println("Enter again!!!");
            }
        }
    }
    public static double checkPrice(){
        while (true){
            try {
                return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Can nhap so");
                System.err.println("Enter again!!!");
            }
        }
    }
}
