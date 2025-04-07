package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import model.Restaraunt;

import useraod.Restarauntdao;

public class Restarauntdaoimpl implements Restarauntdao {


    private static Connection con;
    int x =-1;
    Restaraunt res;
     ArrayList<Restaraunt> reslist = new ArrayList<Restaraunt>();
     private PreparedStatement pstmt;
     private static final String INSERT_RES = "insert into restaraunt(restaraunt_id,restaraunt_name,restaraunt_address,restaraunt_active) values(?,?,?,?)";
    


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
    public int insertRestaraunt(Restaraunt res) {
       try{
                pstmt= con.prepareStatement(INSERT_RES);
                pstmt.setInt(1,res.getRestaraunt_id());
                pstmt.setString(2,res.getRestaraunt_name());
                pstmt.setString(3,res.getRestaraunt_address());
                pstmt.setBoolean(4,res.isRestaraunt_active());
                x=pstmt.executeUpdate();
       }
       catch(Exception e){

       }
       return x;
    }


    @Override
    public List<Restaraunt> getAllres() {
        try{

        }
        catch(Exception e){
 
        }
        return reslist;
    }

    @Override
    public Restaraunt getResById(int id) {
        try{

        }
        catch(Exception e){
 
        }
        return res;
    }

    @Override
    public int deleteResById(int id) {
        try{

        }
        catch(Exception e){
 
        }
        return x;
    }

    @Override
    public int updateResById(int id, boolean isActive) {
        try{

        }
        catch(Exception e){
 
        }
        return x;
    }

}
