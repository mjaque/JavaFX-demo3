package migueljaque;

 // Singleton. Ref: https://www.baeldung.com/java-singleton

public class Controlador2{

    private ControladorPrincipal controlador;

    public Controlador2(ControladorPrincipal controlador){
        this.controlador = controlador;
    }

    public void irAVista1() {
        controlador.irAVista1();
    }
}