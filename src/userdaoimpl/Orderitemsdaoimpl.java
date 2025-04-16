package userdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.OrderItems;
import useraod.Orderitemsdao;

public class Orderitemsdaoimpl implements Orderitemsdao {

    private static Connection con;
    private PreparedStatement pstmt;
    private ResultSet res;
    int x = -1;

    private static final String INSERT_ORDER_ITEM = 
        "INSERT INTO order_items(orderitem_id, ord_id, menu_id, quantity, sub_total) VALUES (?, ?, ?, ?, ?)";
    private static final String FETCH_ORDER_ITEM_BY_ID = 
        "SELECT * FROM order_items WHERE orderitem_id = ?";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int insertOrderitem(OrderItems orditems) {
        try {
            pstmt = con.prepareStatement(INSERT_ORDER_ITEM);
            pstmt.setInt(1, orditems.getOrderitem_id());
            pstmt.setInt(2, orditems.getOrd_id());
            pstmt.setInt(3, orditems.getMenu_id());
            pstmt.setInt(4, orditems.getQuantity());
            pstmt.setFloat(5, orditems.getSub_total());

            x = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    @Override
    public OrderItems fetchOrderItem(int orderitem_id) {
        OrderItems ordItem = null;
        try {
            pstmt = con.prepareStatement(FETCH_ORDER_ITEM_BY_ID);
            pstmt.setInt(1, orderitem_id);
            res = pstmt.executeQuery();

            if (res.next()) {
                ordItem = new OrderItems(
                    res.getInt("orderitem_id"),
                    res.getInt("ord_id"),
                    res.getInt("menu_id"),
                    res.getInt("quantity"),
                    res.getFloat("sub_total")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ordItem;
    }
}

