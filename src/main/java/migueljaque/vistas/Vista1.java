package migueljaque.vistas;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import migueljaque.controladores.Controlador1;

public class Vista1 extends Vista{

    private Controlador1 controlador;
    protected final String ficheroInterfaz = "interfaz1.fxml";
    private Scene escena;

    @FXML
    private Button boton1;
    
    public Vista1(Controlador1 controlador) throws IOException{
        super();
        this.controlador = controlador;
        escena = new Scene(cargarInterfaz(ficheroInterfaz, this));
    }
    
    @FXML
    private void pulsarBoton1() throws IOException {
        System.out.println("Pulsado Botón 1");
        controlador.irAVista2();
    }

    public Scene getEscena() {
        return escena;
    }
    
}
