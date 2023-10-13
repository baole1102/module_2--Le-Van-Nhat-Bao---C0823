package ss4_OOP.exc;

public class TheFan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    TheFan() {
    }


    private int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int getSlow() {
        return slow;
    }

    private int getMedium() {
        return medium;
    }

    private int getFast() {
        return fast;
    }

    public boolean getOn() {
        return on = true;
    }

    public boolean getOff() {
        return on = false;
    }

    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (!on) {
            return (" Color: " + color + " Radius: " + radius + "\n fan is off");
        } else {
            return ("Speed: " + speed + " Color: " + color + " Radius: " + radius + "\n fan is on");
        }
    }

}
