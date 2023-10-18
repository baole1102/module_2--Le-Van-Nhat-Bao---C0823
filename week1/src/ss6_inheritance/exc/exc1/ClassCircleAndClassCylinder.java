package ss6_inheritance.exc.exc1;

public class ClassCircleAndClassCylinder {
    public static void main(String[] args) {
        Circle circle =new Circle(4,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5,3,"green");
        System.out.println(cylinder);
    }
}
