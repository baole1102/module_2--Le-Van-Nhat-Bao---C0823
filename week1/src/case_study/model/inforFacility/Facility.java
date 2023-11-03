package case_study.model.inforFacility;

public abstract class  Facility {
    private String code;
    private String name;
    private long cost;
    private String location;
    private String status;
    private int countPerson;

    public Facility(String code, String name,int countPerson, long cost, String location, String status) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.location = location;
        this.status = status;
        this.countPerson =countPerson;
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

    public int getCountPerson() {
        return countPerson;
    }

    public void setCountPerson(int countPerson) {
        this.countPerson = countPerson;
    }

    @Override
    public String toString() {
        return ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", countPerson='" + countPerson + '\'' +
                ", cost=" + cost +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' ;
    }
}
