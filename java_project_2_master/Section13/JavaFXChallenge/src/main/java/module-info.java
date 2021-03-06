module com.example.javafxchallenge {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.javafxchallenge to javafx.fxml;
    exports com.example.javafxchallenge;
    exports com.example.javafxchallenge.datamodel;
    opens com.example.javafxchallenge.datamodel to javafx.fxml;
}