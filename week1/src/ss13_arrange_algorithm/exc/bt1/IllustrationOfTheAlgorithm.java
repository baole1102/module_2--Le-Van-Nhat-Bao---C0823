package ss13_arrange_algorithm.exc.bt1;

import java.util.Arrays;

public class IllustrationOfTheAlgorithm {
    static int [] list = { 3,2,7,1,9,5,6,8};
    public static void arrangeAlgorithm( int [] list){
        int firstValue;
        int index;
        for (int i = 0; i < list.length; i++) {
            firstValue = list[i];
            index = i;
            while (index > 0 && firstValue < list[index-1]){
                list[index] = list[index-1];
                index--;
            }
            list[index] = firstValue;
        }
    }

    public static void main(String[] args) {
        arrangeAlgorithm(list);
        System.out.println(Arrays.toString(list));
    }
}
