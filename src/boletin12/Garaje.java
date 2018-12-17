/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Garaje {
    //VARIABLES
    private int numeroCoches = 2;
    private Coche obxCoche = new Coche();
    private Date entrada, salida;
    private double precio,pagado,devolucion;
    private int tiempo;
    private String factura;
    
    //CONSTRUCTOR POR DEFECTO
    public Garaje() {
        obxCoche =new Coche();
    }
    
    //CONSTRUCTOR CON PARÁMETROS
    public Garaje(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
    
    //GETTERS Y SETTERS

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public Coche getObxCoche() {
        return obxCoche;
    }

    public void setObxCoche(String marca,String matricula) {
        obxCoche.setMarca(marca);
        obxCoche.setMatricula(matricula);
    }
       
    
    // MÉTODOS
    
    public void comprobarPlazas(){
        if (numeroCoches >= 1) {
            entrada = new Date();
            entrada.getTime();
                JOptionPane.showMessageDialog(null, "Las plazas disponibles son: " + numeroCoches);
            numeroCoches = numeroCoches - 1;
        } else {
            JOptionPane.showMessageDialog(null, "El parkin está completo");
        }
    }
    
    // MÉTODO TO STRING

    @Override
    public String toString() {
        return "numeroCoches = " + numeroCoches + ", obxCoche = " + obxCoche + ", entrada = " + entrada + ", salida = " + salida + ", precio = " + precio + ", pagado = " + pagado + ", devolucion = " + devolucion + ", tiempo = " + tiempo + ", factura = " + factura;
    }
    
    
    public void calcularPrecio(){
        salida = new Date();
        tiempo =(int)(salida.getTime() -entrada.getTime());
        JOptionPane.showMessageDialog(null, tiempo);
        if (tiempo <= 3000) {
            precio = 1.5;
        } else {
            precio = (Math.round(1.5 + 0.2 *(tiempo/1000)));
        }
        JOptionPane.showMessageDialog(null, "El precio a pagar es: " + precio + " euros.");
        pagar();
        visualizarFactura();
    }
    
    
    public void pagar() {
        pagado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero a pagar"));
        if (pagado > precio) {
            devolucion = Math.round(Math.abs(precio - pagado));
        } else {
            double resto = precio - pagado;
            double totalPagado = pagado;
            do {
                pagado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero que falta " + (resto)));
                resto = resto - pagado;
                totalPagado = totalPagado + pagado;
            } while (resto >= 0);
            devolucion = Math.abs(precio - totalPagado);
            pagado = totalPagado;
        }
    }

    
    public String visualizarFactura() {
        JOptionPane.showMessageDialog(null, "********** FACTURA: **********" + "\nMATRICULA COCHE: " + obxCoche.getMatricula() + "\nTIEMPO APARCADO: " + tiempo /1000 + " horas" + "\nPRECIO: " + precio + " euros" + "\nEFECTIVO: " + pagado + " euros" + "\nDEVOLUCIÓN: " + devolucion + " euros" + "\n********** GRACIAS POR APARCAR **********");
        return factura;
    }
}
