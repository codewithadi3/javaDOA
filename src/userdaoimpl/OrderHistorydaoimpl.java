package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.OrderHistory;
import useraod.OrderHistorydao;

public class OrderHistorydaoimpl implements OrderHistorydao {

    private static Connection con;
    private PreparedStatement pstmt;
    private ResultSet res;
    int x = -1;

    // SQL Queries
    private static final String INSERT_ORDER_HISTORY = 
        "INSERT INTO order_history(orderhis_id, user_id, ord_id, total, order_status) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_ORDER_HISTORY_STATUS = 
        "UPDATE order_history SET order_status = ? WHERE orderhis_id = ?";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int insertOrderHistory(OrderHistory orderHistory) {
        try {
            pstmt = con.prepareStatement(INSERT_ORDER_HISTORY);
            pstmt.setInt(1, orderHistory.getOrderhis_id());
            pstmt.setInt(2, orderHistory.getUser_id());
            pstmt.setInt(3, orderHistory.getOrd_id());
            pstmt.setFloat(4, orderHistory.getTotal());
            pstmt.setString(5, orderHistory.getOrder_status());

            x = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public int updateOrderHistoryStatus(int orderhis_id, String newStatus) {
        try {
            pstmt = con.prepareStatement(UPDATE_ORDER_HISTORY_STATUS);
            pstmt.setString(1, newStatus);
            pstmt.setInt(2, orderhis_id);

            x = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    

 
}
