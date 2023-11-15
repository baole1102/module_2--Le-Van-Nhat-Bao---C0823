package ss18_thuatoan;

public class Bai269 {
    public static void main(String[] args) {
        Integer[] arr = {1, 7, 3, 6, 5};
        int max = arr[0];
        int min = arr[0];
        boolean isBoolean = true;
        boolean isBoolean1 = true;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                isBoolean = false;
            } else {
                max = arr[i];
            }
            if (min > arr[i]) {
                isBoolean1 = true;
            } else {
                min = arr[i];
            }
        }
        int sum = 0;
        int sum1 = 0;
        if (!isBoolean) {
            sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] - max;
        }
        if (isBoolean1) {
            sum1 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] - min;
        }
        System.out.println("Tổng 4 số lớn nhất là: " + sum);
        System.out.println("Tổng 4 số bé nhất là: " + sum1);
    }
}
