package ss7_abstractclassandInterface.exc.bt2;

public class Square extends ss7_abstractclassandInterface.exc.bt1.Square implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
