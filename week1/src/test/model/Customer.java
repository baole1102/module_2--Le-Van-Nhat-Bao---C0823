package test.model;

public class Customer {
    private String id;
    private String name;
    private String location;
    private String date;
    private double saraly;

    public Customer() {
    }

    public Customer(String name, String location, String date, double saraly) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.saraly = saraly;
    }

    public Customer(String id, String name, String location, String date, double saraly) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSaraly() {
        return saraly;
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", saraly=" + saraly +
                '}';
    }
}

