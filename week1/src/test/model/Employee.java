package test.model;

public class Employee {
    private String id;
    private String name;
    private String location;
    private String level;
    private double saraly;

    public Employee() {
    }

    public Employee(String name, String location, String level, double saraly) {
        this.name = name;
        this.location = location;
        this.level = level;
        this.saraly = saraly;
    }

    public Employee(String id, String name, String location, String level, double saraly) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
                ", level='" + level + '\'' +
                ", saraly=" + saraly +
                '}';
    }
}
