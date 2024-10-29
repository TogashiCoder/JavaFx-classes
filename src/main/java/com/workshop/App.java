package com.workshop;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        Image image = new Image(getClass().getResourceAsStream("/icons/saveIcon.png"));
        ImageView imageView = new ImageView(image);
        Button button = new Button("Save",imageView);
        //button.setGraphic(imageView);
        button.setOnAction(event -> {
            System.out.println("saved");
            Platform.exit();
        });

        root.getChildren().add(button);
        stage.setTitle("Save");
        stage.show();

    }




}
