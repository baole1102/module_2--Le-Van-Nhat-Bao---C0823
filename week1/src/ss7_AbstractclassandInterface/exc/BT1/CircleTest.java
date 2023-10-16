package ss7_AbstractclassandInterface.exc.BT1;


import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.5);
        circles[2] = new Circle(3.6, "indigo", false);
        System.out.println("Pre-souted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("After-souted: ");
        for (Circle circle : circles) {
            circle.resize(100);
            System.out.println(circle);
        }

    }
}