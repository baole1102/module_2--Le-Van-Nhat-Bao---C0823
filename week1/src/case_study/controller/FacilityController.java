package case_study.controller;


import case_study.model.inforFacility.Facility;
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

    public void editFacility(String id, Facility facility) {
        iFacilityService.editFacility(id,facility);
    }
}
