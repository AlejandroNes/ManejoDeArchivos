
package Hospital;
/**
 *
 * @author AlejandroNes
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    Scanner sd = new Scanner (System.in);

    private List <Hospital> listaHos;
    private Hospital hh;
    private Especialidad esp;
    // CONSTRUCTOR
    public Operaciones(){
        listaHos = new ArrayList<>();
    }
    
    // METODOS
    public void registrarHospital(){
        hh=new Hospital();
        System.out.print("Introduzca nombre del Hospital : ");
        hh.setNombre(sd.nextLine());
        System.out.print("Introduzca direccion del Hospital : ");
        hh.setDireccion(sd.nextLine());
        System.out.print("Introduzca el Nivel del Hospital : ");
        hh.setNivel(sd.nextInt());
        listaHos.add(hh);
    }
 
    public void AgregarEspecialidad(){
        boolean sw=true;
        
        System.out.print("Introduzca nombre del Hospital : ");
          String hos = sd.nextLine();         
          for (Hospital m:listaHos){
              if(m.getNombre().equalsIgnoreCase(hos)){
                  sw=false;
                  System.out.println(" - Cuantas Especialidades tiene el Hospital : ");
                  int lim = sd.nextInt();
                  for (int i = 1; i <= lim; i++) {
                      esp=new Especialidad();
                      System.out.println("Introduza nombre de Especialidad : ");
                      esp.setNomEspe(sd.nextLine());
                      m.agregarEs(esp);
                  }
         
              } 
          }
          if (sw){
              System.out.println("HOSPITAL NO REGISTRADO ...!!!!!");
          }
    }
    public void mostrarHospital(){
        int sw=0;
        System.out.print("Introduzca nombre del Hospital : ");
         String hospi = sd.nextLine();    
        for(Hospital hos: listaHos){
            if (hos.getNombre().equalsIgnoreCase(hospi)){
                sw = 1;
                hos.mostrarHospital();
            }
        }
        if (sw == 0){
            System.out.println("HOSPITAL NO REGISTRADO ...!!!!!");
        }
    }
    public void mostrarPorEspecialidad(){
        int sw=0;
        System.out.print("Introduzca nombre de la Especialidad : ");
        String espe = sd.nextLine();    
        for(Especialidad es: hh.getListaEs()){
            if (es.getNomEspe().equalsIgnoreCase(espe)){
                sw = 1;
                es.mostrarEspe();
            }
        }
        if (sw==0){
            System.out.println("HOSPITAL NO REGISTRADO ...!!!!!");
        }
    }
}
