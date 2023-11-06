package ss18_thuatoan;

public class Bai2P2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 12, 48};
        boolean isBoolean = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] % arr[j] != 0) {
                    isBoolean = true;
                }
            }
        }
        if (!isBoolean) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }

}
