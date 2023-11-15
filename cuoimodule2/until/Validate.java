package cuoimodule2.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkChoice(int min, int max) {
        int input;
        do {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập từ " + min + "-->" + max);
            }
        } while (true);
    }

    public static String checkId() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^BUG-\\d{3}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập theo định dạng BUG-XXX");
            }
        } while (true);
    }

    public static String checkName() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^[A-Z][a-zA-Z\\s.]{1,50}$")) {
                    throw new NumberFormatException();
                }
                input = input.replaceAll("\\s+", " ");
                input = input.trim();
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập chữ đầu viết hoa (Không có kí tự đặc biệt và số )");
            }
        } while (true);
    }

    public static String checkTime() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (input.matches("[0-9][:/+0-9]$")) {
                    return input;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập số (Không nhập chữ và kí tự đặt biệt");
            }
        } while (true);
    }

    public static String checkTimeLine() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (input.matches("^[0,1]\\d{2}:\\d{2}")) {
                    throw new NumberFormatException();
                }
                input = input.replaceAll("\\s+", " ");
                input = input.trim();
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập số (Không nhập chữ và kí tự đặt biệt");
            }
        } while (true);
    }

    public static int checkHour() {
        int input;
        do {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < 0 || input > 12) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập từ 0 --> 12");
            }
        } while (true);
    }

    public static int checkMinute() {
        int input;
        do {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < 0 || input > 60) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập từ 0 --> 60");
            }
        } while (true);
    }


}
