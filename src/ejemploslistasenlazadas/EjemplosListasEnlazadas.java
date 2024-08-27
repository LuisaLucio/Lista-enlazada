package ejemploslistasenlazadas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS #
 */
public class EjemplosListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System. in) ;
        ListaEnlazada lista = new ListaEnlazada () ;
        int opcion = 0;
        do {
            System.out.println("\nMenú de Opciones:") ;
            System.out.println("1. Insertar un nodo en la lista");
            System.out.println("2. Eliminar un nodo de la lista");
            System.out.println("3. Modificar el contenido de un nodo");
            System.out.println("4. Mostrar la lista") ;
            System.out.println("5. Salir");
            System.out.print ("Seleccione una opción: ");

            try {
            opcion = scanner.nextInt ();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    int datoInsertar = scanner.nextInt () ;
                    lista.insertar (datoInsertar);
                    System.out.println ("Dato insertado en la lista.");
                    break;
                    
                case 2:
                    System.out.print("Ingrese el dato del nodo a eliminar: ");
                    int datoEliminar = scanner.nextInt () ;
                    lista.eliminar (datoEliminar);
                    break;
                    
                case 3:
                    System.out.print ("Ingrese el dato del nodo a modificar: ");
                    int datoActual = scanner.nextInt ();
                    System.out.print ("Ingrese el nuevo valor: ");
                    int nuevoDato = scanner.nextInt ();
                    lista.modificar (datoActual, nuevoDato) ;
                    break;
                    
                case 4:
                    System. out.println ("Contenido de la lista:") ;
                    lista.mostrarLista ();
                    break;
                    
                case 5:
                    System.out.println ("Saliendo del programa.") ;
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.") ;
                    
                    }
                }  catch (InputMismatchException e) {
                    System. out.println("Entrada no válida. Por favor, ingrese un número.") ;
                    scanner.next () ;
                    // Consumir el input no válido para evitar un bucle infinito
                }
            } while (opcion != 5) ;
            
            scanner.close ();
    }  
}