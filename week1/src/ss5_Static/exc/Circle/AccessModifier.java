package ss5_Static.exc.Circle;

public class AccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2);
        System.out.println(circle);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
    }
}
