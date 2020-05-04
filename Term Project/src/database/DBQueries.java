package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.Customer;
import common.Flight;
//import exceptions.LoginException;
import common.User;


public class DBQueries {
	
	
	//login
	public static void login(String userName, String password) throws Exception{
		
		
		String userN = userName; //Assign user entered values to temporary variables.
	    String passW = password;

	    Connection con = null;
	    Statement statement = null;
	    ResultSet resultSet = null;

	    String userNameDB = "";
	    String passwordDB = "";

	    try
	    {	//connection database 
	        con = DriverManager.getConnection(" ", " ", " "); 
            
	        //Statement is used to write queries. Read more about it.
	        statement = con.createStatement(); 
	         //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
	        resultSet = statement.executeQuery("select userName,password from users");
	        // Until next row is present otherwise it return false
	        while(resultSet.next()) 
	        { //fetch the values present in database
	         userNameDB = resultSet.getString("userName");
	         passwordDB = resultSet.getString("password");

	          if(userName.equals(userNameDB) && password.equals(passwordDB))
	          {
	             
	          }
	        }
	    }
	        catch(Exception ex)
	        {
	          System.out.print(ex);
	        }
	       
	}
	


			
				
		
	}
		public static void viewFlight(Connection con, String Flight) throws SQLException {
				//create database connection
			    Statement stmt = null;
			    String query = ;alskdjflskdfj //need to input queries here
			    try {
			    	
			        stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery(query);
			        while (rs.next()) {
			            String airportName = rs.getString("airport_name");
			            String destination = rs.getString("");
			            int flightNumber = rs.getInt("");
			            int passengerCount = rs.getInt("");
			            String date = rs.getString("");
			            String time = rs.getString("");
			        
			        //need to display the information to the user.
			            
			        }
			    //catch exception
			    } catch (Exception e ) {
			        
			    //close connection
			    } finally {
			        { stmt.close(); }
			    }
			}
		
											//??			
		public static void insertFlight(Connection con, Flight ) throws Exception {
					
		
		 try
	        { //create database connection
	            Class.forName(" "); //what is this?
	            Connection con = DriverManager.getConnection(" ", " ", " "); 
	            
	          //mysql query insert statement
	            String query = "  ";
	            
	              
	            // Inserting data in database with preparedstatment
	            PreparedStatement preparedStmt = con.prepareStatement(query);
	            preparedStmt.setInt(1, Flight.getAirportName());//are these correct, like the int? or is flight is a string?
	            preparedStmt.setDate(2, );
	            preparedStmt.setString(3,);
	            preparedStmt.setString(4, );
	            preparedStmt.setDate(5, );
	            
	            int x = stmt.executeUpdate(q1); 
	            if (x > 0)             
	                System.out.println("Successfully Inserted");             
	            else            
	                System.out.println("Insert Failed"); 
	            
	        } 
	        catch(Exception e) 
	        { 
	         
	        } 
		 finally
		 //close connection
	            con.close(); 
	    } 
	