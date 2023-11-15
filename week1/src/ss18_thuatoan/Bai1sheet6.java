package ss18_thuatoan;

public class Bai1sheet6 {
    public static void main(String[] args) {
        int [] arr = {2,4,7,9};
        checkArr(arr);
    }
    public static void checkArr (int [] arr){
        int number = arr[1] - arr[0];
        boolean isBoolean = true;
        System.out.println(number);
        for (int i = 0; i < arr.length-1; i++) {
            if (number != arr[i+1]-arr[i]){
                isBoolean = false;
            }
        }
        if (isBoolean){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }

    }
}
