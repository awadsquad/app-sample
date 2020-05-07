package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SplashScreen extends StackPane{
	
	Stage window = new Stage();
	
	public SplashScreen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SplashScreen.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		
		try {
			loader.load();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		window.setScene(new Scene(this));
	}
	
	public void showWindow() {
		window.show();
	}
	
	public void hideWindow() {
		window.hide();
	}
	
}
