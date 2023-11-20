module es.iespuertodelacruz.gestordecontenidoexamen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.iespuertodelacruz.gestordecontenidoexamen to javafx.fxml;
    opens es.iespuertodelacruz.gestordecontenidoexamen.controller to javafx.fxml;
    exports es.iespuertodelacruz.gestordecontenidoexamen;
}
