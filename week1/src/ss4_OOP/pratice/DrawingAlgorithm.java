package ss4_OOP.pratice;

public class DrawingAlgorithm {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j <= 11; j++) {
                if (j == 5 - i || j == 5 + 1 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 11; j++) {
                if (j == 5 - i || j == i + 6) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
