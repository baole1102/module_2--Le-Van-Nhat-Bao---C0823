package ss6_inheritance.pratice.TH1;

import ss6_inheritance.pratice.TH1.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5,"indigo",false);
        System.out.println(circle);
    }

}
