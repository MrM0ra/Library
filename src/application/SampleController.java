package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * Class that handles the model-GUI relation
 *
 */
public class SampleController {
	
	@FXML private Button butBaseCase; 
	@FXML private Button butOwnCase;
	@FXML private Button butSolution;
	
	@FXML private TextArea txtSolution;																					
	@FXML private TextArea txtCase;
	
	/**
	 * Class SampleController constructor
	 */
	public SampleController() {
		
	}
	
	/**
	 * 
	 */
	public void initialize() {
		butBaseCase.setOnAction(e->{
			baseCaseMethod();
		});
		butOwnCase.setOnAction(e->{
			ownCaseMethod();
		});
		butSolution.setOnAction(e->{
			showSolution();
		});
	}
	
	/**
	 * 
	 */
	public void baseCaseMethod() {
		Main.initializeModel(1);
		String line="";
		String plus="";
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("src/test cases/BasicInput.txt")));
			while((line=br.readLine())!=null) {
				plus+=line+"\n";
			}
			txtCase.setText(plus);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void ownCaseMethod() {
		if(txtCase.getText().isEmpty() || txtCase.getText().equals("")) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setTitle("New Case");
			alert.setHeaderText("Antes de realizar esta operacion");
			alert.setContentText("Llene el campo de texto superior");
			alert.showAndWait();
		}else {
			
		}
	}
	
	/**
	 * 
	 */
	public void showSolution() {
		
	}
	
}
