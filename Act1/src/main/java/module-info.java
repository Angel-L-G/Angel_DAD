module com.example.act1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.act1 to javafx.fxml;
    exports com.example.act1;
}