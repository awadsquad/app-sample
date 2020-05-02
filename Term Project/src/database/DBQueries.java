package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet.Set;
import java.sql.SQLException;

import common.Customer;
import common.Flight;
import exceptions.LoginException;

public class DBQueries {
	public static void login(Customer co) throws Exception{
		
		Connection connection = null;
		
		
		try {
			connection = DriverManager.getConnection(url)//must input url from sql database
					
	}

}
