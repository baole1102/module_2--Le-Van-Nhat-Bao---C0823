package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so phan tu muon nhap!!");
//        int number = Integer.parseInt(scanner.nextLine());
//        int[] newArr = new int[number];
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println("Nhap phan thu thu" + i);
//            newArr[i] = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(Arrays.toString(newArr));
        int[] newArr = {1,2,3,2};
        boolean isBoolean = true;
        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length-1){
                break;
            }
            if (newArr[i] > newArr[i+1]){
                isBoolean = false;
                break;
            }
        }
        if (isBoolean) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }
}
