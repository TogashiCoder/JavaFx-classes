package com.workshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //login scene
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//        stage.setTitle("Ben Moussa");
//        Scene scene = new Scene(root,900,600);
//        scene.getStylesheets().add(getClass().getResource("/css/login.css").toExternalForm());
//        stage.setScene(scene); // Set the initial size
//        stage.setResizable(false);
//        stage.show();

        //Dashboard scene
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/dashboard.fxml"));
        stage.setTitle("Ben Moussa");
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("/css/login.css").toExternalForm());
        stage.setScene(scene); // Set the initial size
        stage.setResizable(false); // Prevent resizing, if desired
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}