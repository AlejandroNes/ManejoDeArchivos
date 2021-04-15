
package DocenteMateria;

import java.io.Serializable;

/**
 *
 * @author AlejandroNes
 */
public class Docente implements Serializable{
   static final long serialVersionUID=1L; 
   private String nombre,paterno,materno,titulo;
   private int carga_horaria;
   private Materia mat;

   public void mostrar_doc(){
       System.out.println("Nombre::"+this.nombre);
       System.out.println("AP Paterno::"+this.paterno);
       System.out.println("AP Materno::"+this.materno);
       System.out.println("Titulo::"+this.titulo);
       System.out.println("Carga Horaria::"+this.carga_horaria);
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
