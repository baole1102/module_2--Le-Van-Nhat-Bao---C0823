package case_study.model.inforFacility;

public abstract class  Facility {
    private String code;
    private String name;
    private long cost;
    private String location;
    private String status;

    public Facility(String code, String name, long cost, String location, String status) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.location = location;
        this.status = status;
    }

    public Facility() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' ;
    }
}
