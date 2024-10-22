package migueljaque.controladores;

import java.io.IOException;
import javafx.scene.Parent;
import migueljaque.vistas.Vista2;

public class Controlador2 extends Controlador{

    private Vista2 vista;
    private ControladorPrincipal controlador;

    public Controlador2(ControladorPrincipal controlador) throws IOException{
        this.controlador = controlador;
        vista = new Vista2(this);
    }

    public void irAVista1() {
        controlador.irAVista1();
    }

    public Parent getInterfazVista1() {
        return vista.getInterfaz();
    }

    @Override
    public void mostrar() {
        vista.mostrar();
    }
}