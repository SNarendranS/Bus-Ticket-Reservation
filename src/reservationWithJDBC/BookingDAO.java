package reservationWithJDBC;

import java.sql.*;
import java.util.Date;

public class BookingDAO {
	public int getBookedCount(int busNo,Date date) throws SQLException {
		String query="select count(*) from booking where bus_no=? and travel_date=?";
		Connection con=DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqlDate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(Booking booking)throws SQLException{
		String query="insert into booking values(?,?,?)";
		Connection con=DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqlDate=new java.sql.Date(booking.date.getTime());
		pst.setString(1, booking.passengerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqlDate);
		pst.executeUpdate();
	}
}
