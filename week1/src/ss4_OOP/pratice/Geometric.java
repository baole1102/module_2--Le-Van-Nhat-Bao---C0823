package ss4_OOP.pratice;

public class Geometric {
    String name;
    int age;
    double height;

    public Geometric(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public String setName(String name) {
       return this.name = name;
    }

    public int getAge(int age) {
       return this.age = age;
    }

    public double getHeight(double height) {
      return   this.height = height;
    }
}

