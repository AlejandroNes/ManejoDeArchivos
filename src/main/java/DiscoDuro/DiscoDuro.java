package DiscoDuro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class DiscoDuro extends Dispositivo{
    private String tipointer;
    static final long serialVersionUID = 44L;
    transient Scanner sd = new Scanner(System.in);
    private List<Archivo> ListaArchivo;
     
    public DiscoDuro() {
        ListaArchivo = new ArrayList<>();
    }
    
    @Override
    public void Llenar() {
        super.Llenar();
        System.out.print("Ingrese tipo de interfaz : ");
        this.tipointer = sd.nextLine();
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Tipo de Interfaz : " + this.tipointer);
        if (ListaArchivo.size() > 0) {
            System.out.println(" ------ ARCHIVOS DEL DISCO DURO ------ ");
            for (Archivo ar : ListaArchivo) {
                System.out.print(" - ");
                ar.Mostrar();
            }
            System.out.println(" -------------------------------------------- ");
        }
    }

    public void AñadirAr(Archivo a) {
        ListaArchivo.add(a);
        System.out.println("......................");
        System.out.println("Agregado..");
        System.out.println("......................");
    }

    public void ElimAr(String nom) {
        Iterator<Archivo> ite = this.ListaArchivo.iterator();
        while (ite.hasNext()) {
            Archivo a = ite.next();
            if (a.getNomarchivo().equalsIgnoreCase(nom)) {
                ite.remove();
                System.out.println("........................................................");
                System.out.println("              ARCHIVO ELIMINADO          ");
                System.out.println("........................................................");
            }
        }
    }

    public String getTipointer() {
        return tipointer;
    }

    public void setTipointer(String tipointer) {
        this.tipointer = tipointer;
    }

    public List<Archivo> getListaArchivo() {
        return ListaArchivo;
    }

    public void setListaArchivo(List<Archivo> ListaArchivo) {
        this.ListaArchivo = ListaArchivo;
    }
}