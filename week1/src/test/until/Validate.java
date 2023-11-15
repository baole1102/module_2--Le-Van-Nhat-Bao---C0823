package test.until;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class Validate {
    static final Scanner sc = new Scanner(System.in);

    public static String checkString() {
        String input;
        do {
            try {
                input = sc.nextLine();
                if (input.matches("^[A-Z][a-zA-z\\s]{2,50}$")) {
                    return input;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập chữ đầu phải viết hoa!!! (Không được nhập số)");
            }
        } while (true);
    }

    public static String checkCode() {
        String input;
        do {
            try {
                input = sc.nextLine();
                if (input.matches("^(NV-)[0-9]{3}$")) {
                    return input;
                } else {
                    System.out.println("NHập như mẫu NV-XXX");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }

    public static int checkChoice(int min, int max) {
        int input = 0;
        try {
            input = Integer.parseInt(sc.nextLine());
            if (input < min || input > max) {
                throw new NumberFormatException();
            }
        } catch (RuntimeException e) {
            System.err.println("Nhập từ 1-->5");
        }
        return input;
    }
}
