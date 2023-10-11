package ss4_OOP.exc;

import ss4_OOP.exc.QuadraticEquation;

import java.util.Scanner;

public class BuildTheQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        QuadraticEquation calculateQuadraticEquation = new QuadraticEquation(a,b,c);
        calculateQuadraticEquation.checkDenta();
    }
}
