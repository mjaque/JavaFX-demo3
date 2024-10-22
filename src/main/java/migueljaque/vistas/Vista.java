package migueljaque.vistas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import migueljaque.App;
import migueljaque.controladores.Controlador;

import java.io.IOException;

public abstract class Vista {

    protected Parent cargarFXML(String ficheroInterfaz, Vista vista) throws IOException {
        System.out.println(ficheroInterfaz);
        System.out.println(App.class);
        System.out.println(App.class.getResource(ficheroInterfaz));
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(ficheroInterfaz));
        fxmlLoader.setController(vista);
        return fxmlLoader.load();
    }

    public void mostrar(){}
}
