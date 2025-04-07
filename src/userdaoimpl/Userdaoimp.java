package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.User;
import useraod.Userdao;

public class Userdaoimp implements Userdao{
    User user;
    static Connection con;
    ArrayList<User> userlist = new ArrayList<User>();
   private static final String INSERT_USER = "insert into user(username,password,email,address,role) values(?,?,?,?,?)";
   private static final String GET_ALL_USERS = "select * from user";
   private static final String GET_USER_BY_ID = " select * from user where user_id = ?";

    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet res;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "root", "root");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public int deleteById(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
       try{
             stmt = con.createStatement();
             res = stmt.executeQuery(GET_ALL_USERS);
            userlist =  (ArrayList<User>) extractUserDatafromResultSet(res);
             
       }
       catch(Exception e){
        e.printStackTrace();
       }
        return userlist;
    }

    @Override
    public User getUserById(int id) {
        try{
           pstmt = con.prepareStatement(GET_USER_BY_ID);
           pstmt.setInt(1,id);
           res = pstmt.executeQuery();
           userlist = (ArrayList<User>) extractUserDatafromResultSet(res);
           user = userlist.get(0);
      }

      catch(Exception e){
       e.printStackTrace();
      }
        return user;
    }

    @Override
    public int insertUser(User user) {
        int x = -1;
      try{
        pstmt= con.prepareStatement(INSERT_USER);
        pstmt.setString(1,user.getUsername());
        pstmt.setString(2,user.getPassword());
        pstmt.setString(3,user.getEmail());
        pstmt.setString(4,user.getAddress());
        pstmt.setString(5,user.getRole());
        x  = pstmt.executeUpdate();
      }
      catch(Exception e){
        e.printStackTrace();
      }
      return x;
        
    }

    @Override
    public int updateUserById(int id, String address) {
        try{
            
            
        }
        catch(Exception e){
         e.printStackTrace();
        }
        return 0;
    }
    List<User> extractUserDatafromResultSet(ResultSet res){
        try{
            while(res.next()){
                userlist.add(new User(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)));
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return userlist;
    }

}
