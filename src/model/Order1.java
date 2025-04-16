package model;

public class Order1 {
    int ord_id;
    int user_id;
    int res_id;
    float total_amount;
    String Ord_status;
    String payment_option;
    public int getOrd_id() {
        return ord_id;
    }
    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getRes_id() {
        return res_id;
    }
    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }
    public float getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }
    public String getOrd_status() {
        return Ord_status;
    }
    public void setOrd_status(String ord_status) {
        Ord_status = ord_status;
    }
    public String getPayment_option() {
        return payment_option;
    }
    public void setPayment_option(String payment_option) {
        this.payment_option = payment_option;
    }
    public Order1(int ord_id, int user_id, int res_id, float total_amount, String ord_status, String payment_option) {
        this.ord_id = ord_id;
        this.user_id = user_id;
        this.res_id = res_id;
        this.total_amount = total_amount;
        Ord_status = ord_status;
        this.payment_option = payment_option;
    }
    @Override
    public String toString() {
        return ord_id + "    " + user_id + "    " + res_id + "   "
                + total_amount + "    " + Ord_status + "    " + payment_option + "        ";
    }

}
