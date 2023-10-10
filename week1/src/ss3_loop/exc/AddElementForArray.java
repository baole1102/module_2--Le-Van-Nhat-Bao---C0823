package ss3_loop.exc;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementForArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("First Arr: " + Arrays.toString(arr));
        System.out.println("Nhập vị trí cần chèn");
        int numbers = scanner.nextInt();
        int sizeArr = arr.length;
        int[] newArr = new int[sizeArr];
        int addElement = 9;
        int value = 0;
        for (int i = 0; i < sizeArr - 1; i++) {
            if (i == numbers) {
             newArr[value] = addElement;
             newArr [ value + 1] = arr [i];
             value +=2 ;
            } else {
                newArr[value] = arr[i];
                value++;
            }
        }
        System.out.println("New arr: " + Arrays.toString(newArr));
    }
}
