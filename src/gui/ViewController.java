package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
 * Classe respons�vel por controlar a tela
 */
public class ViewController {
	
	@FXML
	private Button btText;
	
	@FXML
	public void onBtnTestAction() {
		System.out.println("Click");
	}
	

}
