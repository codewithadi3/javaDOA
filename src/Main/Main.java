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

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1d22541 (Initial commit)
    // User user = udao.getUserById(2);
    // System.out.println(user);
//  int status = udao.deleteById(2);
//  System.out.println(status+" rows got deleted");

int status = udao.updateUserById(1,"amalapuram");
System.out.println(status +"rows have been updated");
<<<<<<< HEAD
=======
    User user = udao.getUserById(2);
    System.out.println(user);
    
>>>>>>> 92efae40d7ccc116fa05bc669084ac940765a1da
=======
>>>>>>> 1d22541 (Initial commit)

}
}
