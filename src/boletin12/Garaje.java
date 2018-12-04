/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.time.LocalDate;

/**
 *
 * @author fojomars
 */
public class Garaje {
    //VARIABLES
    private int numeroCoches;
    private Coche obxCoche = new Coche();
    private LocalDate fechaInicio;
    
    //CONSTRUCTOR POR DEFECTO
    public Garaje() {
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
    
    


 
}
