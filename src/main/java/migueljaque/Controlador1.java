package migueljaque;

 // Singleton. Ref: https://www.baeldung.com/java-singleton

public class Controlador1{

    private ControladorPrincipal controlador;

    public Controlador1(ControladorPrincipal controlador){
        this.controlador = controlador;
    }

    public void irAVista2() {
        controlador.irAVista2();
    }
}