package case_study.repository;

import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility,Integer> facilitys = new LinkedHashMap<>();
    static {
      facilitys.put(new Villa("SVXX-YYYY","Vina",7000,"DN","Active","5 Star",500,5),0);
      facilitys.put(new House("SVXX-YYYY","Homie",7000,"DN","Active","5 Star",5),0);
      facilitys.put(new Room("SVXX-YYYY","Roomate",7000,"DN","Active","Free Swimming"),0);
    }

    @Override
    public Map<Facility, Integer> showList() {
    return facilitys;
    }

    @Override
    public boolean find(String id) {
        Set<Facility> keySet = facilitys.keySet();
        for (Facility key:keySet){
           // if (key.)
        }
        return false;
    }
}
