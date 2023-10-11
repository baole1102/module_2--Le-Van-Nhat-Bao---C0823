package ss3_loop.exc;

import javafx.scene.chart.Chart;

import java.util.Scanner;

public class CountTheNumberOfCharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp chuỗi");
        String chain = scanner.nextLine();
        System.out.println("Nhâp 1 ký tự để kiểm tra");
        String word = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == word.charAt(0)){
                count ++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự trong chuỗi: "+count);
    }
}
