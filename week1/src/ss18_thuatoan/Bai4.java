package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuổi ký tự đê check!!");
        String str = sc.nextLine();
        System.out.println(str);
        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        int count1 = 0;
        int count2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr[i].toLowerCase()){
                count1 ++;
            }
            if (arr[i]==arr[i].toUpperCase()){
                count2++;
            }
        }
        if (count2 == count1){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }
}
