package migueljaque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ControladorPrincipal extends Application {

    private Stage escenario;
    private Scene escena;
    private Parent interfaz1;
    private Parent interfaz2;

    @Override
    public void start(Stage stage) throws IOException {
        this.escenario = stage;
        
        this.interfaz1 = cargarFXML("interfaz1", new Vista1(new Controlador1(this)));
        this.interfaz2 = cargarFXML("interfaz2", new Vista2(new Controlador2(this)));
        
        //La primera escena se carga de forma especial
        escena = new Scene(interfaz1);
        escenario.setScene(escena);
        escenario.show();
    }

    private void cambiarA(Parent interfaz){
        escena.setRoot(interfaz);
    }

    private Parent cargarFXML(String fxml, Vista controlador) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ControladorPrincipal.class.getResource(fxml + ".fxml"));
        fxmlLoader.setController(controlador);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public void irAVista1() {
        System.out.println("ControladorPrincipal 'irAVista1'");
        cambiarA(interfaz1);
    }

    public void irAVista2() {
        System.out.println("ControladorPrincipal 'irAVista2'");
        cambiarA(interfaz2);
    }

}