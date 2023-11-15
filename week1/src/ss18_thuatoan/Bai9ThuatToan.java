package ss18_thuatoan;

import java.util.Scanner;

public class Bai9ThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số đầu tiên");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Số thứ 2");
        int number2 = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = number1; i < number2; i++) {
            if (checkNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean checkNumber(int number) {
        String a = Integer.toString(number);
        return a.charAt(0) == a.charAt(a.length() - 1);
    }
}
