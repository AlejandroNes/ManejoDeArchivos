package DiscoDuro;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class Dispositivo implements Serializable{
    static final long serialVersionUID=44L;
    transient Scanner leer = new Scanner (System.in);
    private String marca;
    private double capacidad;
    private double espacio;
    
    public void Llenar(){
        System.out.print("Ingrese la marca del Dispositivo: ");
        this.marca = leer.nextLine();
        System.out.print("Ingrese la capacidad de Almacenamiento en MB: ");
        this.capacidad = leer.nextDouble();
        System.out.print("Ingrese Espacio Disponible en MB: ");
        this.espacio = leer.nextDouble();
        leer.nextLine();
    }
    public void Mostrar(){
        System.out.println("......................................................");
        System.out.println("Marca: " + this.marca);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Espacio Disponible: " + this.espacio);
        System.out.println("......................................................");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }
}