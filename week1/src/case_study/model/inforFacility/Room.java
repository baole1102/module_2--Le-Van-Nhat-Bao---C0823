package case_study.model.inforFacility;

public class Room extends Facility{
private String attrachFreeService;

    public Room() {
    }

    public Room(String code, String name, long cost, String location, String status, String attrachFreeService) {
        super(code, name, cost, location, status);
        this.attrachFreeService = attrachFreeService;
    }

    public Room(String attrachFreeService) {
        this.attrachFreeService = attrachFreeService;
    }

    public String getAttrachFreeService() {
        return attrachFreeService;
    }

    public void setAttrachFreeService(String attrachFreeService) {
        this.attrachFreeService = attrachFreeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                ", attrachFreeService='" + attrachFreeService + '\'' +
                '}';
    }
}
