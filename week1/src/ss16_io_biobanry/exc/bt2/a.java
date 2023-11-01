package ss16_io_biobanry.exc.bt2;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -1 ) {
                    break;
                }else if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
