package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Commom.ConnectDatabase;
import Entity.Car;

public class CarDao implements CarImpl {
    private Connection connection;
	@Override
	public List<Car> getAllCar() {
		List<Car> list=new ArrayList<>();
		Car car=null;
		 Connection connection;
		try {
			connection = ConnectDatabase.getSQLServerConnection();
			String sql="select *from car";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()){
				car=new Car();
				car.setMarker(rs.getString(1));
				car.setModel(rs.getString(2));
				car.setModel(rs.getString(3));
				car.setManufact(rs.getString(4));
				car.setColor(rs.getString(5));
				car.setNote(rs.getString(6));
				list.add(car);
			}
			return list;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		// TODO Auto-generated method stub
	}

}
