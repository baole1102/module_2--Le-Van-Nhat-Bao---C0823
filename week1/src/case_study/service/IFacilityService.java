package case_study.service;

import case_study.model.inforFacility.Facility;

import java.util.Map;

public interface IFacilityService {

    Map<Facility, Integer> showList();

    boolean findId(String id);

    void addVilla(Facility facility, int count);

    boolean remove(String id);
}
