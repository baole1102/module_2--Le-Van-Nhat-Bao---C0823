package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so phan tu muon nhap!!");
//        int number = Integer.parseInt(scanner.nextLine());
//        int[] newArr = new int[number];
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println("Nhap phan thu thu" + i);
//            newArr[i] = Integer.parseInt(scanner.nextLine());
//        }
        //   System.out.println(Arrays.toString(newArr));
//        int [] newArr = {2,3,5,7,11,31,23,34,37};
//        boolean isBoolean = true;
//        int count ;
//        for (int i = 0; i < newArr.length; i++) {
//            count = 0;
//            for (int j = 1; j <= newArr[i]; j++) {
//                if (newArr[i] % j == 0){
//                    System.out.println(newArr[i]);
//                    count ++;
//                }
//            }
//            if (count == 2){
//                isBoolean = false;
//            }
//        }
//        if (!isBoolean){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//    }
        int[] newArr = {2, 3, 5, 7, 11, 31, 23, 3, 37,87};
        boolean isBoolean = true;
        int count;
        for (int i = 0; i < newArr.length; i++) {
            count = 0;
            for (int j = 1; j <= newArr[i]; j++) {
                if (newArr[i] % j == 0) {
                    count++;
                }
            }
            if (count   != 2) {
                isBoolean = false;
                break;
            }

        }
        if (isBoolean) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
