package ss3_loop.exc;

import java.util.Scanner;

public class ShowFirstTwentyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int checkNumber = 0;
        for (int i = 0; i < 999; i++) {
            for (int j = 1; j < 100; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                checkNumber++;
            }
            if (checkNumber == 20) {
                break;
            }
            count = 0;
        }
    }
}
