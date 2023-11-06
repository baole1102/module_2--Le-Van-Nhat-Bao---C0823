package case_study.repository.impl;

import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;
import case_study.repository.IFacilityRepository;

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

    @Override
    public Set<Facility> findName(String name) {
        Set<Facility> keySet = facilitys.keySet();
        Set<Facility> newKeySet = new LinkedHashSet<>();
        for (Facility key : keySet) {
            if (key.getName().toLowerCase().contains(name.toLowerCase())){
                newKeySet.add(key);
            }
        }
       return newKeySet;
    }

    @Override
    public void editVilla(String id, Villa villa) {
        Set<Facility> keySet = facilitys.keySet();
        for (Facility key : keySet) {
            if (key instanceof Villa) {
                key.setCode(id);
               key.setName(villa.getName());
               key.setCountPerson(villa.getCountPerson());
               key.setCost(villa.getCost());
               key.setLocation(villa.getLocation());
               key.setStatus(villa.getStatus());
               ((Villa) key).setStandar(villa.getStandar());
               ((Villa) key).setAcreage(villa.getAcreage());
               ((Villa) key).setNumberFloor(villa.getNumberFloor());
            }
        }
    }

    @Override
    public void editHouse(String id, House house) {
        Set<Facility> keySet = facilitys.keySet();
        for (Facility key : keySet) {
            if (key instanceof House) {
                key.setCode(id);
                key.setName(house.getName());
                key.setCountPerson(house.getCountPerson());
                key.setCost(house.getCost());
                key.setLocation(house.getLocation());
                key.setStatus(house.getStatus());
                ((House) key).setStandar(house.getStandar());
                ((House) key).setNumberFloor(house.getNumberFloor());
            }
        }
    }

    @Override
    public void editRoom(String id, Room room) {
        Set<Facility> keySet = facilitys.keySet();
        for (Facility key : keySet) {
            if (key instanceof Room) {
                key.setCode(id);
                key.setName(room.getName());
                key.setCountPerson(room.getCountPerson());
                key.setCost(room.getCost());
                key.setLocation(room.getLocation());
                key.setStatus(room.getStatus());
                ((Room) key).setAttrachFreeService(room.getAttrachFreeService());
            }
        }
    }
}
