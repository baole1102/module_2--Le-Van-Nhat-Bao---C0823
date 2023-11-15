package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBoolean = true;
        int number;
        System.out.println("Nhap so phan tu muon nhap!!");
        number = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[number];
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Nhap phan thu thu " + (i + 1) + " : ");
            newArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArr));
        int count;
        for (int i = 0; i < newArr.length; i++) {
            count = 0;
            for (int j = 1; j <= newArr[i]; j++) {
                if (newArr[i] % j == 0) {
                    count++;
                }
            }
            if (count != 2) {
                isBoolean = false;
                break;
            }
        }
        if (isBoolean) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
//        for (int i = 0; i < newArr.length; i++) {
//            count = 0;
//            for (int j = 1; j <= newArr[i]; j++) {
//                if (newArr[i] % j == 0){
//                    count ++;
//                }
//            }
//            if (count != 2){
//                isBoolean = false;
//                break;
//            }
//        }
//        if (isBoolean){
//            System.out.println("OK");
//        }else {
//            System.out.println("NO");
//        }
//    }
    }}
