package ss5_static.exc.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle (){}
    public Circle(double r){
      this.radius = r;
      this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*2*Math.PI;
    }


}
