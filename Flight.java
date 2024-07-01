package String;

public class Flight {
	private static final String Flight = null;
	private String flightNumber; 
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private boolean isAvailable;
	
	public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.isAvailable = true; //if a flight is available Default
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void bookFlight() {
		if (isAvailable) {
			this.isAvailable = false;
		}
		else {
			System.out.println("Flight is already booked");
		}
	}
		
		public void cancelBooking() {
			if (isAvailable) {
				this.isAvailable = true;
			}
			else {
				System.out.println("Flight is not booked");
			}
	}
	public String toString() {
		return Flight;
	}	
}
