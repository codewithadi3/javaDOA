package model;

public class Menu {
   private int menu_id;
   private int res_id;
   private String item_name;
   private String description;
   private float price;
   private boolean isAvailable;
   public int getMenu_id() {
    return menu_id;
   }
   public void setMenu_id(int menu_id) {
    this.menu_id = menu_id;
   }
   public int getRes_id() {
    return res_id;
   }
   public void setRes_id(int res_id) {
    this.res_id = res_id;
   }
   public String getItem_name() {
    return item_name;
   }
   public void setItem_name(String item_name) {
    this.item_name = item_name;
   }
   public String getDescription() {
    return description;
   }
   public void setDescription(String description) {
    this.description = description;
   }
   public float getPrice() {
    return price;
   }
   public void setPrice(float price) {
    this.price = price;
   }
   public boolean isAvailable() {
    return isAvailable;
   }
   public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
   }
   public Menu(int menu_id, int res_id, String item_name, String description, float price, boolean isAvailable) {
    this.menu_id = menu_id;
    this.res_id = res_id;
    this.item_name = item_name;
    this.description = description;
    this.price = price;
    this.isAvailable = isAvailable;
   }
   public Menu() {
   }
   @Override
   public String toString() {
    return menu_id + "     " + res_id + "     " + item_name + "     "
            + description + "      " + price + "      " + isAvailable + "    ";
   }
   
}
