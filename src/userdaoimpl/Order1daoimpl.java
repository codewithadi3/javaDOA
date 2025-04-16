package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Order1;
import useraod.Order1dao;

public class Order1daoimpl implements Order1dao {

    private static Connection con;
    private PreparedStatement pstmt;
    private ResultSet res;
    int x = -1;

    private static final String INSERT_ORDER = 
        "INSERT INTO orders(ord_id, user_id, res_id, total_amount, ord_status, payment_option) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String FETCH_ORDER_BY_ID = 
        "SELECT * FROM orders WHERE ord_id = ?";
    private static final String UPDATE_ORDER_STATUS = 
        "UPDATE orders SET ord_status = ? WHERE ord_id = ?";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int insertOrd(Order1 ord) {
        try {
            pstmt = con.prepareStatement(INSERT_ORDER);
            pstmt.setInt(1, ord.getOrd_id());
            pstmt.setInt(2, ord.getUser_id());
            pstmt.setInt(3, ord.getRes_id());
            pstmt.setFloat(4, ord.getTotal_amount());
            pstmt.setString(5, ord.getOrd_status());
            pstmt.setString(6, ord.getPayment_option());

            x = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public Order1 fetchbyOrd_id(int ord_id) {
        Order1 ord = null;
        try {
            pstmt = con.prepareStatement(FETCH_ORDER_BY_ID);
            pstmt.setInt(1, ord_id);
            res = pstmt.executeQuery();

            if (res.next()) {
                ord = new Order1(
                    res.getInt("ord_id"),
                    res.getInt("user_id"),
                    res.getInt("res_id"),
                    res.getFloat("total_amount"),
                    res.getString("ord_status"),
                    res.getString("payment_option")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ord;
    }

    @Override
    public int updateOrder(int ord_id, String status) {
        try {
            pstmt = con.prepareStatement(UPDATE_ORDER_STATUS);
            pstmt.setString(1, status);
            pstmt.setInt(2, ord_id);

            x = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
}
