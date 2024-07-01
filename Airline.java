package String;


	public class Airline {
		private Flight[] flights;
	    private Passenger[] passengers;
	    private int flightCount;
	    private int passengerCount;

	    public Airline() {
	        this.flights = new Flight[10]; // assuming  10 flights
	        this.passengers = new Passenger[5]; // assuming  5 passengers
	        this.flightCount = 0;
	        this.passengerCount = 0;
	}
	    
	    public void addFlight(Flight flight) {
	        if (flightCount < flights.length) {
	            flights[flightCount] = flight;
	            flightCount++;
	        }
	    }

	    public void removeFlight(String flightNumber) {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                flights[i] = null;
	                flightCount--;
	                break;
	            }
	        }
	    }

	    public void registerPassenger(Passenger passenger) {
	        if (passengerCount < passengers.length) {
	            passengers[passengerCount] = passenger;
	            passengerCount++;
	        }
	    }

	    public void unregisterPassenger(String passportNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                passengers[i] = null;
	                passengerCount--;
	                break;
	            }
	        }
	    }

	    public void bookFlight(String passportNumber, String flightNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                for (int j = 0; j < flightCount; j++) {
	                    if (flights[j].getFlightNumber().equals(flightNumber) && flights[j].isAvailable()) {
	                        passengers[i].bookFlight(flights[j]);
	                        break;
	                    }
	                }
	                break;
	            }
	        }
	    }

	    public void cancelBooking(String passportNumber, String flightNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                for (int j = 0; j < flightCount; j++) {
	                    if (flights[j].getFlightNumber().equals(flightNumber) &&!flights[j].isAvailable()) {
	                        passengers[i].cancelBooking(flights[j]);
	                        break;
	                    }
	                }
	                break;
	            }
	        }
	    }

	    public void listAvailableFlights() {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].isAvailable()) {
	                System.out.println(flights[i].toString());
	            }
	        }
	    }

	    public void listBookedFlights() {
	        for (int i = 0; i < flightCount; i++) {
	            if (!flights[i].isAvailable()) {
	                System.out.println(flights[i].toString());
	            }
	        }
	    }
	}
	
