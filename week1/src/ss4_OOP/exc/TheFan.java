package ss4_OOP.exc;

public class TheFan {
    private int slow = 1;
    private int speed = slow;
    private int medium = 2;
    private int fast = 3;
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

    public boolean setOn() {
        return on = true;
    }

    public boolean setOff() {
        return on = false;
    }

    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString () {
        if (!on) {
           return ("Speed: " + speed + " Color: " + color + " Radius: " + radius + "\n fan is off");
        } else {
            return  ("Speed: " + speed + " Color: " + color + " Radius: " + radius + "\n fan is on");
        }
    }

}
