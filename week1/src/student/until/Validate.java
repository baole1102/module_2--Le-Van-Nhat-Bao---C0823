package student.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {
    private static final Scanner sc = new Scanner(System.in);

    public static String checkName() {
        String input;
        do {
            try {
                input = sc.nextLine();
                if (!input.matches("^[A-Z][a-zA-Z\\s]{1,50}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập chữ đầu viết hoa (Không nhập số và kí tự đặc biệt !!!)");
            }
        } while (true);
    }

    public static String checkId() {
        String input;
        do {
            try {
                input = sc.nextLine();
                if (!input.matches("^ST-\\d{3}")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập id theo mẫu ST-XXX");
            }
        } while (true);
    }

    public static int checkChoice(int min, int max) {
        int input;
        do {
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập từ " + min + " --> " + max);
            }

        } while (true);
    }
    public static int checkScore() {
        int input;
        do {
           try {
               input = Integer.parseInt(sc.nextLine());
               if (input < 0  || input > 10){
                   throw  new NumberFormatException();
               }
               return input;
           } catch (NumberFormatException e) {
               System.err.println("Nhập từ 0 --> 10 điểm");
           }

        } while (true);
    }
    public static String checkDate(){
        do {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
            Date date = null;
            try {
                date = df.parse(sc.nextLine());
                return df.format(date);
            } catch (ParseException e) {
               System.err.println("Nhập theo mẫu dd/MM/YYYY");
            }

        }while (true);
    }
    public static String checkString(){
        String input;
        do {
            try {
                input = sc.nextLine();
                if (!input.matches("^[A-Z][a-zA-Z0-9\\s]{1,50}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập chữ đầu viết hoa (Không nhập kí tự đặc biệt !!!)");
            }
        } while (true);
    }

}
