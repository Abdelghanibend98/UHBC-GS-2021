package com.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


@SpringBootApplication
public class UhbcGs2021Application extends Application implements CommandLineRunner{

	private ConfigurableApplicationContext applicationContext;
	
	public static Stage stage = null;
	
	@Override
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("/app/views/Main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        this.stage = stage;
        stage.show();	
	}
	
	@Override
    public void init() {
		
		applicationContext = SpringApplication.run(UhbcGs2021Application.class);
	}
	
	@Override
	public void stop() {
	    this.applicationContext.close();
	    Platform.exit();
	}

	public static void main(String[] args) {
		// SpringApplication.run(UhbcGs2021Application.class, args);
		launch(UhbcGs2021Application.class, args);
		
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
