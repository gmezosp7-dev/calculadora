module org.example.javafxexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.javafxexample to javafx.fxml;
    exports org.example.javafxexample;
}