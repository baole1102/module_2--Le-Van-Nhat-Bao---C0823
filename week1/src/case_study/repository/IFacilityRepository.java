package case_study.repository;



import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;

import java.util.Map;
import java.util.Set;

public interface IFacilityRepository {

    Map<Facility, Integer> showList();

    boolean find(String id);

    void addVilla(Facility facility, int count);

    void remove(String id);

    Set<Facility> findName(String name);

    void editVilla(String id, Villa villa);

    void editHouse(String id, House house);

    void editRoom(String id, Room room);
}
