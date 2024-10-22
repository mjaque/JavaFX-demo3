/**
 * App.java
 * Lanzador de la aplicación.
 * Responsabilidad:
 *  - Crear el Controlador Principal.
 * Autor: Miguel Jaque Barbero <mjaque@migueljaque.com>
 * Licencia: GPL v3.
 */

package migueljaque;

import javafx.application.Application;
import javafx.stage.Stage;
import migueljaque.controladores.ControladorPrincipal;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        new ControladorPrincipal(stage);
    }

}