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
public class Principal {
    public static void main(String[] args) {
        Almacenamiento almacenamiento=new Almacenamiento();
        almacenamiento.llenar();
        almacenamiento.mostrar();
        almacenamiento.adicionarArchivo();
        almacenamiento.buscarArchivo();
        almacenamiento.eliminarArchivo();
        DiscoDuro discoDuro=new DiscoDuro();
        Archivo flashMemory=new Archivo();
    }
}