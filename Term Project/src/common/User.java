package common;

import java.util.ArrayList;
import java.util.Stack;

public abstract class User {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String sSN;
	private String password;
	private ArrayList<Flight> flights;
	private String status = "false";
	private String zipcode;
	private String address;
	private String city;
	private String state;
	private String securityQuestion;
	private String securityAnswer;
	private String phone;
	
	public User () {
		
	}
	
	public User(int userId, String firstName, String lastName, String userName, String email, String sSN, String password, String address,
			String city, String state, String zipcode, String securityQuestion, String phone, String status, String securityAnswer) {
		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName; 
		this.email = email; 
		this.sSN = sSN; 
		this.password = password; 
		this.address = address;
		this.city = city; 
		this.state = state; 
		this.zipcode = zipcode;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.phone = phone;
		this.status = status;
		
		flights = new ArrayList<>();
	}
	
	public User(String firstName, String lastName, String userName, String email, String sSN, String password, String address,
			String city, String state, String zipcode, String securityQuestion, String phone, String status, String securityAnswer) {
		//TODO finish
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName; 
		this.email = email; 
		this.sSN = sSN; 
		this.password = password; 
		this.address = address;
		this.city = city; 
		this.state = state; 
		this.zipcode = zipcode;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.phone = phone;
		this.status = status;
		
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
		if (email.contains("@")) {
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

	public void setsSN(String sSN) {
		this.sSN = sSN;

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

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	//Allows users to add flight
	public void addFlight(Flight booked) {
		this.flights.add(booked);
	}
	//Allows users to delete flight
	public void removeFlight(Flight booked) {
		this.flights.remove(booked);
	}
	
	public abstract boolean login();
	
	
	
	//@Override
	/*public String toString() {
		
	}*/
	
	//@Override
	/*public String equals() {
		
	}*/
	
}
