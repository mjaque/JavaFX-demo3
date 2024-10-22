package migueljaque.controladores;

import javafx.scene.Scene;
import javafx.stage.Stage;
import migueljaque.modelos.Modelo;
import java.io.IOException;

public class ControladorPrincipal extends Controlador {

    private Stage escenario;
    private Scene escena;
    private Controlador1 controlador1;
    private Controlador2 controlador2;
    private Modelo modelo;

    public ControladorPrincipal(Stage stage) throws IOException {
        this.escenario = stage;

        modelo = new Modelo();

        //Creación de controladores  vista
        controlador1 = new Controlador1(this);
        controlador2 = new Controlador2(this);

        //La primera escena se carga de forma especial
        escenario.setScene(controlador1.getEscena1());
        escenario.show();
    }

    public void irAVista1() {
        System.out.println("ControladorPrincipal 'irAVista1'");
        escenario.setScene(controlador1.getEscena1());
        controlador1.mostrar();
    }

    public void irAVista2() {
        System.out.println("ControladorPrincipal 'irAVista2'");
        escenario.setScene(controlador2.getEscena1());
        controlador2.mostrar();
    }

    public Modelo getModelo(){
        return null;
    }

    @Override
    public void mostrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }
}