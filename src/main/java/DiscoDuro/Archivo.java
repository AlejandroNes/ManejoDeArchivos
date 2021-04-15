/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoDuro;

/**
 *
 * @author AlejandroNes
 */
public class Archivo extends Almacenamiento {

    //atributos

    private double velocidadTransmision;

   
    //metodos(

    @Override
    public void llenar() {
        super.llenar();
        System.out.println("Ingrese la velocidad de la Transmision:");
        this.velocidadTransmision = leer.nextDouble();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Velocidad Transmision: " + this.velocidadTransmision);

    }

    @Override
    public void adicionarArchivo() {
        super.adicionarArchivo();

    }

    @Override
    public void buscarArchivo() {
        super.buscarArchivo();

    }

    @Override
    public void eliminarArchivo() {
        super.eliminarArchivo();

    }
   
}
