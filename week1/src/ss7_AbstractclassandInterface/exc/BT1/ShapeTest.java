package ss7_AbstractclassandInterface.exc.BT1;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }

    public static interface Resizeable {
    }
}