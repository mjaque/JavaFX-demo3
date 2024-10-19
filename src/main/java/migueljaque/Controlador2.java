package migueljaque;

public class Controlador2{

    private ControladorPrincipal controlador;

    public Controlador2(ControladorPrincipal controlador){
        this.controlador = controlador;
    }

    public void irAVista1() {
        //Para usar el modelo
        controlador.getModelo().crearProducto(null);
        controlador.irAVista1();
    }
}