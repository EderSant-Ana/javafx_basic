package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

/*
 * Classe responsável por controlar a tela
 */
public class ViewController {
	
	@FXML
	private Button btText;
	
	@FXML
	public void onBtnTestAction() {
		Alerts.showAlert("Alert title", null, "hello", AlertType.WARNING);
	}
	

}
