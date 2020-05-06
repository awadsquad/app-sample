package common;

import java.util.ArrayList;

public class Customer extends User {
	
	public Customer() {
		super();
	}
	
	public Customer (String firstName, String lastName, String userName, String email, String sSN, String password, String address,
			String city, String state, String zipcode, String securityQuestion, String phone, String status) {
		
		super(firstName,lastName,userName,email,sSN,password,address,city,state,zipcode,securityQuestion,phone,status);
	}


	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
