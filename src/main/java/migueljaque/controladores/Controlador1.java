package migueljaque.controladores;

import java.io.IOException;
import javafx.scene.Parent;
import migueljaque.vistas.Vista1;

public class Controlador1 extends Controlador{

    private Vista1 vista;
    private ControladorPrincipal controlador;

    public Controlador1(ControladorPrincipal controlador) throws IOException{
        this.controlador = controlador;
        vista = new Vista1(this);
    }

    public void irAVista2() {
        controlador.irAVista2();
    }

    public Parent getInterfazVista1() {
        return vista.getInterfaz();
    }

    @Override
    public void mostrar() {
        vista.mostrar();
    }
}