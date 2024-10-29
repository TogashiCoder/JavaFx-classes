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
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create buttons
        Button btn1 = new Button("Top Left");
        Button btn2 = new Button("Top Right");
        Button btn3 = new Button("Bottom Left");
        Button btn4 = new Button("Bottom Right");
        Button btn5 = new Button("Center");

        // Create an AnchorPane
        AnchorPane anchorPane = new AnchorPane();

        // Set anchors for the buttons
        AnchorPane.setTopAnchor(btn1, 10.0); // 10 pixels from the top
        AnchorPane.setLeftAnchor(btn1, 10.0); // 10 pixels from the left

        AnchorPane.setTopAnchor(btn2, 10.0); // 10 pixels from the top
        AnchorPane.setRightAnchor(btn2, 10.0); // 10 pixels from the right

        AnchorPane.setBottomAnchor(btn3, 10.0); // 10 pixels from the bottom
        AnchorPane.setLeftAnchor(btn3, 10.0); // 10 pixels from the left

        AnchorPane.setBottomAnchor(btn4, 10.0); // 10 pixels from the bottom
        AnchorPane.setRightAnchor(btn4, 10.0); // 10 pixels from the right

        // Center button: set its anchors to null for it to float in the center
        AnchorPane.setTopAnchor(btn5, 100.0); // 100 pixels from the top
        AnchorPane.setLeftAnchor(btn5, 100.0); // 100 pixels from the left

        // Add buttons to the AnchorPane
        anchorPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        // Create a Scene containing the AnchorPane
        Scene scene = new Scene(anchorPane, 400, 300); // Set scene size
        stage.setTitle("AnchorPane Example"); // Set stage title
        stage.setScene(scene); // Set scene to the stage
        stage.show(); // Show the stage
    }

}
