package ss18_thuatoan;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
//        int[] newArr = {1,2,6,7,5,8};
        Scanner scanner = new Scanner(System.in);
        boolean isBoolean = true;
        int number;
        System.out.println("Nhap so phan tu muon nhap!!");
        do {
            number = Integer.parseInt(scanner.nextLine()) ;
            System.out.println("Nhập số chẵn");
        }while (number % 2 != 0);
            int[] newArr = new int[number];
            for (int i = 0; i < newArr.length; i++) {
                System.out.print("Nhap phan thu thu " + (i+1) +" : ");
                newArr[i] = Integer.parseInt(scanner.nextLine());
            }
            if (newArr.length % 2 == 0) {
                for (int i = 0; i < newArr.length; i = i + 2) {
                    if (newArr[i] > newArr[i + 1]) {
                        isBoolean = false;
                        break;
                    }
                }
            }
            if (isBoolean) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }



    }
}
