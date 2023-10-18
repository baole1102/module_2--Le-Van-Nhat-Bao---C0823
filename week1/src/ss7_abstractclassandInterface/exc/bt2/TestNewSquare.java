package ss7_abstractclassandInterface.exc.bt2;

import ss7_abstractclassandInterface.exc.bt1.Square;

public class TestNewSquare {
    public static void main(String[] args) {
        Square[] newSquare = new NewSquare[2];
        newSquare[0] = new NewSquare(5);
        newSquare[1] = new NewSquare();
        for (Square square : newSquare) {
            System.out.println("Diện tích hình vuông : "+square.getArea());
            if (square instanceof Colorable) {
                System.out.println(((Colorable) square).howToColor());
            }
        }
    }
}
