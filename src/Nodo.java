public class Nodo { // Clase Nodo para representar cada elemento de la lista doble circular
    int dato; // atributo
    Nodo anterior; //atributo 
    Nodo siguiente; // atributo

    public Nodo(int dato) { // Constructor para inicializar el nodo con un dato específico
        this.dato = dato; // Asignar el valor del dato al nodo
        this.anterior = null; // El nodo inicialmente no apunta a ningún otro nodo
        this.siguiente = null; // El nodo inicialmente no apunta a ningún otro nodo
    } 
} 