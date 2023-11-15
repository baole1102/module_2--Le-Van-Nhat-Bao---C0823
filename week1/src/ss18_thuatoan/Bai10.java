package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu muon nhap!!");
        number = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[number];
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Nhap phan thu thu " + (i + 1) + " : ");
            newArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            if (checkNumber(newArr[i])){
                System.out.println(newArr[i]);
            }
        }
    }

    public static boolean checkNumber(int number) {
        int chinhPhuong = (int) Math.sqrt(number);
        return chinhPhuong * chinhPhuong == number;
    }
}
