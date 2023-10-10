package ss3_loop.exc;

import java.util.Scanner;

public class ShowImage {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <=5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                for (int i = 5; i >= 0; i--) {
                    for (int j = 1; j <= i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            default:
                System.out.println("Exit");
        }
    }

}
