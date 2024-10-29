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

        // Create an HBox with spacing between children
        HBox hbox = new HBox(10); // Set spacing to 10 pixels
        hbox.setPadding(new Insets(15)); // Add padding around the HBox
        hbox.setAlignment(Pos.CENTER); // Align children to the center

        // Control button shrinking and growing
        HBox.setHgrow(btn1, Priority.ALWAYS); // Allow btn1 to grow and take extra space
        HBox.setHgrow(btn2, Priority.ALWAYS); // Allow btn2 to grow and take extra space
        btn1.setMinWidth(100); // Minimum width for btn1
        btn2.setMinWidth(100); // Minimum width for btn2
        btn3.setPrefWidth(100); // Preferred width for btn3 (fixed width)

        // Set margins for individual buttons
        HBox.setMargin(btn1, new Insets(0, 10, 0, 0)); // Margin for btn1
        HBox.setMargin(btn2, new Insets(0, 10, 0, 0)); // Margin for btn2

        // Add buttons to the HBox
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Add event handler for btn1
        btn1.setOnAction(event -> {
            System.out.println("Button 1 clicked!");
            btn2.setVisible(!btn2.isVisible()); // Toggle visibility of btn2
        });

        // Create a Scene containing the HBox
        Scene scene = new Scene(hbox, 400, 100); // Set scene size
        stage.setTitle("HBox Example with Shrinking Control"); // Set stage title
        stage.setScene(scene); // Set scene to the stage
        stage.show(); // Show the stage
    }



}
