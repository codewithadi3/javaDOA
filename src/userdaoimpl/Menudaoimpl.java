package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Menu;
import model.Restaraunt;
import useraod.Menudao;

public class Menudaoimpl implements Menudao {
   private static Connection con;
   int x =-1;
    Menu menu;
     ArrayList<Menu> menulist = new ArrayList<Menu>();
     private PreparedStatement pstmt;
     private Statement stmt;
     private ResultSet resset;
     private ResultSet res;
     private static final String INSERT_INTO_MENU = "insert into menu(menu_id,res_id,itemname,description,price,isAvailable) values(?,?,?,?,?,?)";
     private static final String GET_ALL_MENUS = "select * from menu";
     private static final String GET_MENU_BY_ID = "select * from menu where menu_id= ?";
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
    public int insertMenu(Menu menu) {
        try{
                    pstmt = con.prepareStatement(INSERT_INTO_MENU);
                    pstmt.setInt(1,menu.getMenu_id());
                    pstmt.setInt(2,menu.getRes_id());
                    pstmt.setString(3,menu.getItem_name());
                    pstmt.setString(4,menu.getDescription());
                    pstmt.setFloat(5,menu.getPrice());
                    pstmt.setBoolean(6,menu.isAvailable());    
                    x = pstmt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public List<Menu> getAllMenu() {
        try{
                stmt=con.createStatement();
                resset = stmt.executeQuery(GET_ALL_MENUS);
                menulist = extractUserDatafromResultSet(resset);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return menulist;
    }

    @Override
    public Menu getMenuById(int menu_id) {
        try{
                pstmt = con.prepareStatement(GET_MENU_BY_ID);
                pstmt.setInt(1,menu_id);
                resset = pstmt.executeQuery();
               menulist = extractUserDatafromResultSet(resset);
                menu = menulist.get(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return menu;
    }

    @Override
    public int deleteMenuById(int id) {
        try{

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public int updateMenuById(int id) {
        try{

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }
    ArrayList<Menu> extractUserDatafromResultSet(ResultSet resset){
        try{
            while(resset.next()){
                menulist.add(new Menu(resset.getInt(1),resset.getInt(2),resset.getString(3),resset.getString(4),resset.getFloat(5),resset.getBoolean(6)));
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return menulist;
    }
}
