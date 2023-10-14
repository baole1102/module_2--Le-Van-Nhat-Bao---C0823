package ss6_inheritance.pratice.TH1;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
//    public double getDiameter(){
//        return 2*radius;
//    }
//    public void printCircle(){
//        System.out.println("The" + getColor() + " circle is created with the radius is"+radius);
//    }

    @Override
    public String toString() {
        return "A Circle with radius = "+getRadius()+" ,which is a subclass of"+ super.toString();
    }
}

