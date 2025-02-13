package Aplicacion;

/*
 * Main de la aplicación
 * @autor Santiago Galeano	Osorio
 */

import Interfaz.VentanaPrincipal;

public class Aplicacion {
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        miVentanaPrincipal.setLocationRelativeTo(null); 
        miVentanaPrincipal.setVisible(true);
    }
}