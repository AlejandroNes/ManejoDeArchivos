package DocenteMateria;


import java.util.Scanner;

/**
 *
 * @author AlejandroNes
 */
public class Principal {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int opc = 0;
        boolean continuar = true;
        //instanciamos la clase OperacionesClienteTarjeta
        Operacion obj = new Operacion();
        
        do {
            System.out.println("________________________");
            System.out.println("1.- Crear Docente");
            System.out.println("2.- Crear Materia");
            System.out.println("3.- Asignar Materia");
            System.out.println("4.- Mostrar Docente");
            System.out.println("5.- Salir");
            System.out.println("Digite una opción");
            System.out.println("________________________ ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.regsitra_docente();
                    break;
                case 2:
                    obj.registra_materia();
                    break;
                case 3:
                    obj.asignar_materia();
                    break;
                case 4:
                    obj.mostrar_docente();                    
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);

    }
    }

