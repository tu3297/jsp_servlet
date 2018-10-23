package Service;

import java.util.List;

import Dao.OrderDao;
import Dao.OrderImpl;
import Entity.Order;

public class OrderService  implements OrderServiceImpl{
    private OrderImpl oderDao=null;
	@Override
	public List<Order> getAllOrder() {
		oderDao=new OrderDao();
		// TODO Auto-generated method stub
		return oderDao.getAllOrder();
	}
	@Override
	public boolean insertOrder(Order order) {
		// TODO Auto-generated method stub
		oderDao=new OrderDao();
		return oderDao.insertOrder(order);
		
	}
	@Override
	public boolean updateOrder(int id, Order order) {
		// TODO Auto-generated method stub
		oderDao=new OrderDao();
		return oderDao.updateOrder(id, order);
	}
	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		oderDao=new OrderDao();
		return oderDao.deleteOrder(id);
	}

}
