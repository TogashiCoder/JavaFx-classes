package com.workshop;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        // Create a FlowPane
        FlowPane flowPane = new FlowPane(); // Default is horizontal flow
        flowPane.setHgap(10); // Set horizontal gap between children
        flowPane.setVgap(10); // Set vertical gap between children
        flowPane.setPadding(new Insets(15)); // Add padding around the FlowPane
        flowPane.setAlignment(Pos.CENTER); // Center alignment for children

        // Add buttons to the FlowPane
        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        // Create a Scene containing the FlowPane
        Scene scene = new Scene(flowPane, 300, 200); // Set scene size
        stage.setTitle("FlowPane Example"); // Set stage title
        stage.setScene(scene); // Set scene to the stage
        stage.show(); // Show the stage
    }

}
