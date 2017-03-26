package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dictionary;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doTranslate(ActionEvent event) {
    	String parola=txtWord.getText();
    	int ok=0;
    	String array[]=parola.split(" ");
    	
    	if (array.length==2){
    		for (int i=0; i<2; i++){
    			if (array[i].matches("[a-zA-Z]+"))
    				ok++;
    		}
    		if(ok==2)
    			dictionary.addWord(array[0].trim(), array[1].trim());
    		else{
    		txtResult.setText("Parola non corretta");
    		return;
    		}
    	}
    	 	
    	
    	if (array.length==1){
    		if (array[0].matches("[a-zA-Z]+")){
    			String s=dictionary.translateWord(array[0].trim());
    			txtResult.setText(s);
    		}
    	}
    	
    	if (array.length!=1 && array.length!=2){
    		txtResult.setText("Non possono essere memorizzate più parole in una");
    	}
    	
    	txtWord.clear();
    		
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

        dictionary=new AlienDictionary();
    }
}
