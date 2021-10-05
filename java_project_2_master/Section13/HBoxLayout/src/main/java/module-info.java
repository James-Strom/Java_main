module com.example.hboxlayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hBoxLayout to javafx.fxml;
    exports com.example.hBoxLayout;
}