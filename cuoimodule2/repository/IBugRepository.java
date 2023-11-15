package cuoimodule2.repository;

import cuoimodule2.module.Bug;

import java.util.List;

public interface IBugRepository {
    List<Bug> showList();

    boolean findId(String id);

    void addBug(Bug bug);
}
