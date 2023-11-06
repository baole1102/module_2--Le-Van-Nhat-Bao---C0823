package ss18_thuatoan;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển thành nhị phân!!");
        int choice = sc.nextInt();
        int result = 0;
        while (choice > 0) {
            choice /= 2;
            result = choice % 2;
            System.out.print(result);
        }

    }
}
