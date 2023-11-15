//package ss18_thuatoan;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Bai2Sheet62 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Nhập chuỗi kiểm tra!!");
////        String str = scanner.nextLine();
////        String[] arr = str.split("/");
////        String a = arr[0];
////        String b = arr[1];
////        if (a.matches("\\d{0}")) {
////            System.out.println("Không phải là phân số");
////        }
////        if (b.matches("\\d{0}")) {
////            System.out.println("Không phải là phân số");
////        }
////        int count = 0;
////        for (int i = 0; i < str.length(); i++) {
////            if (str.charAt(i) == '/') {
////                count++;
////            }
////        }
//        int number1;
//        int number2;
//        int count;
//        String str;
//        String[] arr;
//        do {
//            // try {
//            System.out.println("Nhập chuỗi kiểm tra!!");
//            str = scanner.nextLine();
//            arr = str.split("/");
//            String a;
//            String b;
//            while (true) {
//                a = arr[0];
//                b = arr[1];
//                try {
//                    if (a.matches("\\d{0}")) {
//                        System.out.println("Không phải là phân số");
//                    }
//                    if (b.matches("\\d{0}")) {
//                        System.out.println("Không phải là phân số");
//                    }
//                } catch (NumberFormatException e) {
//                    System.err.println("Không phải là phân số!! Nhập lại");
//                }
//            }
//
//            number1 = Integer.parseInt(a);
//            number2 = Integer.parseInt(b);
//            } catch (NumberFormatException e) {
//                System.out.println("Yêu cầu nhập số âm");
//            }
//        } while (number1 <= 0 || number2 <= 0);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '/') {
//                count++;
//            }
//        }
//
//        if (arr.length != 2 || count > 1) {
//            System.out.println("Không phải là phân số");
//        } else {
//            if (number2 > number1) {
//                if (number2 % number1 != 0) {
//                    System.out.println(number1 + "/" + number2);
//                } else {
//                    number2 /= number1;
//                    number1 /= number1;
//                    System.out.println(number1 + "/" + number2);
//                }
//            } else {
//                if (number1 % number2 != 0) {
//                    System.out.println(number1 + "/" + number2);
//                } else {
//                    number1 /= number2;
//                    number2 /= number2;
//                    System.out.println(number1 + "/" + number2);
//                }
//            }
//        }
//    }
//}
//
