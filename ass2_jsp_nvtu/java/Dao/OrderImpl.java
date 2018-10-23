package Dao;

import java.util.List;

import Entity.Order;

public interface OrderImpl {
   List<Order> getAllOrder();
   boolean insertOrder(Order order);
   boolean updateOrder(int id,Order order);
   boolean deleteOrder(int id);
}
