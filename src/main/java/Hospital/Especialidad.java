package Hospital;

/**
 *
 * @author AlejandroNes
 */
public class Especialidad {
    transient static final long serialVersionUID=2L;
    private String nomesp;
    
    public void MostrarEsp(){
        System.out.println("Especialidad: "      +this.nomesp);
    }

    public String getNomesp() {
        return nomesp;
    }

    public void setNomesp(String nomesp) {
        this.nomesp = nomesp;
    }
}