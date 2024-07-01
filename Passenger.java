package String;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private String name;
	private String passportNumber;
	private String bookedFlight;
	private List<Flight> bookedFlights;
	
	public Passenger (String name, String passportNumber) {
		this.name = name;
		this.passportNumber = passportNumber;
		 this.bookedFlights = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public List<Flight> getBookedFlight() {
		return bookedFlights;
	}
	//method
	public void bookFlight(Flight flight) {
		if (flight.isAvailable()) {
			flight.bookFlight();
			bookedFlight.add(flight);
		}
		else {
			 System.out.println("Flight is not available.");
		}
	}
	 public void cancelBooking(Flight flight) {
	        if (bookedFlights.contains(flight)) {
	            flight.cancelBooking();
	            bookedFlights.remove(flight);
	        } else {
	            System.out.println("Flight not found in booked flights.");
	        }
	    }
    public String toString() {
    	 return "Passenger{" +
                 "name='" + name + '\'' +
                 ", passportNumber='" + passportNumber + '\'' +
                 ", bookedFlights=" + bookedFlights +
                 '}';
     }
    }

