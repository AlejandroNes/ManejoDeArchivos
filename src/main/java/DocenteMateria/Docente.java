/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocenteMateria;

import java.io.Serializable;

/**
 *
 * @author kelvi
 */
public class Docente implements Serializable{
   static final long serialVersionUID=1L; 
   private String nombre,paterno,materno,titulo;
   private int carga_horaria;
   private Materia mat;

   public void mostrar_doc(){
       System.out.println("nombre::"+this.nombre);
       System.out.println("AP paterno::"+this.paterno);
       System.out.println("AP materno::"+this.materno);
       System.out.println("titulo::"+this.titulo);
       System.out.println("carga horaria::"+this.carga_horaria);
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }
   
}
