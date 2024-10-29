package com.workshop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        // Create a TableView
        TableView<Person> tableView = new TableView<>();

        // Create columns
        TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); // Bind to name property
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn()); // Enable editing for the name column
        nameColumn.setOnEditCommit(event -> {
            Person person = event.getRowValue();
            person.setName(event.getNewValue()); // Update the name
        });

        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age")); // Bind to age property
        ageColumn.setCellFactory(TextFieldTableCell.forTableColumn(new javafx.util.converter.IntegerStringConverter())); // Enable editing for the age column
        ageColumn.setOnEditCommit(event -> {
            Person person = event.getRowValue();
            person.setAge(event.getNewValue()); // Update the age
        });

        // Set editable property for the TableView
        tableView.setEditable(true);

        // Add columns to the TableView
        tableView.getColumns().addAll(nameColumn, ageColumn);

        // Create an ObservableList of Person objects
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("John Doe", 30),
                new Person("Jane Smith", 25),
                new Person("Emily Johnson", 40)
        );

        // Set the items for the TableView
        tableView.setItems(data);

        // Create a layout
        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);

        // Set up the Stage
        stage.setTitle("TableView Example");
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
    }

    }

