package ss18_thuatoan;

public class Bai1sheet622 {
    public static void main(String[] args) {
     int [] arr = {0,1,2,1,1,0};
     checkNumber(arr);
    }
    public static void checkNumber(int [] arr){
        boolean a = true;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]){
                a = false;
            }
        }
        if (a){
            System.out.println("OK");
        }else {
            System.out.println("No");
        }
    }
}
