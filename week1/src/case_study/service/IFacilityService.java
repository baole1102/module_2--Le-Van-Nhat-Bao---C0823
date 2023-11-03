package case_study.service;

import case_study.model.inforFacility.Facility;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IFacilityService {

    Map<Facility, Integer> showList();

    boolean findId(String id);

    void addVilla(Facility facility, int count);

    boolean remove(String id);

    Set<Facility> findName(String name);

    void editFacility(String id, String s);
}
