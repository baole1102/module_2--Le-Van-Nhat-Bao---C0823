package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.util.List;

public class UserService implements IUserService{
    private final IUserRepository iUserRepository = new UserRepository();
    @Override
    public void insertUser(User user) {
        iUserRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return iUserRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return iUserRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return iUserRepository.updateUser(user);
    }
}
