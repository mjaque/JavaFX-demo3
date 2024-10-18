module migueljaque {
    requires javafx.controls;
    requires javafx.fxml;

    opens migueljaque to javafx.fxml;
    exports migueljaque;
}
