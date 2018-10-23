/**
 * 
 */
package Commom;

/**
 * @author: User SDP
 * @date: Oct 23, 2018
 */
public class ConstantApplication {
     public static final String SELECT_ALL_ORDER="select *from car_order";
     public static final String INSERT_ORDER="insert into Car_Order values(?,?,?,?,?,?,?,?,?,?)";
     public static final String DELETE_ORDER="delete from car_order where orderId=?";
     public static final String UPDATE_ORDER="update car_order set amount=?,saleprice=?,orderdate=?,deliverydate=?,deliveryadress=?,status=?,note=? where orderid=?";
}
