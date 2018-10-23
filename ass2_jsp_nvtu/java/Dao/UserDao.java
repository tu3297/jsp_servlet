package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Commom.ConnectDatabase;
import Entity.User;

public class UserDao implements UserDaoImpl {
	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		try {
			Connection connection=ConnectDatabase.getSQLServerConnection();
			String sql="insert into Persons values(?,?)";
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		      connection.setAutoCommit(false);
		      preparedStatement.setString(1, user.getUserName());
		      preparedStatement.setString(2, user.getPass());
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
	public int userLogin(User user) {
		int check=0;
		try {
			Connection connection=ConnectDatabase.getSQLServerConnection();
			String sql="select count(*) from Persons A where A.username=? and A.pass=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
		      connection.setAutoCommit(false);
		      preparedStatement.setString(1, user.getUserName());
		      preparedStatement.setString(2, user.getPass());
		      connection.setAutoCommit(true);
		      ResultSet rs=preparedStatement.executeQuery();
		      while(rs.next()){
		    	  check=rs.getInt(1);
		      }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public int checkUserName(String userName) {
		// TODO Auto-generated method stub
		int check=0;
		try {
			 Connection connection=ConnectDatabase.getSQLServerConnection();
			 String sql="select count(*) from persons A where A.username = ?";
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			  connection.setAutoCommit(false);
			 preparedStatement.setString(1, userName);
			  connection.setAutoCommit(true);
			 ResultSet rs=preparedStatement.executeQuery();
			 while(rs.next()){
				 check=rs.getInt(1);
			 }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
		
}
