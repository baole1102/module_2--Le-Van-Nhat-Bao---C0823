package ss18_thuatoan;

import java.util.*;

public class Bai267 {
    public static void main(String[] args) {
        String str = "hhhooooocccsssiiinhhh";
        int count;
        Map<String, Integer> map = new HashMap<>();
        String[] arr = str.split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
        System.out.println(arrayList);
        String straa="";
        for (int i = 0; i < arrayList.size(); i++) {
            count = 1;
            for (int j = 1+i; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(arrayList.get(j));
                    count++;
                    j--;
                }
            }
            map.put(arrayList.get(i), count);
        }
        System.out.println(map);
    }
}
