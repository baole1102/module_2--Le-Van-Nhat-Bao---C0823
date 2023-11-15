package ss18_thuatoan;

import java.util.ArrayList;

public class Bai12Sheet2 {
    public static void main(String[] args) {
        checkNumber(3);
    }

    public static void checkNumber(int number) {
        boolean isBoolean = true;
        int[] arr = {-10, -3, 3, 5, 7};
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[number - 1] && number == i) {
                System.out.println("Tại vị trí " + i + " ta tìm được " + "a" + i + " = " + number);
                isBoolean = false;
            }
        }
        if (isBoolean){
            System.out.println("Không tồn tại phần tử nào như vậy");
        }
    }


}
