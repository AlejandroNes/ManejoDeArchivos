/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoDuro;

import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class Almacenamiento {

    Scanner leer = new Scanner(System.in);
    int n=0;
    //atributos
    private String marca;
    private double capacidad;
    private String nomArchivo[] = new String[10];
    private double tamArchivo[] = new double[10];
    

    //metodo llenar
    public void llenar() {

        System.out.println("Digite la marca:");
        this.marca = leer.nextLine();
        
        System.out.println("Digite la capacidad:");
        this.capacidad = leer.nextDouble();
        leer.nextLine();
        System.out.println("Digite nombre de archivo:");
       this.nomArchivo[n] = leer.nextLine();
        System.out.println("Digite tamaño de Archivo:");
        this.tamArchivo[n] = leer.nextDouble();

    }
    //metodo mostrar
    public void mostrar() {
        int c = 1;
        System.out.println("La marca: " + this.marca);
        System.out.println("Su capacidad: " + this.capacidad);
        for (int i = 0; i < n; i++) {
            System.out.println(c + " elemento:");
            System.out.println("Nombre de Archivo: " + this.nomArchivo[i]);
            System.out.println("Capacidad: " + this.tamArchivo[i]);
            c++;
        }

    }

    //metodo adicionar
    public void adicionarArchivo() {
        System.out.println("Digite la cantidad de elementos que desea almacenar:");
        n=leer.nextInt();
        leer.nextLine();
        int c = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("== N°" + c + "==");
            System.out.println("Digite nombre del Archivo:");
            this.nomArchivo[i] = leer.nextLine();
            System.out.println("Digite el tamaño del Archivo:");
            this.tamArchivo[i] = leer.nextDouble();
            leer.nextLine();
            c++;
        }
    }
    //metodo buscar
    public void buscarArchivo() {
        int sw = 0;
        System.out.println("Ingrese el nombre del archivo a buscar: ");
        String buscar = leer.nextLine();
        for (int i = 0; i < n; i++) {
            if (buscar.equalsIgnoreCase(nomArchivo[i])) {
                System.out.println("Archivo encontrado!!!");
                System.out.println("Nombre de Archivo: " + this.nomArchivo[i]
                        + "\nTamaño de Archivo: " + this.tamArchivo[i]);
                sw = 1;
            }
        }
        if (sw == 0) {
            System.out.println("Archivo no encontrado!!!");
        }
    }
    //metodo eliminar
    public void eliminarArchivo(){
        int sw=0;
        System.out.println("Ingrese nombre de Archivo a eliminar: ");
        String eliminar=leer.nextLine();
        for (int i = 0; i <=n; i++) {
            if (eliminar.equalsIgnoreCase(nomArchivo[i])) {
                sw=1;
                System.out.println("Archivo encontrado!!!");
                System.out.println("Archivo: "+this.nomArchivo[i]
                +"\nTamaño: "+this.tamArchivo[i]);
                System.out.println("Usted esta seguro eliminar archivo S/N:");
                String respuesta=leer.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Eliminacion con exito!!!");
                    this.nomArchivo[i]="";
                    this.tamArchivo[i]=0;
                }else{
                    System.out.println("cancelando...");
                }
            }
        }if (sw==0) {
            System.out.println("No se encontro Archivo!!!");
        }
    }

    //getter and setter

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

    public String[] getNomArchivo() {
        return nomArchivo;
    }

    public void setNomArchivo(String[] nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public double[] getTamArchivo() {
        return tamArchivo;
    }

    public void setTamArchivo(double[] tamArchivo) {
        this.tamArchivo = tamArchivo;
    }
    
}
