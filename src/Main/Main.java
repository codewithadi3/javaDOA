package Main;

import java.util.ArrayList;

import model.User;
import userdaoimpl.Userdaoimp;
import useraod.Userdao;

public class Main {
public static void main(String[] args) {
    // User u =  new User("Akhil","123","akil@gmail.com","btm","Customer");

    Userdao udao = new Userdaoimp();


//    int status =  udao.insertUser(u);
//    System.out.println(status);

//    ArrayList<User> userlist= (ArrayList<User>) udao.getAllUsers();
//    for(User u : userlist){
//     System.out.println(u);
//    }

    User user = udao.getUserById(2);
    System.out.println(user);
    

}
}
