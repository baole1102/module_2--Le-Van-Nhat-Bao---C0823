package ss6_inheritance.pratice.TH1;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    Rectangle() {

    }
    Rectangle(double width, double height){
        this.width = width;
        this.height =height;
    }
    Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height =height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle with with = " + width +
                " and length = " + height +
                " , which is a subclass of" + super.toString();
    }
}
