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
        // Create buttons with labels
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Create a VBox with spacing between children
        VBox vbox = new VBox(10); // Set spacing to 10 pixels
        vbox.setPadding(new Insets(15)); // Add padding around the VBox
        vbox.setAlignment(Pos.CENTER); // Align children to the center

        // Control button shrinking and growing
        VBox.setVgrow(btn1, Priority.ALWAYS); // Allow btn1 to grow and take extra space
        VBox.setVgrow(btn2, Priority.ALWAYS); // Allow btn2 to grow and take extra space
        btn1.setMinHeight(50); // Minimum height for btn1
        btn2.setMinHeight(50); // Minimum height for btn2
        btn3.setPrefHeight(50); // Preferred height for btn3 (fixed height)

        // Set margins for individual buttons
        VBox.setMargin(btn1, new Insets(0, 0, 10, 0)); // Margin for btn1
        VBox.setMargin(btn2, new Insets(0, 0, 10, 0)); // Margin for btn2

        // Add buttons to the VBox
        vbox.getChildren().addAll(btn1, btn2, btn3);

        // Add event handler for btn1
        btn1.setOnAction(event -> {
            System.out.println("Button 1 clicked!");
            btn2.setVisible(!btn2.isVisible()); // Toggle visibility of btn2
        });

        // Create a Scene containing the VBox
        Scene scene = new Scene(vbox, 300, 300); // Set scene size
        stage.setTitle("VBox Example with Full Features"); // Set stage title
        stage.setScene(scene); // Set scene to the stage
        stage.show(); // Show the stage
    }


}
