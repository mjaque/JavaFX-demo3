/**
 * Vista.java
 * Clase base de las vistas.
 * Responsabilidad de las vistas:
 *  - Crear y gestionar el interfaz FXML.
 *  - Atender los eventos de usuario (click, mousemove, scroll...).
 *  - Validar los datos del usuario.
 *  - Transmitir al controlador las peticiones del usuario.
 * Autor: Miguel Jaque Barbero <mjaque@migueljaque.com>
 * Licencia: GPL v3.
 */

 package migueljaque.vistas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import migueljaque.App;

import java.io.IOException;

public abstract class Vista {

    protected Parent cargarInterfaz(String ficheroInterfaz, Vista vista) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Vista.class.getResource(ficheroInterfaz));
        fxmlLoader.setController(vista);
        return fxmlLoader.load();
    }

    public void mostrar(){}
}
