package ss3_loop.exc;

import java.util.Arrays;

public class DeleteElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("First Arr: " + Arrays.toString(numbers));
        int newSize = numbers.length;
        int[] newArr = new int[newSize];
        int x = 7;
        int newIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (x != numbers[i]) {
                newArr[newIndex] = numbers[i];
                newIndex++;
            }
        }
        System.out.println("New value: " + Arrays.toString(newArr));
    }
}
