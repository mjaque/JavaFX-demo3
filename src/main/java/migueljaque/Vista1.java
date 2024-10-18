package migueljaque;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Vista1  implements Vista{

    private Controlador1 controlador;

    @FXML
    private Button boton1;
    
    public Vista1(Controlador1 controlador){
        this.controlador = controlador;
    }
    
    @FXML
    private void pulsarBoton1() throws IOException {
        System.out.println("Pulsado Botón 1");
        controlador.irAVista2();
    }
    
}
