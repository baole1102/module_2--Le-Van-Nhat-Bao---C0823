package ss18_thuatoan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner( System.in);
        String str = "Hello";
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        String [] newArr = str.split(" ");
        String result = "";
       if (newArr.length == 1){
           System.out.println(str);
       }else {
           for (int i = 0; i < newArr.length; i++) {
               result += newArr[i].charAt(0);
           }
       }
        System.out.println(result);
    }

}
