package com.workshop.controller;

import com.workshop.model.Supplier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DashboardController {

    @FXML
    private TableView<Supplier> supplierTable;

    @FXML
    private TableColumn<Supplier, String> nomColumn;
    @FXML
    private TableColumn<Supplier, String> refColumn;
    @FXML
    private TableColumn<Supplier, Integer> qteColumn;
    @FXML
    private TableColumn<Supplier, String> designationColumn;
    @FXML
    private TableColumn<Supplier, Integer> qte2Column;
    @FXML
    private TableColumn<Supplier, Double> puTtcColumn;
    @FXML
    private TableColumn<Supplier, Double> totalColumn;
    @FXML
    private TableColumn<Supplier, String> modePaiementColumn;

    private ObservableList<Supplier> supplierData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Link columns with Supplier properties
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        refColumn.setCellValueFactory(new PropertyValueFactory<>("ref"));
        qteColumn.setCellValueFactory(new PropertyValueFactory<>("qte"));
        designationColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
        qte2Column.setCellValueFactory(new PropertyValueFactory<>("qte2"));
        puTtcColumn.setCellValueFactory(new PropertyValueFactory<>("puTtc"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        modePaiementColumn.setCellValueFactory(new PropertyValueFactory<>("modePaiement"));

        // Set the data to the TableView
        supplierTable.setItems(supplierData);

        // Example data (optional: add real data later)
        supplierData.add(new Supplier("Supplier1", "REF001", 10, "Item A", 5, 20.0, "Credit"));
        supplierData.add(new Supplier("Supplier2", "REF002", 8, "Item B", 3, 15.0, "Cash"));
    }
}
