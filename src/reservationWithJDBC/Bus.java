package reservationWithJDBC;


public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int busNo, boolean ac, int capacity) {
		super();
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}
	
	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + ", AC:" + ac + ", capacity:" + capacity);
	}
	
}