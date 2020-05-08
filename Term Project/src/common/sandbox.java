package common;

import java.sql.Connection;

import database.Queries;

public class sandbox {

		public static void bookFlight(Flight fl) throws Exception {
			 
			 try
		        { //create database connection
				 Connection connect = Queries.getConnection();
				 String tempQuer = "SELECT date, time, destination  FROM `world`.`flights` WHERE destination ='"
						 +fl.getDestination() + "' AND date=' " + fl.getDate() +"' AND time= ' "
						 + fl.getTime() + " ');";
				System.out.println(tempQuer);
		          if(tempQuer.contains(fl.getDestination())&& tempQuer.contains(fl.getDate())&&
		        		  tempQuer.contains(fl.getTime())){
		        	 		fl.setPassengerCount(fl.getFlightNumber()+1);
		         	 }else {
		         		 Queries.INSERT(fl);}
		        }
			 	catch(Exception o){
			 		System.out.print("eat a potato");
			 	}
		}
}
