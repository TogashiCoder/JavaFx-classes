module com.workshop {
    // Declare that this module requires the javafx.controls module.
    // This module provides UI controls such as buttons, labels, and text fields.
    requires javafx.controls;

    // Declare that this module requires the javafx.graphics module.
    // This module provides classes for rendering graphics and handling images.
    requires static lombok;
    requires javafx.fxml;

    // Open the com.workshop package for reflection to the javafx.fxml module.
    // This is necessary for JavaFX to be able to load FXML files and instantiate
    // controller classes that are defined in the com.workshop package.
    opens com.workshop to javafx.fxml;

    // Export the com.workshop package to make its public classes accessible
    // to other modules. This allows other modules to use classes from com.workshop directly.
    exports com.workshop;
}
