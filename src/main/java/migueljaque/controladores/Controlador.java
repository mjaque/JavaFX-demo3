/**
 * Controlador.java
 * Clase base de controladores.
 * Responsabilidad de los controladores:
 *  - Crear y gestionar sus vistas.
 *  - Acceder al Modelo de datos.
 *  - Comunicarse con el Controlador Principal para el cambio de vistas.
 * Autor: Miguel Jaque Barbero <mjaque@migueljaque.com>
 * Licencia: GPL v3.
 */

package migueljaque.controladores;

public abstract class Controlador {

    public abstract void mostrar();
}
