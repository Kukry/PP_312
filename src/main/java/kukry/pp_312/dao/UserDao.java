package kukry.pp_312.dao;

import kukry.pp_312.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    User showUser(int id);
    void saveUser(User user);
    void updateUser(User editedUser);
    void deleteUser(int id);
}
