package ss18_thuatoan;

import java.util.Arrays;

public class Bai24Sheet2 {
    public static void main(String[] args) {
        String s1 = "AbbAbbbabbb";
        String s2 = "ab";
        String [] arr1 = s1.split("A");
        String [] arr2 = s1.split("");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
}
