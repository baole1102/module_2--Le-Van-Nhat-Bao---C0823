package case_study.model.inforFacility;

public class House extends Facility{
    private String standar;
    private int numberFloor;

    public House() {
    }

    public House(String standar, int numberFloor) {
        this.standar = standar;
        this.numberFloor = numberFloor;
    }

    public House(String code, String name, long cost, String location, String status, String standar, int numberFloor) {
        super(code, name, cost, location, status);
        this.standar = standar;
        this.numberFloor = numberFloor;
    }

    public String getStandar() {
        return standar;
    }

    public void setStandar(String standar) {
        this.standar = standar;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                ", Standar='" + standar + '\'' +
                ", NumberFloor=" + numberFloor +
                '}';
    }
}
