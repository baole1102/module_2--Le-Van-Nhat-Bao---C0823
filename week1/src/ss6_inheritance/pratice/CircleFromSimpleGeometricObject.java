package ss6_inheritance.pratice;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    @Override
    public String toString() {
        return super.toString() + "\nradius is " ;
    }

    public static void main(String[] args) {
        CircleFromSimpleGeometricObject a = new CircleFromSimpleGeometricObject();
        System.out.println(a.toString());
    }
}

