module migueljaque.vistas {
    requires javafx.controls;
    requires javafx.fxml;

    opens migueljaque.vistas to javafx.fxml;
    exports migueljaque;
}
