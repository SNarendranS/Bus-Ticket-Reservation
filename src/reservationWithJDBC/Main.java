package reservationWithJDBC;
import java.sql.SQLException;
import java.util.*;
public class Main {

	public static void main(String[] args){
		

		BusDAO busDAO=new BusDAO();
		try {
			busDAO.displayBusInfo();
			int userOpt=1;
			Scanner scanner=new Scanner(System.in);
			

			
			while(userOpt==1) {
				System.out.println("Enter 1 to book and 2 to exit");
				userOpt=scanner.nextInt();
				if(userOpt==1) {
					Booking booking=new Booking();
					if(booking.isAvailable()) {
						BookingDAO bookingDAO=new BookingDAO();
						bookingDAO.addBooking(booking);
						System.out.println("Your booking is confirmed");
					}
					else {
						System.out.println("Sorry!, Bus is full. Try another date/bus.");
					}
				}
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
