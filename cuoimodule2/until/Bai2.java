package cuoimodule2.until;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.*;

public class Bai2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số nhiệm vụ");
        int n = Integer.parseInt(scanner.nextLine());
        check(n);
    }

    public static void check(int n) {
        int deadline;
        int finish;
        int[] newArr = new int[n * 2];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập thời hạn làm nhiệm vụ " + i);
                deadline = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập thời gian làm nhiệm vụ " + i);
                finish = Integer.parseInt(scanner.nextLine());
                arrayList.add(deadline);
                arrayList.add(finish);
            } while (deadline < 0 || finish < 0);
        }
        for (int i = 0; i < arrayList.size(); i = i + 2) {
            System.out.println("d = " + arrayList.get(i) + " và " + "f = " + arrayList.get(i + 1));
        }
        int count = arrayList.get(0) - arrayList.get(1);
        for (int i = 2; i < arrayList.size() - 1; i = i + 2) {
            if (arrayList.get(i) - arrayList.get(i + 1) > count) {
                count = arrayList.get(i) - arrayList.get(i + 1);
            }
        }
        for (int i = 0; i < arrayList.size(); i = i + 2) {
            if (count == arrayList.get(i) - arrayList.get(i + 1)) {
                System.out.println("Cặp nhiệm vụ nhiều điểm nhất:" + arrayList.get(i) + " - " + arrayList.get(i + 1));
            }
        }


    }
}
