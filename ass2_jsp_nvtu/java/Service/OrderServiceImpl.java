package Service;

import java.util.List;

import Entity.Order;

public interface OrderServiceImpl {
   List<Order> getAllOrder();
   boolean insertOrder(Order order);
   boolean updateOrder(int id,Order order);
   boolean deleteOrder(int id);
   int getNumberOfOrderRows();
   List<Order> findCountriesOrPrevious(int currentPage,int numberOfPage);
}
