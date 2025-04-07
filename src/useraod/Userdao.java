package useraod;

import java.util.List;

import model.User;

public interface Userdao {
    int insertUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    int deleteById(int id);
    int updateUserById(int id,String address);
}
