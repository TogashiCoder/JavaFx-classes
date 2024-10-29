package com.workshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;  // Circle reference from FXML
    private double x = 0;     // Initialize x and y position
    private double y = 0;

    public void up(ActionEvent e) {
        System.out.println("Up");
        y -= 10; // Move up by 10 pixels
        myCircle.setCenterY(y);
    }

    public void down(ActionEvent e) {
        System.out.println("Down");
        y += 10; // Move down by 10 pixels
        myCircle.setCenterY(y);
    }

    public void right(ActionEvent e) {
        System.out.println("Right");
        x += 10; // Move right by 10 pixels
        myCircle.setCenterX(x);
    }

    public void left(ActionEvent e) {
        System.out.println("Left");
        x -= 10; // Move left by 10 pixels
        myCircle.setCenterX(x);
    }
}
