/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

/**
 *
 * @author fojomars
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJEMPLO 1
        Garaje parking = new Garaje();
        parking.setObxCoche("Volkswagen","8952 KTY");
        parking.comprobarPlazas();
        parking.visualizarFactura();
        
        // EJEMPLO 2
        Garaje parking2 =new Garaje(0);
        parking2.setObxCoche("Opel","4164 GIK");
        parking2.comprobarPlazas();
        parking2.visualizarFactura();
        
    }
    
}
