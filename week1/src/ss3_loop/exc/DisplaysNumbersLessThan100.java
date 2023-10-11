package ss3_loop.exc;


public class DisplaysNumbersLessThan100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị số nguyên tố < 100");
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);

            }
            count = 0;
        }
    }
}
