package ss7_abstractclassandInterface.exc.bt1;


public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0]=new Rectangle();
        rectangle[1]=new Rectangle(2.3,5.8);
        rectangle[2]=new Rectangle(2.5, 3.8, "orange", true);
        System.out.println("Pre-souted: ");
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }
        System.out.println("After-souted: ");
        for (Rectangle rectangles : rectangle) {
            rectangles.resize(50);
            System.out.println(rectangles);
        }

    }
}