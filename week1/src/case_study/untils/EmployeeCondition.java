package case_study.untils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCondition {
    private static Scanner scanner = new Scanner(System.in);

    public static String codeEmployee() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^NV-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input NV-XXXX. Enter again!!");
            }
        } while (true);
    }

    public static String codeCustomer() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^KH-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input KH-XXXX. Enter again!!");
            }
        } while (true);
    }

    public static String checkString() {
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
                if (input.matches(".*\\d.*")) {
                    System.out.println("Require input word. Enter again!!");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static String checkName() {
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
                if (!input.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                    System.out.println("Require input (Upper) the first letter of the name. Enter again!!");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static int checkNumber() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Require input number. Enter again!!");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Require input number. Enter again!!");
            }
        }
    }

    public static String checkDate() throws ParseException, RuntimeException {
        SimpleDateFormat simpleDateFormat;
        Date date;
        do {
            simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            date = null;
            try {
                date = simpleDateFormat.parse(scanner.nextLine());
                return simpleDateFormat.format(date);
            } catch (ParseException e) {
                System.err.println("Require input email. Enter again!!");
            }
        } while (true);
    }

    public static String checkMail() {
        String input;
        while (true) {
            input = scanner.nextLine();
            try {
                if (input.matches("^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$")) {
                    return input;
                } else {
                    System.out.println("You should input like pattern!! Input Again");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static int checkChoice(int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("You need input about 1-->6");
            }
        }
    }

    public static String checkIndentify() {
        String input;
        do {
            try {
                input = (scanner.nextLine());
                if (!input.matches("^[0-9]\\d{8,11}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("You need input less than 9 numbers");
            }
        } while (true);
    }

    public static String checkNumberPhone() {
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
                if (!input.matches("^0\\d{9}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("You need input less than 10 numbers");
            }
        }
    }

    public static String checkInputVilla() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^SVVL-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVVL-YYYY. Enter again!!");
            }
        } while (true);
    }

    public static String checkInputHouse() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^SVHO-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVHO-YYYY. Enter again!!");
            }
        } while (true);
    }

    public static String checkInputRoom() {
        String input;
        do {
            try {
                input = scanner.nextLine();
                if (!input.matches("^SVRO-\\d{4}$")) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Require input SVRO-YYYY. Enter again!!");
            }
        } while (true);
    }

    public static String inputBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthday = null;
        boolean valid = false;
        LocalDate today;
        Period age;
        LocalDate birthDate;
        while (!valid) {
            System.out.print("Input date (mm/dd/YYYY): ");
            birthday = scanner.nextLine().trim();
            try {
                birthDate = LocalDate.parse(birthday, formatter);
                today = LocalDate.now();
                age = Period.between(birthDate, today);
                if (age.getYears() >= 18) {
                    valid = true;
                } else {
                    System.out.println("You are not yet 18 age. Enter again.");
                }
            } catch (Exception e) {
                System.out.println("Date of birth is not valid according to format (mm/dd/YYYY): ");
            }
        }
        return birthday;
    }

    public static long checkCost() {
        long input;
        while (true) {
            input = Long.parseLong(scanner.nextLine());
            if (input < 0) {
                System.out.println("Require input positive cost !!!");
            } else {
                return input;
            }
        }
    }

    public static int checkCountPerson() {
        int input;
        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input > 0 && input < 20) {
                System.out.println("Require input ( 0 < number Person < 20 !!! )");
            } else {
                return input;
            }
        }
    }

    public static int checkFloor() {
        int input;
        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input <= 0) {
                System.out.println("Require input positive floor !!!");
            } else {
                return input;
            }
        }
    }

    public static long checkAcreage() {
        long input;
        while (true) {
            input = Long.parseLong(scanner.nextLine());
            if (input < 30) {
                System.out.println("Require input ( Arcreage > 30m2 !!! )");
            } else {
                return input;
            }
        }
    }

    public static String checkStatus() {
        while (true) {
            int choice;
            System.out.println("Status");
            System.out.println("------------------");
            System.out.println("1. Active \n" +
                    "2. Offline \n" +
                    "3. Out of room \n" +
                    "4. Rooms ");
            choice = checkChoice(1, 4);
            switch (choice) {
                case 1:
                    return "Active";
                case 2:
                    return "Offline";
                case 3:
                    return "Out of room";
                case 4:
                    return "Rooms";
            }
        }
    }

    public static String checkStandard() {
        while (true) {
            int choice;
            System.out.println("Standard");
            System.out.println("------------------");
            System.out.println("1. 5 Star \n" +
                    "2. 4 Star \n" +
                    "3. 3 Star \n" +
                    "4. 2 Star \n +" +
                    "5. 1 Star \n");
            choice = checkChoice(1, 5);
            switch (choice) {
                case 1:
                    return "5 Star";
                case 2:
                    return "4 Star";
                case 3:
                    return "3 Star";
                case 4:
                    return "2 Star";
                case 5:
                    return "1 Star";
            }
        }
    }


}