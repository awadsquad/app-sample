package common;

import java.util.ArrayList;
import java.util.Stack;

public abstract class User {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String sSN;
	private String password;
	private ArrayList<Flight> flights;
	private String city;
	private String state;
	private String country;
	private String securityAnswer;
	private String action;
	
	public User () {
		
	}
	
	public User(String firstName, String lastName, String userName, String email, String sSN, String password, 
			String city,String country, String securityQuestion, String action) {
		this.firstName = firstName;
		flights = new ArrayList<>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email.matches("*@*")) {
			this.email = email;
			return true;
		}
		else {
			return false;
		}
	}

	public String getsSN() {
		return sSN;
	}

	public boolean setsSN(String sSN) {
		if (sSN.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
			this.sSN = sSN;
			return true;
		}
		else {
			return false;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	public String getSecurityQuestion() {
		return securityAnswer;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityAnswer = securityQuestion;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	

	//Allows users to add flight
	public void addFlight(Flight booked) {
		this.flights.add(booked);
	}
	//Allows users to delete flight
	public void removeFlight(Flight booked) {
		this.flights.remove(booked);
	}
	
	
	//@Override
	/*public String toString() {
		
	}*/
	
	//@Override
	/*public String equals() {
		
	}*/
	
}
