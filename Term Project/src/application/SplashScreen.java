package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class SplashScreen implements ControlledScreen{
	
	ScreensController myController;
	
	@FXML
    private Hyperlink enter;
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
		
	}
	public void changeScreen(ActionEvent ex) {
		myController.setScreen(Main.loginPageID);
	}
		
	
	
}
