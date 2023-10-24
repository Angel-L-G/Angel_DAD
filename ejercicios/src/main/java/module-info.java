module org.openjfx.ejercicios {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires transitive javafx.graphics;

    opens org.openjfx.ejercicios to javafx.fxml;
    exports org.openjfx.ejercicios;
}
