package app.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Benny In
 */
public class MainController implements Initializable {

//    private double xOffset = 0;
//    private double yOffset = 0;

	@FXML
    private BorderPane border_pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        makeStageDrageable();
        try {
            Parent contentarea = FXMLLoader.load(getClass().getResource("/app/views/ContentArea.fxml"));
            Parent sidBar = FXMLLoader.load(getClass().getResource("/app/views/Sidebar.fxml"));
            Parent menuBar = FXMLLoader.load(getClass().getResource("/app/views/Menubar.fxml"));
            border_pane.setCenter(contentarea);
            border_pane.setLeft(sidBar);
            border_pane.setTop(menuBar);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
//    private void makeStageDrageable() {
//        border_pane.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                xOffset = event.getSceneX();
//                yOffset = event.getSceneY();
//            }
//        });
//        border_pane.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//            	UhbcGs2021Application.stage.setX(event.getScreenX() - xOffset);
//            	UhbcGs2021Application.stage.setY(event.getScreenY() - yOffset);
//            	UhbcGs2021Application.stage.setOpacity(0.7f);
//            }
//        });
//        border_pane.setOnDragDone((e) -> {
//        	UhbcGs2021Application.stage.setOpacity(1.0f);
//        });
//        border_pane.setOnMouseReleased((e) -> {
//        	UhbcGs2021Application.stage.setOpacity(1.0f);
//        });
//
//    }
}
