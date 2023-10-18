package ss6_inheritance.exc.exc1;

public class Cylinder extends Circle {
    private double height;

   public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height + " and Volume = " + getVolume() + " and Color = " + getColor() + " and Radius = " + getRadius() +
                '}';
    }
}
