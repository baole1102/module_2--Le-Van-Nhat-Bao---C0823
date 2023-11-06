package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu muon nhap!!");
        int number = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[number];
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Nhap phan thu thu" + i);
            newArr[i] = Integer.parseInt(scanner.nextLine());
        }
           System.out.println(Arrays.toString(newArr));
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % 2 == 0){
                count1 ++;
            }
            if (newArr[i]%2!=0){
                count2++;
            }
        }
        if (count1 == count2){
            System.out.println("Ok");
        }else {
            System.out.println("No");
        }
    }
}
