package model;

public class OrderItems {
  int orderitem_id;
  int ord_id;
  int menu_id;
  int quantity;
  float sub_total;
  public int getOrderitem_id() {
    return orderitem_id;
  }
  public void setOrderitem_id(int orderitem_id) {
    this.orderitem_id = orderitem_id;
  }
  public int getOrd_id() {
    return ord_id;
  }
  public void setOrd_id(int ord_id) {
    this.ord_id = ord_id;
  }
  public int getMenu_id() {
    return menu_id;
  }
  public void setMenu_id(int menu_id) {
    this.menu_id = menu_id;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public float getSub_total() {
    return sub_total;
  }
  public void setSub_total(float sub_total) {
    this.sub_total = sub_total;
  }
  public OrderItems(int orderitem_id, int ord_id, int menu_id, int quantity, float sub_total) {
    this.orderitem_id = orderitem_id;
    this.ord_id = ord_id;
    this.menu_id = menu_id;
    this.quantity = quantity;
    this.sub_total = sub_total;
  }
  @Override
  public String toString() {
    return  orderitem_id + "     " + ord_id + "    " + menu_id + "     "
            + quantity + "    " + sub_total + "          ";
  }
  
}
