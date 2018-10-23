package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Commom.ConnectDatabase;
import Commom.ConstantApplication;
import Entity.Car;
import Entity.Order;

public class OrderDao implements OrderImpl {
  public static final String SELECT_ALL_ORDER        = "select *from car_order";
  public static final String INSERT_ORDER            = "insert into Car_Order values(?,?,?,?,?,?,?,?,?,?)";
  public static final String DELETE_ORDER            = "delete from car_order where orderId=?";
  public static final String UPDATE_ORDER            = "update car_order set amount=?,saleprice=?,orderdate=?,deliverydate=?,deliveryadress=?,status=?,note=? where orderid=?";
  public static final String GET_NUMBER_OF_ORDER_ROW = "select count(*) from car_order";
  public static final String GET_ORDER_LIMITOFFSET="select *from car_order limit=?,offset=?";

  @Override
  public List<Order> getAllOrder() {
    // TODO Auto-generated method stub
    Connection connection = null;
    Order order = null;
    List<Order> listOrder = new ArrayList<>();
    try {
      connection = ConnectDatabase.getSQLServerConnection();
      String sql = ConstantApplication.SELECT_ALL_ORDER;
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        order = new Order();
        order.setOrderId(rs.getInt(1));
        order.setCustomerId(rs.getInt(2));
        order.setCarId(rs.getInt(3));
        order.setAmount(rs.getInt(4));
        order.setSalePrice(rs.getString(5));
        order.setOrderDate(rs.getString(6));
        order.setDeliveryDate(rs.getString(7));
        order.setDeliveryAdress(rs.getString(8));
        order.setOrderStatus(rs.getString(9));
        order.setNote(rs.getString(10));
        listOrder.add(order);
      }
      return listOrder;
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
    // TODO Auto-generated method stub
  }

  @Override
  public boolean insertOrder(Order order) {
    // TODO Auto-generated method stub
    Connection connection = null;
    try {
      connection = ConnectDatabase.getSQLServerConnection();
      String sql = ConstantApplication.INSERT_ORDER;
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      connection.setAutoCommit(false);
      preparedStatement.setInt(1, order.getOrderId());
      preparedStatement.setInt(2, order.getCustomerId());
      preparedStatement.setInt(3, order.getCarId());
      preparedStatement.setInt(4, order.getAmount());
      preparedStatement.setString(5, order.getSalePrice());
      preparedStatement.setString(6, order.getOrderDate());
      preparedStatement.setString(7, order.getDeliveryDate());
      preparedStatement.setString(8, order.getDeliveryAdress());
      preparedStatement.setString(9, order.getOrderStatus());
      preparedStatement.setString(10, order.getNote());
      connection.setAutoCommit(true);
      preparedStatement.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return false;
    }
    return true;
  }

  @Override
  public boolean updateOrder(int id, Order order) {
    // TODO Auto-generated method stub
    Connection connection = null;
    try {
      connection = ConnectDatabase.getSQLServerConnection();
      String sql = ConstantApplication.UPDATE_ORDER;
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      connection.setAutoCommit(false);
      preparedStatement.setInt(1, order.getAmount());
      preparedStatement.setString(2, order.getSalePrice());
      preparedStatement.setString(3, order.getOrderDate());
      preparedStatement.setString(4, order.getDeliveryDate());
      preparedStatement.setString(5, order.getDeliveryAdress());
      preparedStatement.setString(6, order.getOrderStatus());
      preparedStatement.setString(7, order.getNote());
      preparedStatement.setInt(8, id);
      connection.setAutoCommit(true);
      preparedStatement.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO: handle exception
      System.out.println(e);
      return false;
    }
    return true;

  }

  @Override
  public boolean deleteOrder(int id) {
    // TODO Auto-generated method stub
    Connection connection = null;
    try {
      connection = ConnectDatabase.getSQLServerConnection();
      String sql = ConstantApplication.DELETE_ORDER;
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      connection.setAutoCommit(false);
      preparedStatement.setInt(1, id);
      connection.setAutoCommit(true);
      preparedStatement.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO: handle exception
      System.out.println(e);
      return false;
    }
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see Dao.OrderImpl#getNumberOfOrderRows()
   */
  @Override
  public int getNumberOfOrderRows() {
    // TODO Auto-generated method stub
    Connection connection = null;
    int countRows = 0;
    try {
      connection = ConnectDatabase.getSQLServerConnection();
      String sql = GET_NUMBER_OF_ORDER_ROW;
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        countRows = rs.getInt(1);
      }
    } catch (ClassNotFoundException | SQLException e) {
      // TODO: handle exception
      System.out.println(e);
    }
    return countRows;
  }

  /* (non-Javadoc)
   * @see Dao.OrderImpl#findCountriesOrPrevious(int, int)
   */
  @Override
  public List<Order> findCountriesOrPrevious(int currentPage, int numberOfPage) {
    // TODO Auto-generated method stub
    Connection connection = null;
    Order order=null;
    List<Order> listOrder=new ArrayList<>();
    int startNumberOfPage=numberOfPage*currentPage-numberOfPage;
    try {
      connection=ConnectDatabase.getSQLServerConnection();
      String sql=GET_ORDER_LIMITOFFSET;
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setInt(1, startNumberOfPage);
      preparedStatement.setInt(2, numberOfPage);
      ResultSet rs=preparedStatement.executeQuery();
      while(rs.next()) {
           order=new Order();
           order.setOrderId(rs.getInt(1));
           order.setCustomerId(rs.getInt(2));
           order.setCarId(rs.getInt(3));
           order.setAmount(rs.getInt(4));
           order.setSalePrice(rs.getString(5));
           order.setOrderDate(rs.getString(6));
           order.setDeliveryDate(rs.getString(7));
           order.setDeliveryAdress(rs.getString(8));
           order.setOrderStatus(rs.getString(9));
           order.setNote(rs.getString(10));
           listOrder.add(order);
      }
      return listOrder;
    }catch(ClassNotFoundException | SQLException e) {
        return null;
    }
  }

}
