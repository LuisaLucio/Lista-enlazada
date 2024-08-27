package ejemploslistasenlazadas;

/**
 *
 * @author ALUMNOS #
 */
public class EjemplosListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una nueva lista enlazada vacia
        ListaEnlazada lista= new ListaEnlazada();
        //Inserte valores en la lista
        lista. insertar (10);
        lista. insertar (30) ; lista. insertar (20) ;
        lista.mostrarLista ();
        // Modifica el nodo con dato 20 a 40
        lista.modificar (20, 40);
        lista.mostrarLista ();
        // Elimina un nodo con el dato 20
        lista.eliminar (20) ;
        System.out.println ("Después de eliminar 20:");
        lista.mostrarLista ();
    }
}
