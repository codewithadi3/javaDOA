package useraod;

import model.OrderItems;

public interface Orderitemsdao {
   int insertOrderitem(OrderItems orditems);
   OrderItems fetchOrderItem(int orderitem_id);
}
