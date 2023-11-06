package ss18_thuatoan;

public class Bai8 {
    public static void main(String[] args) {
        int [] arr = {1,3,6,3,6,6,6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]){
                count ++;
            }
        }
        System.out.println(count    );
    }
}
