package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
     private Statement stmt;
     private ResultSet resset;
     private static final String INSERT_RES = "insert into restaraunt(restaraunt_id,restaraunt_name,restaraunt_address,restaraunt_active) values(?,?,?,?)";
     private static final String GET_ALL_RES = "select * from restaraunt";
     private static final String GET_RES_BY_ID = "select * from restaraunt where restaraunt_id= ?";
     private static final String DELETE_RES_BY_ID = "delete from restaraunt where restaraunt_id= ?";
     private static final String UPDATE_RES_BY_ID = "update restaraunt set restaraunt_active = ? where restaraunt_id= ?";
    


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
               int x=pstmt.executeUpdate();
       }
       catch(Exception e){

       }
       return x;
    }


    @Override
    public List<Restaraunt> getAllres() {
        try{
                stmt = con.createStatement();
                resset = stmt.executeQuery(GET_ALL_RES);
                reslist = extractUserDatafromResultSet(resset);

        }
        catch(Exception e){
 
        }
        return reslist;
    }

    @Override
    public Restaraunt getResById(int id) {
        try{
                pstmt = con.prepareStatement(GET_RES_BY_ID);
                pstmt.setInt(1,id);
                resset = pstmt.executeQuery();
                reslist = (ArrayList<Restaraunt>) extractUserDatafromResultSet(resset);
                res = reslist.get(0);

        }
        catch(Exception e){
 
        }
        return res;
    }

    @Override
    public int deleteResById(int id) {
        try{
                pstmt = con.prepareStatement(DELETE_RES_BY_ID);
                pstmt.setInt(1,id);
                x = pstmt.executeUpdate();
                
        }
        catch(Exception e){
 
        }
        return x;
    }

    @Override
    public int updateResById(int id, boolean isActive) {
        try{
            pstmt = con.prepareStatement(UPDATE_RES_BY_ID);
            pstmt.setInt(2,id);
            pstmt.setBoolean(1,isActive);
            x =pstmt.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }

    ArrayList<Restaraunt> extractUserDatafromResultSet(ResultSet resset){
        try{
            while(resset.next()){
                reslist.add(new Restaraunt(resset.getInt(1),resset.getString(2),resset.getString(3),resset.getBoolean(4)));
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return reslist;
    }

}
