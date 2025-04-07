package Main;

import java.util.ArrayList;

import model.Restaraunt;
import model.User;
import userdaoimpl.Restarauntdaoimpl;
import userdaoimpl.Userdaoimp;
import useraod.Userdao;
import useraod.Restarauntdao;

public class Main {
public static void main(String[] args) {
    // User u =  new User("Akhil","123","akil@gmail.com","btm","Customer");

    // Userdao udao = (Userdao) new Userdaoimp();


//    int status =  udao.insertUser(u);
//    System.out.println(status);

//    ArrayList<User> userlist= (ArrayList<User>) udao.getAllUsers();
//    for(User u : userlist){
//     System.out.println(u);
//    }


    // User user = udao.getUserById(2);
    // System.out.println(user);
//  int status = udao.deleteById(2);
//  System.out.println(status+" rows got deleted");

// int status = udao.updateUserById(1,"amalapuram");
// System.out.println(status +"rows have been updated");

    // User user = udao.getUserById(1);
    // System.out.println(user);

    // Restaraunt res = new Restaraunt(1,"telugu inti ruchulu","amlapuram",true);
    // Restarauntdao rdao = new Restarauntdaoimpl();
    // int status = rdao.insertRestaraunt(res);
    // System.out.println(status+" rows updated succssfully");

    // Restaraunt res = new Restaraunt(2,"tamil veedu sambar","chennai",false);
    // Restarauntdao rdao = new Restarauntdaoimpl();
    // int status = rdao.insertRestaraunt(res);
    // System.out.println(status+" rows updated succssfully");


    // ArrayList<Restaraunt> reslist= (ArrayList<Restaraunt>) rdao.getAllres();
    //    for(Restaraunt u : reslist){
    //     System.out.println(u);
    //    }

    Restarauntdao rdao = new Restarauntdaoimpl();
     // Restaraunt res1 = rdao.getResById(2);
     // System.out.println(res1);

    // int status = rdao.deleteResById(2);
    // System.out.println(status + " rows got deleted");

int status = rdao.updateResById(2,true);
System.out.println(status +" rows has been updated");



}
}
