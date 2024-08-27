package ejemploslistasenlazadas;

/**
 *
 * @author ALUMNOS #
 */
public class Nodo {
     //Dato que contiene el nodo
    int dato;
    //Referencia al siguiente nodo de la lista
    Nodo siguiente;
    
    public Nodo(int dato){
    //Inicializa el valor del dato
    this.dato=dato;
    //El siguiente nodo es inicialmente null
    this.siguiente=null;
    }
}


class ListaEnlazada {
    //El primer nodo de la lista(Referemvia a la cabeza de la lista)
    Nodo cabeza;
    //Metodo para insertar un nuevo nodo en la lista
    public void insertar (int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }
    //Metodo paramostrar todos los nodos de la lista
    public void mostrarLista() {
    Nodo actual =cabeza;

    while (actual != null){
    System.out.print(actual.dato + "->");
    actual= actual.siguiente;
    }
    System.out.println("null");
    }
    public void modificar (int datoActual, int nuevoDato){
        Nodo actual = cabeza;
        while(actual!= null){
            if (actual.dato == datoActual){
                actual.dato= nuevoDato;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Nodo con dato: "+ datoActual + " no encontrado.");
    }
    // Método para eliminar un nodo que contiene un dato específico
    public void eliminar (int dato) {
        if (cabeza == null) {
            System.out.println ("La lista está vacía.");
        return;
        }
        // Si el nodo a eliminar es la cabeza de la lista
        if (cabeza.dato == dato) {
            cabeza = cabeza. siguiente;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual. siguiente.dato != dato) {
            actual = actual. siguiente;
        }
        if (actual.siguiente == null) {
            System.out.println ("Nodo con dato " + dato + " no encontrado.") ;
        } else {
            actual. siguiente = actual.siguiente.siguiente;
            }
    }
}