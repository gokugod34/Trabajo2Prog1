public class AlgoritmosOrdenamiento {

    
    public static void bubbleSortPorApellido(ListaEnlazada lista) {
        Object[] array = lista.convertirAArray();
        int n = array.length;
        if (n <= 1) return;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Estudiante a = (Estudiante) array[j];
                Estudiante b = (Estudiante) array[j + 1];
                if (a.getApellido().compareToIgnoreCase(b.getApellido()) > 0) {
                    array[j] = b;
                    array[j + 1] = a;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        
        ListaEnlazada nueva = ListaEnlazada.convertirArrayALista(array);
        lista = nueva;
    }

    
    public static Estudiante busquedaBinariaPorApellido(ListaEnlazada lista, String apellido) {
        Object[] array = lista.convertirAArray();
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Estudiante e = (Estudiante) array[mid];
            int cmp = e.getApellido().compareToIgnoreCase(apellido);
            if (cmp == 0) return e;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
