package ss3_loop.exc;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestElement {
    public static void main(String[] args) {
        int max = 0;
        int indexI = 0;
        int indexJ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng mảng con : ");
        int m = scanner.nextInt();
        int arr[][] = new int[m][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("__________________________________________________");
            System.out.print("Nhập số lượng phần tử của  mảng con " + (i + 1) + " :");
            int n = scanner.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " :");
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Giá trị lớn nhất trong mảng " + max);
        System.out.println("Ở vị trí " + indexI + " thứ " + indexJ);
    }
}

