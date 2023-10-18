package ss5_static.exc.ClassInJava;

public class MyClass {
    static public int X = 2;
    public static void main(String[] args) {
        MyClass object1 = new MyClass();
        MyClass object2 = new MyClass();
        MyClass.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", object1.X, object2.X, MyClass.X);
    }
}
