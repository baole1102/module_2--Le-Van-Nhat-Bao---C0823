package ss14_debug_exeption.pratice.th1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRamdom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu chi co so 5 " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot gioi han mang");
        }
    }
}
