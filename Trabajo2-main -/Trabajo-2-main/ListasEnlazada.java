public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public Nodo getPrimero() { return primero; }

    public Object[] convertirAArray() {
        int tamaño = 0;
        Nodo actual = primero;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }

        Object[] array = new Object[tamaño];
        actual = primero;
        int indice = 0;
        while (actual != null) {
            array[indice++] = actual.dato;
            actual = actual.siguiente;
        }
        return array;
    }

    public static ListaEnlazada convertirArrayALista(Object[] array) {
        ListaEnlazada nuevaLista = new ListaEnlazada();
        for (Object obj : array) {
            nuevaLista.agregar(obj);
        }
        return nuevaLista;
    }
}
