package ss3_loop.exc;

import java.util.Arrays;
import java.util.Scanner;

public class SumTheNumbersOnDiagonalOfMatrix {
    public static void main(String[] args) {
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
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính là: "+ sum);
    }
}
