package ss18_thuatoan;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai274 {
    public static void main(String[] args) {
        String str = "11:20:30";
        String str1 = "07:35:45";
        System.out.println(str);
        System.out.println(str1);
        sumNumber(str,str1);
    }
    public static void sumNumber(String str, String str1){
        String[] arr = str.split(":");
        String[] arr1 = str1.split(":");
        int size = arr.length;
        int [] newArr = new int [size];
        int a;
        int b;
        int sum ;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            a = Integer.parseInt(arr[i]);
            b = Integer.parseInt(arr1[i]);
            sum = a + b;
            newArr[i] = sum;
        }
        System.out.println(newArr[0]+":"+newArr[1]+":"+newArr[2]);

    }
}
