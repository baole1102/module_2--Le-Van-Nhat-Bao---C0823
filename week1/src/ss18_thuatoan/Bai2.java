package ss18_thuatoan;

import java.util.ArrayList;
public class Bai2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 9};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        boolean isBoolean = true;
        for (int i = 0; i < arr.length / 2; i++) {
            arrayList1.add(arr[i]);
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            arrayList2.add(arr[i]);
        }
        int a;
        int b;
        for (int i = 0; i < arrayList1.size(); i++) {
            a = arrayList1.get(i)*arrayList1.get(i);
            b = arrayList2.get(i);
            if (a != b){
                isBoolean = false;
                break;
            }
        }
        if (isBoolean) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
