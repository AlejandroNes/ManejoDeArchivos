package Hospital;
/**
 *
 * @author AlejandroNes
 */
public class Especialidad {
    
    // ATRIBUTOS
    private String nomEspe;
    
    // METODOS
    public void mostrarEspe(){
        System.out.println("Especialidad : "+this.nomEspe);
    }
    
    public String getNomEspe() {
        return nomEspe;
    }

    public void setNomEspe(String nomEspe) {
        this.nomEspe = nomEspe;
    }
    
}