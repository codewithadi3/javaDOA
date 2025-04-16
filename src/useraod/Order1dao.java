package useraod;

import model.Order1;

public interface Order1dao  {
    int updateOrder(int ord_id,String status);
    Order1 fetchbyOrd_id(int ord_id);
    int insertOrd(Order1 ord);

}
