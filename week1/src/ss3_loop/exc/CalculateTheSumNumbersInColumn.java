package ss3_loop.exc;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSumNumbersInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng :");
        int m = scanner.nextInt();
        int [][] arr = new int[m][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử con trong mảng tại "+ (i+1) + " :");
            int n = scanner.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử tai vị trí "+(j+1)+" : ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Bạn muốn tính tổng tại cột nào");
        int numberColumn = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == numberColumn ){
                    sum += arr[i][j];
                }
            }

        }
        System.out.println("Tổng các số tại cột "+ numberColumn + " là: "+ sum);
    }
}
