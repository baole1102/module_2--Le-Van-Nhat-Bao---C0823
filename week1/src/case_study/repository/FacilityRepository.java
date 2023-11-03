package case_study.repository;

import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> facilitys = new LinkedHashMap<>();

    static {
        facilitys.put(new Villa("SVVL-1234", "Vina",5, 7000, "DN", "Active", "5 Star", 500, 5), 0);
        facilitys.put(new House("SVHO-4321", "Homie",5, 7000, "DN", "Active", "5 Star", 5), 0);
        facilitys.put(new Room("SVRO-1122", "Roomate",5, 7000, "DN", "Active", "Free Swimming"), 0);
    }

    @Override
    public Map<Facility, Integer> showList() {
        return facilitys;
    }

    @Override
    public boolean find(String id) {
        Set<Facility> keySet = facilitys.keySet();
        for (Facility key : keySet) {
            if (key.getCode().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addVilla(Facility facility, int count) {
        facilitys.put(facility,count+1);

    }

    @Override
    public void remove(String id) {
        Set<Facility> keySet = facilitys.keySet();
        List<Facility> list  = new ArrayList<>();
        for (Facility key : keySet) {
            if (key.getCode().equals(id)){
                list.add(key);
            }
        }
        for (Facility facility : list){
            keySet.remove(facility);
        }
    }
}
