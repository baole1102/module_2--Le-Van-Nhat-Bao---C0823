package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int [][] arr1 = new int[number][];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập số lượng phần từ của mảng còn"+(i+1)+": ");
            int n1 = scanner.nextInt();
            arr1[i] = new int [n1];
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("NHâp phần thử thứ:"+(j+1));
                arr1[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Nhập số lượng mảng con");
        int lengthaArr = scanner.nextInt();
        int [][] arr = new int[lengthaArr][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập số lượng phần tử của mảng con " + (i+1)+" :");
            int n = scanner.nextInt();
            arr[i] = new int [n];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử thứ:" +(j+1)+" :");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int result = 0;
        int result1 = 0;
        for (int i = 0; i < arr.length; i++) {
        result += arr[i][i];
        result1 += arr[i][arr.length-1-i];
        }
        int sum =  result1+result;
        System.out.println(sum);
    }
}
