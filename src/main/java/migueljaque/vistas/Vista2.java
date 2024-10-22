package migueljaque.vistas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import migueljaque.controladores.Controlador;
import migueljaque.controladores.Controlador2;

public class Vista2  extends Vista{

    private Controlador2 controlador;
    protected final String ficheroInterfaz = "interfaz2.fxml";
    private Parent nodoInterfaz;

    @FXML
    public Button boton1;
    
    public Vista2(Controlador2 controlador) throws IOException{
        super();
        this.controlador = controlador;
        nodoInterfaz = cargarFXML(ficheroInterfaz, this);
    }
    
    @FXML
    private void pulsarBoton2() throws IOException {
        System.out.println("Pulsado Botón 2");
        controlador.irAVista1();
    }

    public Parent getInterfaz() {
        return nodoInterfaz;
    }
    
}
