package case_study.service;

import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FacilityService implements IFacilityService {

    private IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> showList() {
      return   iFacilityRepository.showList();

    }

    @Override
    public boolean findId(String id) {
       return iFacilityRepository.find(id);
    }

    @Override
    public void addVilla(Facility facility, int count) {
        iFacilityRepository.addVilla(facility,count);
    }

    @Override
    public boolean remove(String id) {
       boolean isBoolean = iFacilityRepository.find(id);
       if (!isBoolean){
           return false;
       }else {
           iFacilityRepository.remove(id);
           return true;
       }
    }

    @Override
    public Set<Facility> findName(String name) {
        return iFacilityRepository.findName(name);
    }

    @Override
    public void editVilla(String id, Villa villa) {
        iFacilityRepository.editVilla(id,villa);
    }

    @Override
    public void editHouse(String id, House house) {
        iFacilityRepository.editHouse(id,house);
    }

    @Override
    public void editRoom(String id, Room room) {
        iFacilityRepository.editRoom(id,room);
    }
}
