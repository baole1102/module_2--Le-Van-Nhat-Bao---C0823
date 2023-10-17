package ss7_AbstractclassandInterface.exc.BT2;

import ss7_AbstractclassandInterface.exc.BT1.Square;

public class NewSquare extends Square implements Colorable {
    NewSquare() {
    }

    NewSquare(double side) {
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
