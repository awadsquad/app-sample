package common;

import java.util.ArrayList;

public class Customer extends User {
	
	public Customer() {
		super();
	}
	
	public Customer (String firstName, String lastName, String userName, String email, String sSN, String password, 
			String city, String state, String country, String securityQuestion) {
		super(firstName,lastName,userName,email,sSN,password,city,state,country,securityQuestion);
	}
	
	
}
