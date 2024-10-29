package com.workshop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // Load the application icon from resources
        Image favIcon = new Image(getClass().getResourceAsStream("/icons/appIcon.png"));

        // Create a Group as the root node
        Group root = new Group();

        // Create a Scene with the specified root and background color
        Scene scene = new Scene(root, Color.TOMATO);

        stage.setScene(scene);

        // Set the title of the application window
        stage.setTitle("Togashi");

        // Set the application icon
        stage.getIcons().add(favIcon);

        // Set the application to full-screen mode
        stage.setFullScreen(true);

        // Set the hint message for exiting full-screen mode
        stage.setFullScreenExitHint("Press F to exit FullScreen");

        // Set the key combination to exit full-screen mode
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("F"));

        // Set the position of the stage on the screen
        stage.setX(50); // Set X position
        stage.setY(50); // Set Y position

        stage.show();

    }






}

