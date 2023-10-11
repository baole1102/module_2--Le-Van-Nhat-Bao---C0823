package ss3_loop.exc;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestValueInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần thử tại vị trí "+(i+1));
            arr[i]= scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Mảng: "+ Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng: "+ min );
    }

}
