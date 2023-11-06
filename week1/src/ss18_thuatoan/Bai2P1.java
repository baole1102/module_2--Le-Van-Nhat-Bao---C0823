package ss18_thuatoan;

import java.util.ArrayList;

public class Bai2P1 {
    public static void main(String[] args) {
      int [] arr = {2,4,7,9,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int result;
        for (int i = 0; i < arr.length; i++) {
            result =0;
            for (int j = 1; j <= arr[i] ; j++) {
                if (arr[i] % j == 0){
                    result += (arr[i]/j);
                }
            }
            arrayList.add(result);
        }
        System.out.println(arrayList);
    }
}
