package useraod;

import model.OrderHistory;

public interface OrderHistorydao {
    int insertOrderHistory(OrderHistory orderHistory);
    
    int updateOrderHistoryStatus(int orderhis_id, String newStatus);
    
}
