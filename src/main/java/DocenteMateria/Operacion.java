package DocenteMateria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlejandroNes
 */
public class Operacion {
    
   Scanner lee2=new Scanner (System.in); 
   private Docente doc;
   private Materia mat;
   List<Docente> docente_txt;


    public Operacion() {
       crearDir();
       crearArch();
       docente_txt=new ArrayList<>(); 
       doc=new Docente();
       mat=new Materia();
    }
   
   public void regsitra_docente(){
    System.out.println("Nombre::");
    String n=lee2.nextLine();
    doc.setNombre(n);
    System.out.println("AP Paterno::");
    String ap=lee2.nextLine();   
    doc.setPaterno(ap);
    System.out.println("AP Materno::");
       String am=lee2.nextLine();
       doc.setMaterno(am);
       System.out.println("Titulo::");
       String tit=lee2.nextLine();
       doc.setTitulo(tit);
       System.out.println("Carga Horaria::");
       int ch=lee2.nextInt();
       doc.setCarga_horaria(ch);
       docente_txt.add(doc);
       lee2.nextLine();
    }
    
   public void registra_materia(){
        System.out.println("Materia::");
        String mater=lee2.nextLine();
        mat.setNom_materia(mater);
        System.out.println("Año de materia::");
        int a=lee2.nextInt();
        mat.setAno_materia(a);
        System.out.println("Horas materia::");
        int hm=lee2.nextInt();
        mat.setHoras_Materia(hm);        
   }
   
   public void asignar_materia(){
   doc.setMat(mat);
       System.out.println("Asignado!");
   guardar_datos();    
   }

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
        path=Paths.get("C:\\ProgramacionIII\\listadocente.txt");
        try{
            if(!Files.exists(path)){
            Files.createFile(path);
                System.out.println("Archivo creado");
            }
            else{
                System.out.println("ya existe el Archivo");
                Files.write(path, "creado por kelvin".getBytes(),StandardOpenOption.APPEND);
            }
        }catch(Exception e){
           e.printStackTrace();
        }
}
     public void guardar_datos(){
           String ruta = "C:\\ProgramacionIII\\listadocente.txt";
           try {
               FileOutputStream arch = new FileOutputStream(ruta);
               ObjectOutputStream o = new ObjectOutputStream(arch);
               o.writeObject(docente_txt);
               o.close();
               arch.close();
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch(IOException ex){
               Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
     
     public void lee_docentes(){
           String ruta = "C:\\ProgramacionIII\\listadocente.txt";
           try {
               FileInputStream archivos = new FileInputStream(ruta);
               ObjectInputStream op = new ObjectInputStream(archivos);
               if(op != null){
                 docente_txt= (List<Docente>)op.readObject();
               }else{
                   System.out.println("No existe ningun registro");
               }
           } catch (FileNotFoundException e) {
               Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE , null, e);
           } catch(IOException ex){
                Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
           } catch(ClassNotFoundException ex){
                Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
     
     public void mostrar_docente(){
     lee_docentes();
         System.out.println("-----------------------");
     for(Docente d:docente_txt){
         d.mostrar_doc();
         d.getMat().mostrar_mat();
     }
         System.out.println("-----------------------");
     }
}
