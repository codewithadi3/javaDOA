package model;

public class OrderHistory {
 int orderhis_id;
 int user_id;
 int ord_id;
 float total;
 String order_status;
 public int getOrderhis_id() {
    return orderhis_id;
 }
 public void setOrderhis_id(int orderhis_id) {
    this.orderhis_id = orderhis_id;
 }
 public int getUser_id() {
    return user_id;
 }
 public void setUser_id(int user_id) {
    this.user_id = user_id;
 }
 public int getOrd_id() {
    return ord_id;
 }
 public void setOrd_id(int ord_id) {
    this.ord_id = ord_id;
 }
 public float getTotal() {
    return total;
 }
 public void setTotal(float total) {
    this.total = total;
 }
 public String getOrder_status() {
    return order_status;
 }
 public void setOrder_status(String order_status) {
    this.order_status = order_status;
 }
 @Override
 public String toString() {
    return   orderhis_id + "    " + user_id + "     " + ord_id + "    "
            + total + "    " + order_status + "     ";
 }

}
