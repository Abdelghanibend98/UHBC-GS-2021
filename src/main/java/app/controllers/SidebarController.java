package app.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SidebarController implements Initializable {

	@FXML
    private VBox sidebar;

    @FXML
    private HBox home;

    @FXML
    private HBox note;

    @FXML
    private HBox prof;

    @FXML
    private HBox student;
    
 
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	note.setOnMouseClicked(event ->{
    		try {
    			
				BorderPane border_pane = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
				Parent sidebar = FXMLLoader.load(getClass().getResource("/app/views/Notes.fxml")); 
				// border_pane.setCenter(null);
				border_pane.setCenter(sidebar);
				
			} catch (IOException e) {
				e.printStackTrace();
			}

    	});

    	home.setOnMouseClicked(event ->{
    		try {
    			
				BorderPane border_pane = (BorderPane) ((Node) event.getSource()).getScene().getRoot();
				Parent sidebar = FXMLLoader.load(getClass().getResource("/app/views/ContentArea.fxml")); 
				// border_pane.setCenter(null);
				border_pane.setCenter(sidebar);
				
			} catch (IOException e) {
				e.printStackTrace();
			}

    	});
    	
    
    }    
    
}
