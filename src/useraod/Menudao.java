package useraod;

import java.util.List;

import model.Menu;

public interface Menudao {
    int insertMenu(Menu menu);           //dome
    List<Menu> getAllMenu();               //done
    Menu getMenuById(int menu_id);          //done
    int deleteMenuById(int id);             //done
    int updateMenuById(int id,String itemname);
    
}
