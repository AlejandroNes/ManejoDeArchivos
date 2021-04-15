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
public class DiscoDuro extends Almacenamiento {

    //atributos
    private String tipoConector;

    //constructores
    //metodos
    @Override
    public void llenar() {
        super.llenar();
        System.out.println("Digite tipo de conector:");
        this.tipoConector = leer.nextLine();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Conector: " + this.tipoConector);
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
    //getter and setter

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

}
