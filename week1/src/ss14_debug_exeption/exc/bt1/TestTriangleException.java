package ss14_debug_exeption.exc.bt1;

import java.util.Scanner;

public class TestTriangleException {
    private static Scanner scanner = new Scanner(System.in);

    public void checkConditionIllegalTriangleException(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cần nhập các cạnh lớn hơn 0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Cần nhập 2 cạnh lớn hơn cạnh còn lại");
        }
        System.out.println("a, b, c là 3 cạnh của hình tam giác");
    }

    public static void main(String[] args) {
        try {
            System.out.print("Nhập cạnh a:");
            double valueOne = checkInput();
            System.out.print("Nhập cạnh b:");
            double valueTwo = checkInput();
            System.out.print("Nhập cạnh c:");
            double valueThree = checkInput();
            TestTriangleException illegalTriangleException = new TestTriangleException();
            illegalTriangleException.checkConditionIllegalTriangleException(valueOne, valueTwo, valueThree);
        } catch (Exception e) {
            System.err.println("Lỗi cần nhập lại");
        } finally {
            System.out.println("Finally");
        }
    }

    static Double checkInput() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại");
            }
        }
    }

}
