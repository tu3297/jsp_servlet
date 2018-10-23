package Commom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException {
	    String hostName = "localhost";
	    String sqlInstanceName = "PC10\\SQLEXPRESS";
	    String database = "sql_final";
	    String userName = "";
	    String password = "";
	    return getSQLServerConnection(hostName, sqlInstanceName, database, userName, password);
	  }
	  public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String database,
	      String userName, String password) {
	    try {
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + sqlInstanceName + ";databaseName="+database+";integratedsecurity = true";
	    Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	       return conn;
	    }catch(SQLException | ClassNotFoundException e){
	    	e.printStackTrace();
	      return null;
	    } 
	  }
	  public static void main(String[] args) {
         try {
          System.out.println(ConnectDatabase.getSQLServerConnection());
        } catch (ClassNotFoundException | SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
}
