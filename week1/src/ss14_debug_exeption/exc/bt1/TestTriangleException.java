package ss14_debug_exeption.exc.bt1;

import java.util.Scanner;

public class TestTriangleException {
    private static Scanner scanner = new Scanner(System.in);

    public void checkConditionIllegalTriangleException(double a, double b, double c) throws Exception {
       if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Cần nhập 2 cạnh lớn hơn cạnh còn lại");
        }
        System.out.println("a, b, c là 3 cạnh của hình tam giác");
    }
    private static double checkNumber() {
        while (true) {
            try {
                double side = Double.parseDouble(scanner.nextLine());
                if (side <= 0) {
                    System.out.print("Nhap so duong!!!!");
                } else {
                    return side;
                }
            } catch (NumberFormatException e) {
                System.err.print("Error! Enter again");
            }
        }
    }
    public static void main(String[] args) {
        try {
            System.out.print("Nhập cạnh a:");
            double valueOne = checkNumber();
            System.out.print("Nhập cạnh b:");
            double valueTwo = checkNumber();
            System.out.print("Nhập cạnh c:");
            double valueThree = checkNumber();
            TestTriangleException illegalTriangleException = new TestTriangleException();
            illegalTriangleException.checkConditionIllegalTriangleException(valueOne, valueTwo, valueThree);
        } catch (Exception e) {
            System.err.println("Lỗi cần nhập lại");
        } finally {
            System.out.println("Finally");
        }
    }


}
