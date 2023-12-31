package ss6_inheritance.pratice;

public class Geometric {
    private String color = "white";
    private String filled = null;
    public Geometric(){}
    public Geometric(String color, String filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
