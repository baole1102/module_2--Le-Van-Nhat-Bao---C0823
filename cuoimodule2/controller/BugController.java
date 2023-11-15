package cuoimodule2.controller;

import cuoimodule2.module.Bug;
import cuoimodule2.service.BugService;
import cuoimodule2.service.IBugService;

import java.util.List;

public class BugController {
    private IBugService iBugService = new BugService();

    public List<Bug> showList() {
        return iBugService.showList();
    }

    public boolean findId(String id) {
        return iBugService.findId(id);
    }

    public void addBug(Bug bug) {
        iBugService.addBug(bug);
    }
}
