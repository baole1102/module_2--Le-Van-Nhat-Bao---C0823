package case_study.model.inforFacility;

public class Villa extends Facility{
    private String standar;
    private long acreage;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standar, long acreage, int numberFloor) {
        this.standar = standar;
        this.acreage = acreage;
        this.numberFloor = numberFloor;
    }

    public Villa(String code, String name, long cost, String location, String status, String standar, long acreage, int numberFloor) {
        super(code, name, cost, location, status);
        this.standar = standar;
        this.acreage = acreage;
        this.numberFloor = numberFloor;
    }

    public String getStandar() {
        return standar;
    }

    public void setStandar(String standar) {
        this.standar = standar;
    }

    public long getAcreage() {
        return acreage;
    }

    public void setAcreage(long acreage) {
        this.acreage = acreage;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                ", standar='" + standar + '\'' +
                ", acreage=" + acreage +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
