package Hospital;

import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        boolean seguir = true;
        int x;
        Operaciones oh = new Operaciones();
        do{
            System.out.println(" =======MENU DE OPCIONES======");
            System.out.println("1. Crear Registro");
            System.out.println("2. Registrar Hospital");
            System.out.println("3. AñadirEspecialidad");
            System.out.println("4. Guardar Registros ");
            System.out.println("5. Mostrar Especialidades de un Hospital");
            System.out.println("6. Listar Hospitales de una Especialidad");
            System.out.println("7. Cerrar el Programa");
            System.out.println("_________________________________");
            System.out.println(" Elija una opcion    : ");
            System.out.println("===========================");
            x = leer.nextInt();
            System.out.println("");
            switch(x){
                case 1:
                    oh.CrearArchivo();
                    break;
                case 2:
                    oh.AñadirHospital();
                    oh.AlmacenarDatos();
                    break;
                case 3:
                    oh.AñadirEspecialidad();
                    oh.AlmacenarDatos();
                    break;
                case 4:
                    oh.AlmacenarDatos();
                    break;
                case 5:
                    oh.LeerDatos();
                    oh.MostrarHospital();
                    break;
                case 6:
                    oh.LeerDatos();
                    oh.MostrarPorEsp();
                    break;
                case 7:
                    System.out.println("Fin programa");
                    seguir = false;
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }while (seguir);
    }
}