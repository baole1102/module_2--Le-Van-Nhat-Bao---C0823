package ss6_inheritance.pratice.TH1;

import ss6_inheritance.pratice.TH1.Rectangle;

public class Square extends Rectangle {
    Square() {
    }
    Square(double side){
        super(side, side);
    }
    public Square( double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth(double width){
        setWidth(width);
    }
    @Override
    public void setHeight( double height){
        setHeight(height);
    }
    @Override
    public String toString(){
        return "A Square with side = "+ getSide()+" ,which is a subclasso of "+ super.toString();
    }



}
