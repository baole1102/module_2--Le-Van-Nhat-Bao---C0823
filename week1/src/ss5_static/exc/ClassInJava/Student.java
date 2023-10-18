package ss5_static.exc.ClassInJava;

public class Student {
    private static String name = "John";
    private static String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setClasses(String classes) {
        this.classes = classes;
        System.out.println(classes);
    }
}
