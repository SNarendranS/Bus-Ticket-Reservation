package reservationWithJDBC;

import java.sql.*;

public class DbConnection {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/busreservation";
	private static final String userName = "root";
	private static final String password = "nnn123";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
}
