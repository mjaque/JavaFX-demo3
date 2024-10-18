package migueljaque;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Vista2  implements Vista{

    private Controlador2 controlador;

    @FXML
    private Button boton1;
    
    public Vista2(Controlador2 controlador){
        this.controlador = controlador;
    }
    
    @FXML
    private void pulsarBoton2() throws IOException {
        System.out.println("Pulsado Botón 2");
        controlador.irAVista1();
    }
    
}
