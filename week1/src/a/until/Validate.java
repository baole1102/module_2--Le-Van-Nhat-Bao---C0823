package a.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Validate {
    private static final Scanner sc = new Scanner(System.in);

    public static String checkName() {
        String input;
        do {
            try {
                input = sc.nextLine().trim();
                if (!input.matches("^[A-Z][a-zA-Z\\s]{1,50}$")) {
                    throw new NumberFormatException();
                }
                input = input.replaceAll("\\s+", " ");
                input = input.trim();
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập chữ đầu viết hoa ( Không được nhập số, ki tự đặc biệt )");
            }
        } while (true);
    }

    public static String checkId() {
        String input;
        do {
            try {
                input = sc.nextLine();
                if (!input.matches("^NV-\\d{3}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập theo mẫu NV-XXX");
            }
        } while (true);
    }

    public static int checkMinMax(int min, int max) {
        int input;
        do {
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập từ " + min + "-->" + max);
            }
        } while (true);
    }

    public static Double checkDouble() {
        double input;
        do {
            try {
                input = Double.parseDouble(sc.nextLine());
                if (String.valueOf(input).matches("^[a-zA-Z0-9][a-zA-Z0-9]{0,50}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Nhập số !!!");
            }
        } while (true);
    }

//    public static String inputBirthday() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String birthday = null;
//        boolean valid = false;
//        LocalDate today;
//        Period age;
//        LocalDate birthDate;
//        while (!valid) {
//            System.out.print("Input date (mm/dd/YYYY): ");
//            birthday = sc.nextLine().trim();
//            try {
//                birthDate = LocalDate.parse(birthday, formatter);
//                today = LocalDate.now();
//                age = Period.between(birthDate, today);
//                if (age.getYears() >= 18) {
//                    valid = true;
//                } else {
//                    System.out.println("You are not yet 18 age. Enter again.");
//                }
//            } catch (Exception e) {
//                System.out.println("Date of birth is not valid according to format (mm/dd/YYYY): ");
//            }
//        }
//        return birthday;
//    }

   public static String checkDate() throws ParseException {
        do {
            try {
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
                Date date = df.parse(sc.nextLine());
                return df.format(date);
            } catch (ParseException e) {
               System.err.println("Nhập đúng mẫu dd-MM-YYYY");
            }
        }while (true);
   }
}
