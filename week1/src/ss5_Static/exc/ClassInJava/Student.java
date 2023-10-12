package ss5_Static.exc.ClassInJava;

public class Student {
    private static String name = "John";
    private static String classes = "CO2";
    Student(){}

     public void setName(String name) {
        Student.name = name;
        System.out.println(name);
    }

     public void setClasses(String classes) {
        Student.classes = classes;
         System.out.println(classes);
    }
}
