package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBoolean = true;
        int number;
        System.out.println("Nhap so phan tu muon nhap!!");
            number = Integer.parseInt(scanner.nextLine()) ;
        int[] newArr = new int[number];
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Nhap phan thu thu " + (i+1) +" : ");
            newArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            int a = newArr[i]/10;
            int b = newArr[i]%10;
            if (a < b ){
                System.out.println(newArr[i]);
            }
        }

    }
}
