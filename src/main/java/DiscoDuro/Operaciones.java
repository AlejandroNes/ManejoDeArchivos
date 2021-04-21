package DiscoDuro;

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
    private List <DiscoDuro> ListaDisco;
    private DiscoDuro discoduro;
    private Archivo archivo;
    
    public Operaciones(){
        ListaDisco = new ArrayList<>();
    }
    
    public void RegistrarDisco(){
        discoduro = new DiscoDuro();
        discoduro.Llenar();
        ListaDisco.add(discoduro);
    }
 
    public void AgregarArchivos(){
        boolean x=true;
        System.out.print("Ingrese marca del Disco Duro: ");
          String nom = leer.nextLine();         
          for (DiscoDuro m:ListaDisco){
              if(m.getMarca().equalsIgnoreCase(nom)){
                  x=false;
                  System.out.print("Digite la cantidad de Archivos que desea ingresar: ");
                  int lim = leer.nextInt();
                  archivo =new Archivo();
                  for (int i = 1; i <= lim; i++) {
                      leer.nextLine();
                      System.out.print("Ingrese nombre del Archivo: ");
                      archivo.setNomarchivo(leer.nextLine());
                      System.out.print("Ingrese el Tamaño del Archivo: ");
                      double tam = leer.nextDouble();
                      System.out.println("");
                      if(m.getEspacio() > tam){
                        archivo.setTamaño(tam);
                        double esp = m.getEspacio() - tam;
                        m.setEspacio(esp);
                        m.AñadirAr(archivo);
                      }else{
                          System.out.println("...................................................");
                          System.out.println("     ESPACIO INSUFICIENTE!!!       ");
                          System.out.println("...................................................");
                      }
                  }
              } 
          }
          if (x){
              System.out.println("............................................................................");
              System.out.println("EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!");
              System.out.println(".............................................................................");
          }
    }
    
    public void MostrarDisco(){
        int x=0;
        System.out.print("Ingrese marca del Disco Duro: ");
        String disco = leer.nextLine();   
        System.out.println("");
        for(DiscoDuro dis: ListaDisco){
            if (dis.getMarca().equalsIgnoreCase(disco)){
                x = 1;
                dis.Mostrar();
            }
        }
        if (x == 0){
              System.out.println("............................................................................");
              System.out.println("EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!");
              System.out.println(".............................................................................");
        }
    }
    
    public void EliminarAr(){
        int x=0;
        System.out.print("Ingrese marca del Disco Duro: ");
        String disco = leer.nextLine();
        for(DiscoDuro dis: ListaDisco){
            if (dis.getMarca().equalsIgnoreCase(disco)){
                x = 1;
                System.out.println("Ingrese nombre del Archivo: ");
                String nom = leer.nextLine();
                System.out.println("");
                dis.ElimAr(nom);
            }
        }
        if (x == 0){
              System.out.println("............................................................................");
              System.out.println("EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!");
              System.out.println(".............................................................................");
        }
    }
    
    public void CrearArchivo(){
        Path path=Paths.get("C:\\ProgramacionIII\\DiscoDuro.txt");
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("...................................................");
                System.out.println("ARCHIVO CREADO EXITOSAMENTE");
                System.out.println("....................................................");
            }else{
              System.out.println("..............................");
              System.out.println("Ya existe el archivo!");
              System.out.println("..............................");
            }
        } catch (Exception e) {
        }
    }
    
    public void AlamacenarDatos(){
        String location="C:\\ProgramacionIII\\DiscoDuro.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaDisco);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\ProgramacionIII\\DiscoDuro.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaDisco=(List<DiscoDuro>)ois.readObject();
            }else{
                System.out.println("archivo inexistente ");
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