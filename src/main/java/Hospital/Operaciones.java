package Hospital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlejandroNes
 */
public class Operaciones {
    Scanner leer = new Scanner (System.in);
    private List <Hospital> ListaHosp;
    private Hospital hos;
    private Especialidad esp;
    
    public Operaciones(){
        ListaHosp = new ArrayList<>();
    }
    
    //añade el hospital
    public void AñadirHospital(){
        hos=new Hospital();
        System.out.print("Ingrese nombre del Hospital: ");
        hos.setNombre(leer.nextLine());
        System.out.print("Ingrese direccion del Hospital: ");
        hos.setDireccion(leer.nextLine());
        System.out.print("Ingrese el Nivel del Hospital: ");
        hos.setNivel(leer.nextInt());
        ListaHosp.add(hos);
        System.out.println("");
    }
 
    // añade la especialidad 
    public void AñadirEspecialidad(){
        boolean x=true;
        System.out.print("Ingrese nombre del Hospital : ");
          String hos = leer.nextLine();
          System.out.println("");
          for (Hospital m:ListaHosp){
              if(m.getNombre().equalsIgnoreCase(hos)){
                  x=false;
                  System.out.println("Cantidad de Especialidades: ");
                  int lim = leer.nextInt();
                  for (int i = 1; i <= lim; i++) {
                      esp=new Especialidad();
                      System.out.println("Ingrese nombre de Especialidad: ");
                      esp.setNomesp(leer.nextLine());
                      m.AñadirEsp(esp);
                      System.out.println("");
                  }
         
              } 
          }
          if (x){
              System.out.println("____________________________");
              System.out.println("LA ESPECIALIDAD NO REGISTRADA!!!");
              System.out.println("____________________________");
          }
    }
    
    //muestra el nombre del hospital
    public void MostrarHospital(){
        int sw=0;
        System.out.print("Ingrese nombre del Hospital : ");
        String hospi = leer.nextLine();
        System.out.println("");
        for(Hospital hos: ListaHosp){
            if (hos.getNombre().equalsIgnoreCase(hospi)){
                sw = 1;
                hos.MostrarHospital();
            }
        }
        if (sw == 0){
              System.out.println("____________________________");
              System.out.println("NOMBRE DE HOSPITAL NO ENCONTRADO!!!");
              System.out.println("____________________________");
        }
    }
    
    public void MostrarPorEsp(){
        int x=0;
        System.out.print("Ingrese nombre de la Especialidad : ");
        String espe = leer.nextLine();
        System.out.println("");
        for(Especialidad es: hos.getListaEspecialidad()){
            if (es.getNomesp().equalsIgnoreCase(espe)){
                x = 1;
                es.MostrarEsp();
            }
        }
        if (x==0){
              System.out.println("____________________________");
              System.out.println("ESPECIALIDAD NO ENCONTRADA!!!");
              System.out.println("____________________________");
        }
    }
    
    public void CrearArchivo(){
        Path path=Paths.get("C:\\ProgramacionIII\\Hospital.txt");
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("            ARCHIVO CREADO EXITOSAMENTE...          ");
                System.out.println("");
            }else{
                System.out.println("            EL ARCHIVO YA EXISTE!!!         ");
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
    
    public void AlmacenarDatos(){
        String location="C:\\ProgramacionIII\\Hospital.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaHosp);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\ProgramacionIII\\Hospital.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaHosp=(List<Hospital>)ois.readObject();
            }else{
                System.out.println("no existe valor");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}