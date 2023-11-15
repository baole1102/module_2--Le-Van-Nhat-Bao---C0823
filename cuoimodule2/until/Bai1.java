package cuoimodule2.until;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] newArr = {4, 3, 2, 1, 2};
        findSingleNumber(newArr);


    }

    public static void findSingleNumber(int[] newArr) {
        int count = 0;
        int flag = 1;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] <= 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = 0; i < newArr.length; i++) {
                for (int j = 1; j < newArr.length; j++) {
                    if (newArr[i] == newArr[j]) {
                        count++;
                    }
                }
                if (count <= 1) {
                    System.out.println(newArr[i]);
                }
                count = 0;
            }
        } else {
            System.out.println("Yêu cầu số trong mảng là số nguyên");
        }
    }
}
