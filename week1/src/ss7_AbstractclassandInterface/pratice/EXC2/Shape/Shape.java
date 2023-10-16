package ss7_AbstractclassandInterface.pratice.EXC2.Shape;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;

    protected Shape() {
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + "and" + (filled ? "filled":"not filled");
    }}
