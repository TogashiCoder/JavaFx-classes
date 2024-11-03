package com.workshop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class DashboardController {

    @FXML
    private ImageView logo; // ImageView for the logo
    @FXML
    private Button dashboardBtn; // Button to navigate to the dashboard
    @FXML
    private Button salesBtn; // Button for sales
    @FXML
    private Button purchasesBtn; // Button for purchases
    @FXML
    private Button stockBtn; // Button for stock management
    @FXML
    private Button supplierBtn; // Button for supplier management
    @FXML
    private VBox mainContent; // Main content area
    @FXML
    private Label logout; // Label for logout

    @FXML
    public void initialize() {
        // Initialization logic can go here

        dashboardBtn.setOnAction(event -> navigateToDashboard());
        salesBtn.setOnAction(event -> navigateToSales());
        purchasesBtn.setOnAction(event -> navigateToPurchases());
        stockBtn.setOnAction(event -> navigateToStock());
        supplierBtn.setOnAction(event -> navigateToSuppliers());
    }

    private void navigateToDashboard() {
        // Logic to navigate to the dashboard
        System.out.println("Navigating to Dashboard...");
        // You can replace this with actual logic to update the main content
    }

    private void navigateToSales() {
        // Logic to navigate to the sales view
        System.out.println("Navigating to Sales...");
        // You can replace this with actual logic to update the main content
    }

    private void navigateToPurchases() {
        // Logic to navigate to the purchases view
        System.out.println("Navigating to Purchases...");
        // You can replace this with actual logic to update the main content
    }

    private void navigateToStock() {
        // Logic to navigate to the stock view
        System.out.println("Navigating to Stock...");
        // You can replace this with actual logic to update the main content
    }

    private void navigateToSuppliers() {
        // Logic to navigate to the suppliers view
        System.out.println("Navigating to Suppliers...");
        // You can replace this with actual logic to update the main content
    }

    @FXML
    private void handleLogout() {
        // Logic to handle user logout
        System.out.println("Logging out...");
        // You can add code to navigate to the login screen or close the application
    }
}
