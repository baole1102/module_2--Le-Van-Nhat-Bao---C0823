package ss7_AbstractclassandInterface.exc.BT1;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0]=new Square();
        squares[1]= new Square(1);
        squares[2]=new Square(2,"orange", true);
        System.out.println("Pre-souted: ");
        for (Square square : squares) {
            System.out.println(square);
        }
        System.out.println("After-souted: ");
        for (Square square : squares) {
            square.resize(50);
            System.out.println(square);
        }
    }
}
