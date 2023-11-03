package case_study.service;

import case_study.model.inforFacility.Facility;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.Map;

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
}
