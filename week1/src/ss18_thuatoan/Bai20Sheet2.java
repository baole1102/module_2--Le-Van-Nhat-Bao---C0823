package ss18_thuatoan;

import java.awt.image.ImageProducer;
import java.util.*;

public class Bai20Sheet2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 2, 3, 5};
        arrangeNumber(arr);
    }

    public static void arrangeNumber(int[] arr) {

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) {
            arrayList.add(k);
        }
        int count = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    count++;
                    arrayList.remove(arrayList.get(j));
                }
            }
            map.put(arrayList.get(i), count);
            count = 1;
        }
        System.out.println(map);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
    }
}
