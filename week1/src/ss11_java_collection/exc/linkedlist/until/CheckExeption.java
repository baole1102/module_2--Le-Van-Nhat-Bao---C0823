package ss11_java_collection.exc.linkedlist.until;

import java.util.Scanner;

public class CheckExeption {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkId() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.err.println("Can nhap so");
                System.err.println("Input again!!!");
            }
        }
    }
    public static String checkName(){
        while (true){
            try {
                return scanner.nextLine().trim();
            }catch (Exception nfe){
                System.err.println("Can nhap chu");
                System.err.println("Input again");
            }
        }
    }
    public static Long checkPrice(){
        while (true){
            try {
                return Long.parseLong(scanner.nextLine());
            }catch (NumberFormatException nfe){
                System.err.println("Can nhap so");
                System.err.println("Input again");
            }
        }
    }


}
