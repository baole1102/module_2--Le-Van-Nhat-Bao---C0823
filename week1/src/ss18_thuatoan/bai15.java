package ss18_thuatoan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu muon nhap!!");
        int number = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[number];
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Nhap phan thu thu" + i);
            newArr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArr));
        int [] checkArr = new int[number];

    }
}