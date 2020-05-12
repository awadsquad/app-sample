package common;

public class Flight {

	private String destination;
	private String departure;
	private int flightNumber;
	private int passengerCount;
	private String date;
	private String time;

	public Flight() {

	}

	public Flight(String departure, String destination, int flightNumber, int passengerCount, String date, String time) {

		this.destination = destination;
		this.departure = departure;
		this.flightNumber = flightNumber;
		this.passengerCount = passengerCount;
		this.date = date;
		this.time = time;

	}

	public Flight(String departure, String destination, int passengerCount, String date, String time) {

		this.destination = destination;
		this.departure = departure;
		this.passengerCount = passengerCount;
		this.date = date;
		this.time = time;

	}
	
	public Flight(String departure, String destination, String date, String time) {
		
		this.departure = departure;
		this.destination = destination;
		this.date = date;
		this.time = time;

	}

	// getter and setters
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public int setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
		return passengerCount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	// adds passenger to flight
	public boolean addPassenger() {
		if (this.passengerCount < 10) {
			this.passengerCount += 1;
			return true;
		} else {
			System.out.println("you have no seats available");
			return false;
		}
	}

	// removes passenger from flight
	public void removePassenger(int passengerCount) {
		if (this.passengerCount > 0) {
			this.passengerCount--;

		} else {
			System.out.println("you have no passengers to remove");
		}

	}

}
