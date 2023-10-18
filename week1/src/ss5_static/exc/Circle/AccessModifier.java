package ss5_static.exc.Circle;

public class AccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
    }
}
