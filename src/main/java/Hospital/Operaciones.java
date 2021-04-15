
package Hospital;
/**
 *
 * @author AlejandroNes
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    //Persistencia de datos

     public void crearDir(){
    Path path;
        path=Paths.get("C:\\ProgramacionIII");
        try{
            if(!Files.exists(path)){
            Files.createDirectory(path);
                System.out.println("directorio creado");
            }
            else{
                System.out.println("ya existe el directorio");}
        }catch(Exception e){
           e.printStackTrace();
        }
}
     public void crearArch(){
    Path path;
        path=Paths.get("C:\\ProgramacionIII\\listadoHospital.txt");
        try{
            if(!Files.exists(path)){
            Files.createFile(path);
                System.out.println("Archivo creado");
            }
            else{
                System.out.println("ya existe el Archivo");
                Files.write(path, "archivo creado".getBytes(),StandardOpenOption.APPEND);
            }
        }catch(Exception e){
           e.printStackTrace();
        }
}
     public void guardar_datos(){
           String ruta = "C:\\ProgramacionIII\\listadoHospital.txt";
           try {
               FileOutputStream arch = new FileOutputStream(ruta);
               ObjectOutputStream o = new ObjectOutputStream(arch);
               o.writeObject(listaHos);
               o.close();
               arch.close();
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch(IOException ex){
               Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
     
     public void lee_datos(){
           String ruta = "C:\\ProgramacionIII\\listadoHospital.txt";
           try {
               FileInputStream archivos = new FileInputStream(ruta);
               ObjectInputStream op = new ObjectInputStream(archivos);
               if(op != null){
                 listaHos= (List<Hospital>)op.readObject();
               }else{
                   System.out.println("No existe ningun registro");
               }
           } catch (FileNotFoundException e) {
               Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE , null, e);
           } catch(IOException ex){
                Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
           } catch(ClassNotFoundException ex){
                Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
     }