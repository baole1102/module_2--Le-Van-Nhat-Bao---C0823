package ss13_arrange_algorithm.pratice.bt1;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length-1; j++) {
                if (list[j] >= list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }
}
