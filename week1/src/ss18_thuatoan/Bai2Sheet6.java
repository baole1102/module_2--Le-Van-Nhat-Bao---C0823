package ss18_thuatoan;

import java.util.Scanner;

public class Bai2Sheet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(sc.nextLine());
        checkTriangle(a,b,c);
    }

    public static void checkTriangle(int a, int b, int c) {
        int newA = (int) Math.pow(a, 2);
        int newB = (int) Math.pow(b, 2);
        int newC = (int) Math.pow(c, 2);
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Không phải là cạnh của tam giác");
        } else if (newA + newB == newC || newC + newB == newA || newA + newC == newB) {
            System.out.println("Là 3 cạnh của tam giác vuông");
        }else {
            System.out.println("Chỉ là 3 cạnh của 1 tam giác");
        }
    }
}
