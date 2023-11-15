package ss18_thuatoan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1Sheet5 {
    public static void main(String[] args) {
        String string = "hhoooocccsssiiiinnnnhhh";
        checkString(string);
    }
    public static void checkString(String str) {
        String[] arr = str.split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if(arrayList.get(i).equals(arrayList.get(i+1))) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);
    }
}
