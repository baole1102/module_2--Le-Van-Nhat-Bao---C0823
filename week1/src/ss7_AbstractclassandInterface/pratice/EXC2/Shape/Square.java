package ss7_AbstractclassandInterface.pratice.EXC2.Shape;

public class Square extends Rectangle {
    Square(){}
    Square (double side){
        super(side,side);
    }
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
