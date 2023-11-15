package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai270 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = Integer.parseInt(checkNumber());
        int reversedNumber = reverseNumber(number);
        System.out.println("Số ngược lại: " + reversedNumber);

    }
    public static String checkNumber (){
        String number;
        do {
            try {
                System.out.println("Nhập số gì cũng được trừ chuỗi");
                number = scanner.nextLine();
                if (number.matches("[0-9]{0,50}$")) {
                    return number;
                }
            }catch (NumberFormatException e){
                System.err.println("Require input number !!");
            }
        }while (true);
    }
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
