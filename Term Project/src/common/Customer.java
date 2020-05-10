package common;

import java.util.ArrayList;

public class Customer extends User {
	
	public Customer() {
		super();
	}
	
	public Customer (int customerID, String firstName, String lastName, String userName, String email, String sSN, String password, String address,
			String city, String state, String zipcode, String securityQuestion, String phone, String status, String securityAnswer) {
		
		super(customerID, firstName,lastName,userName,email,sSN,password,address,city,state,zipcode,securityQuestion,phone,status, securityAnswer);
	}

	public String getAction(){
		return "login";
	}
}
