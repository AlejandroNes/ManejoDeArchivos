package DiscoDuro;

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
        Operaciones od = new Operaciones();
        do{
            System.out.println("___________________________");
            System.out.println("              MENU DE OPCIONES          ");
            System.out.println("1. Crear archivo");
            System.out.println("2. Registrar Disco Duro");
            System.out.println("3. Añadir Archivos");
            System.out.println("4. Guardar registros");
            System.out.println("5. Mostrar Disco Duro");
            System.out.println("6. Eliminar Archivo");
            System.out.println("7. Cerrar el Programa");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("____________________________");
            x = leer.nextInt();
            System.out.println("");
            switch(x){
                case 1:
                    od.CrearArchivo();
                    break;
                case 2:
                    od.LeerDatos();
                    od.RegistrarDisco();
                    od.AlamacenarDatos();
                    break;
                case 3:
                    od.LeerDatos();
                    od.AgregarArchivos();
                    od.AlamacenarDatos();
                    break;
                case 4:
                    System.out.println("Datos registrados");
                    System.out.println("");
                    od.AlamacenarDatos();
                    break;
                case 5:
                    od.LeerDatos();
                    od.MostrarDisco();
                    break;
                case 6:
                    od.LeerDatos();
                    od.EliminarAr();
                    od.AlamacenarDatos();
                    break;
                case 7:
                    System.out.println("Fin programa...");

                    seguir = false;
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }while (seguir);
    }
}