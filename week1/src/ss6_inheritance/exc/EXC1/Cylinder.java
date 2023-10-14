package ss6_inheritance.exc.EXC1;

import ss6_inheritance.exc.EXC1.Circle;

public class Cylinder extends Circle {
    private double height;

    Cylinder(double height, double radius, String color) {
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
