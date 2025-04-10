package useraod;

import java.util.List;

import model.User;

public interface Userdao {
    int insertUser(User user);                  //done
    List<User> getAllUsers();                   //done
    User getUserById(int id);                   //done
    int deleteById(int id);                     //done            
    int updateUserById(int id,String address);  //done
}
