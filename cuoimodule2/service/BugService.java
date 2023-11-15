package cuoimodule2.service;

import cuoimodule2.module.Bug;
import cuoimodule2.repository.BugRepository;
import cuoimodule2.repository.IBugRepository;

import java.util.List;

public class BugService implements IBugService {
    private IBugRepository iBugRepository = new BugRepository();

    @Override
    public List<Bug> showList() {
        return iBugRepository.showList();
    }

    @Override
    public boolean findId(String id) {
        return iBugRepository.findId(id);
    }

    @Override
    public void addBug(Bug bug) {
        iBugRepository.addBug(bug);
    }
}
