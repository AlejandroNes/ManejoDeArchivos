
package DocenteMateria;

import java.io.Serializable;

/**
 *
 * @author AlejandroNes
 */
public class Materia implements Serializable{
    static final long serialVersionUID=2L; 
    private String nom_materia;
    private int ano_materia,horas_Materia;

    public void mostrar_mat(){
        System.out.println("Materia::"+this.nom_materia);
        System.out.println("Año de materia::"+this.ano_materia);
        System.out.println("Horas materia::"+this.horas_Materia);
    }
    public String getNom_materia() {
        return nom_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public int getAno_materia() {
        return ano_materia;
    }

    public void setAno_materia(int ano_materia) {
        this.ano_materia = ano_materia;
    }

    public int getHoras_Materia() {
        return horas_Materia;
    }

    public void setHoras_Materia(int horas_Materia) {
        this.horas_Materia = horas_Materia;
    }
    
}
