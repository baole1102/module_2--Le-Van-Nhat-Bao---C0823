package case_study.controller;


import case_study.model.inforFacility.Facility;
import case_study.model.inforFacility.House;
import case_study.model.inforFacility.Room;
import case_study.model.inforFacility.Villa;
import case_study.service.FacilityService;
import case_study.service.IFacilityService;


import java.util.Map;
import java.util.Set;

public class FacilityController {

   private IFacilityService iFacilityService = new FacilityService();

    public Map<Facility, Integer> showList() {
       return iFacilityService.showList();
    }

    public boolean findId(String id) {
        return iFacilityService.findId(id);
    }

    public void addFacility(Facility facility, int count) {
        iFacilityService.addVilla(facility,count);
    }

    public boolean remove(String id) {
        return iFacilityService.remove(id);
    }

    public Set<Facility> findName(String name) {
        return iFacilityService.findName(name);
    }

    public void editVilla(String id, Villa villa) {
        iFacilityService.editVilla(id,villa);
    }

    public void editHouse(String id, House house) {
        iFacilityService.editHouse(id,house);
    }

    public void editRoom(String id, Room room) {
        iFacilityService.editRoom(id,room);
    }
}
