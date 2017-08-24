package byteshopApplication.accountInfo;

import java.io.IOException;

import byteshopApplication.ByteshopMain;
import byteshopApplication.view.LoginModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AccountInfoController {
	
	public LoginModel loginModel = new LoginModel();
	
	private ByteshopMain main;
	
	@FXML
	Label myLabel;
	
	@FXML
	void onAction(ActionEvent event){
		loginModel.displayCustomer();
		
	}
	@FXML
	private void goMain() throws IOException{
		main.showInventoryScene();
	}
}
