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
public class Coche {
    private String matricula;
    private String marca;
    
    //CONSTRUCTOR POR DEFECTO
    public Coche(){
        
    }
    
    //CONSTRUCTOR CON PARÁMETROS
    public Coche(String matricula,String marca){
        this.matricula = matricula;
        this.marca = marca;
    }
    
    // GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", marca=" + marca;
    }
    
    
}
