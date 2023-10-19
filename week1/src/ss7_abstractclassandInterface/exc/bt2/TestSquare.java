package ss7_abstractclassandInterface.exc.bt2;

public class TestSquare {
    public static void main(String[] args) {
        ss7_abstractclassandInterface.exc.bt1.Square[] newSquare = new Square[2];
        newSquare[0] = new Square(5);
        newSquare[1] = new Square();
        for (ss7_abstractclassandInterface.exc.bt1.Square square : newSquare) {
            System.out.println("Diện tích hình vuông : "+square.getArea());
            if (square instanceof Colorable) {
                System.out.println(((Colorable) square).howToColor());
            }
        }
    }
}
