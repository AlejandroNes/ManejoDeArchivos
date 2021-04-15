
package Hospital;
/**
 *
 * @author AlejandroNes
 */
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sd =new Scanner (System.in);
        boolean con = true;
        int opc;
        Operaciones op = new Operaciones();
        do{
            System.out.println("");
            System.out.println("    ======== MENU DE OPCIONES ========== ");
            System.out.println("");
            System.out.println("    1. RREGISTRAR HOSPITAL ");
            System.out.println("    2. AGREGAR ESPECIALIDAD ");
            System.out.println("    3. MOSTRAR ESPECIALIDADES");
            System.out.println("    4. LISTAR HOSPITALES DE LA ESPECIALIDAD");
            System.out.println("    5. SALIR ");
            System.out.println("");
            System.out.print("    ELIJA UNA OPCION : ");
            opc = sd.nextInt();
            System.out.println("");
            switch(opc){
                case 1:
                    op.registrarHospital();
                    break;
                case 2:
                    op.AgregarEspecialidad();
                    break;
                case 3:
                    op.mostrarHospital();
                    break;
                case 4:
                    op.mostrarPorEspecialidad();
                    break;
                case 5:
                    System.out.println("    Saliendo !!");
                    con = false;
                    break;
                default:
                    System.out.println("    Opcion Incorrecta...");
                    System.out.println("    Intente de nuevo...");
                    break;
            }
        }while (con);
    }
    
}
