package ss3_loop.exc;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arrOne = {1,2,3,4,5};
        int [] arrTwo = {6,7,8,9,10};
        System.out.println("First Array: "+ Arrays.toString(arrOne));
        System.out.println("Two Array: "+ Arrays.toString(arrTwo));
        int [] sumArr = new int[arrOne.length + arrTwo.length];
        for (int i = 0; i < arrOne.length; i++) {
            sumArr[i]=arrOne[i];
        }
        for (int i = 5 ; i < sumArr.length ; i++) {
            sumArr[i] = arrTwo[i-arrTwo.length];
        }
        System.out.print(Arrays.toString(sumArr));
    }
}
