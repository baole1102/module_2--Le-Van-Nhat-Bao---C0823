package case_study.repository;



import case_study.model.inforFacility.Facility;

import java.util.Map;

public interface IFacilityRepository {

    Map<Facility, Integer> showList();

    boolean find(String id);
}
