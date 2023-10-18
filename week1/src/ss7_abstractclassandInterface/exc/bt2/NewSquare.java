package ss7_abstractclassandInterface.exc.bt2;

import ss7_abstractclassandInterface.exc.bt1.Square;

public class NewSquare extends Square implements Colorable {
    public NewSquare() {
    }

    public NewSquare(double side) {
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
