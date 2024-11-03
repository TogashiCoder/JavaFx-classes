module com.workshop {
    requires javafx.controls;
    requires static lombok;
    requires javafx.fxml;

    // Open the com.workshop.controller package specifically for JavaFX FXML reflection
    opens com.workshop.controller to javafx.fxml;
    exports com.workshop;
}
