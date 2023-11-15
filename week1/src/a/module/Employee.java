package a.module;

public class Employee {
    private String id;
    private String name;
    private String location;
    private String day;
    private double saraly;

    public Employee() {
    }

    public Employee(String name, String location, String day, double saraly) {
        this.name = name;
        this.location = location;
        this.day = day;
        this.saraly = saraly;
    }

    public Employee(String id, String name, String location, String day, double saraly) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.day = day;
        this.saraly = saraly;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getSaraly() {
        return saraly;
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", day='" + day + '\'' +
                ", saraly=" + saraly +
                '}';
    }
}
