package cuoimodule2.service;

import cuoimodule2.module.Bug;

import java.util.List;

public interface IBugService {
    List<Bug> showList();

    boolean findId(String id);

    void addBug(Bug bug);
}
