package application;


import java.time.Duration;

import common.User;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;


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
	public static String splashScreenID = "Splash Screen";
	
	
	public static User currentUser;
	
	@Override
	public void start(Stage primaryStage) {
		
			SplashScreen splashScreen = new SplashScreen();
	
			ScreensController mainContainer = new ScreensController();
			mainContainer.loadScreen(Main.loginPageID, loginPageFile);
			mainContainer.loadScreen(Main.createAccountID, createAccountFile);
			mainContainer.loadScreen(Main.homePageID, homePageFile);
			mainContainer.loadScreen(Main.profilePageID, profilePageFile);
			mainContainer.loadScreen(Main.bookingPageID, bookingPageFile);
			mainContainer.loadScreen(Main.userFlightsID, userFlightsFile);
			mainContainer.setScreen(Main.loginPageID);
			
			Group root = new Group();
			root.getChildren().addAll(mainContainer);
			Scene scene = new Scene(root, 550, 400);
			primaryStage.setScene(scene);
			
			splashScreen.showWindow();
			PauseTransition splashScreenDelay = new PauseTransition(Duration.seconds(3));
			splashScreenDelay.setOnFinished(e -> {
				primaryStage.show();
				splashScreen.hideWindow();
			});
			splashScreenDelay.playFromStart();
			
			

	}

	public static void main(String[] args) {
		launch(args);
		
	}
	
	
	
	
}
>>>>>>> branch 'master' of https://github.com/cis3270appprogramming/app-sample.git
