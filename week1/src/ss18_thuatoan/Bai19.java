package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int choice = Integer.parseInt(sc.nextLine());
        int [] arr = new int[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("Nhập phân tử thứ " + (i+1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                if (arr[i] %2 == 0){
                    result += arr[i];
                }
            }
        }
        System.out.println(result);
    }
}
