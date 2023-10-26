package ss12_search_algorithm.exc;

import java.util.Arrays;

public class SearchAlgorithm {
    private static int[] array = {1, 7, 5, 17, 14, 20, 50, 29};

    public static void arrangArr() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle;
        if (right >= left) {
            middle = (left + right) / 2;
            if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            } else if (value == arr[middle]) {
                return middle;
            } else {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int left = 0;
        int right = array.length - 1;
        int value = 5;
        arrangArr();
        System.out.println(binarySearch(array, left, right, value));
    }
}
