package DiscoDuro;

import java.io.Serializable;

/**
 *
 * @author AlejandroNes
 */
public class Archivo implements Serializable{
    transient static final long serialVersionUID=44L;
    private String nomarchivo;
    private double tamaño;
    
    public void Mostrar(){
        System.out.println("...........................................................");
        System.out.println("Nombre del archivo: " + this.nomarchivo);
        System.out.println("Tamaño del archivo MB: " + this.tamaño);
        System.out.println("............................................................");
    }

    public String getNomarchivo() {
        return nomarchivo;
    }

    public void setNomarchivo(String nomarchivo) {
        this.nomarchivo = nomarchivo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
}  