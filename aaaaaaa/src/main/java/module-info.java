module org.openfx.aaaaaaa {
    requires javafx.controls;
    requires javafx.fxml;

    opens T1 to javafx.fxml;
    exports T1;
}
