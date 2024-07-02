package kukry.pp_312.service;

import kukry.pp_312.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    User showUser(int id);
    void saveUser(User user);
    void updateUser(User editedUser);
    void deleteUser(int id);
}
