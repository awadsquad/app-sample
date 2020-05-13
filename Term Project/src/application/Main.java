package application;



import common.User;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;


public class Main extends Application {
	
	//Create variables for FXML file locations and names
	public static String loginPageFile = "Login Page.fxml";
	public static String loginPageID = "Login Page";
	public static String createAccountFile = "CreateAccountPage.fxml";
	public static String createAccountID = "Create Account";
	public static String homePageFile = "HomePage.fxml";
	public static String homePageID = "Home Page";
	public static String profilePageFile = "Profile Page.fxml";
	public static String profilePageID = "Profile Page";
	public static String bookingPageFile = "BookingPage.fxml";
	public static String bookingPageID = "Booking Page";
	public static String userFlightsFile = "UserFlights.fxml";
	public static String userFlightsID = "User Flights";
	public static String splashScreenFile = "SplashScreen.fxml";
	public static String splashPageID = "Splash Page";
	public static String flightListingsFile = "FlightListings.fxml";
	public static String flightListingsID = "Flight Listings";
	
	public static User currentUser;
	
	@Override
	public void start(Stage primaryStage) {
		
	
			ScreensController mainContainer = new ScreensController();
			mainContainer.loadScreen(Main.splashPageID, Main.splashScreenFile);
			mainContainer.loadScreen(Main.loginPageID, loginPageFile);
			mainContainer.loadScreen(Main.createAccountID, createAccountFile);
			mainContainer.loadScreen(Main.homePageID, homePageFile);
			mainContainer.loadScreen(Main.profilePageID, profilePageFile);
			mainContainer.loadScreen(Main.flightListingsID, flightListingsFile);
			mainContainer.setScreen(Main.splashPageID);;
			
			Group root = new Group();
			root.getChildren().addAll(mainContainer);
			Scene scene = new Scene(root, 550, 350);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			

	}

	public static void main(String[] args) {
		launch(args);
		
	}
	
	
	
	
}

