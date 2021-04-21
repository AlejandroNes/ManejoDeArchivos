package Hospital;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class Hospital implements Serializable{
    static final long serialVersionUID=1L;
    transient Scanner sd = new Scanner (System.in);
    private String nombre;
    private String direccion;
    private int nivel;
    private List <Especialidad> ListaEspecialidad;
    
    public Hospital(){
        ListaEspecialidad = new ArrayList<>();
    }
    
    public void MostrarHospital(){
        System.out.println("======HOSPITAL====== ");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Nive: "+this.nivel);
        System.out.println("");
        if (ListaEspecialidad.size() > 0){
            System.out.println("-------------ESPECIALIDADES--------------");
            for (Especialidad item: ListaEspecialidad){
                System.out.print("---");
                item.MostrarEsp();
            }
            System.out.println("");
        }
    }
    public void MostrarHosp(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Direccion: " +this.direccion);
        System.out.println("Nivel: "+this.nivel);
        System.out.println("");
    }
    public void AñadirEsp(Especialidad e){
        ListaEspecialidad.add(e);
        System.out.println("------ESPECIALIDAD AGREGADA------");
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Especialidad> getListaEspecialidad() {
        return ListaEspecialidad;
    }

    public void setListaEspecialidad(List<Especialidad> ListaEspecialidad) {
        this.ListaEspecialidad = ListaEspecialidad;
    }
}