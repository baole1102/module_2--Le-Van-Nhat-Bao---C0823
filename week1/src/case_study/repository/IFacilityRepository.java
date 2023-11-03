package case_study.repository;



import case_study.model.inforFacility.Facility;

import java.util.Map;
import java.util.Set;

public interface IFacilityRepository {

    Map<Facility, Integer> showList();

    boolean find(String id);

    void addVilla(Facility facility, int count);

    void remove(String id);

    Set<Facility> findName(String name);

    void editFacility(String id, String s);
}
