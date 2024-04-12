package reservationWithJDBC;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter name of passenger: ");
		this.passengerName=scanner.next();
		
		System.out.println("Enter bus no: ");
		this.busNo =scanner.nextInt();
		
		System.out.println("Enter date(dd-mm-yyyy): ");
		String dateInput =scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable() throws SQLException{
		BusDAO busDAO=new BusDAO();
		BookingDAO bookingDAO=new BookingDAO();
		int capacity=busDAO.getCapacity(busNo);

		int booked=bookingDAO.getBookedCount(busNo,date);
				
		return booked<capacity;
	}
}