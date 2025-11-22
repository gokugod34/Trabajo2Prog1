public class Universidad {
    private String nombre;
    private ListaEnlazada miembros;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.miembros = new ListaEnlazada();
    }

    public void agregarMiembro(Persona p) { miembros.agregar(p); }
    public ListaEnlazada getMiembros() { return miembros; }

    public ListaEnlazada getEstudiantes() {
        ListaEnlazada est = new ListaEnlazada();
        Nodo actual = miembros.getPrimero();
        while (actual != null) {
            if (actual.dato instanceof Estudiante) {
                est.agregar(actual.dato);
            }
            actual = actual.siguiente;
        }
        return est;
    }

    public void mostrarMiembros() {
        Nodo actual = miembros.getPrimero();
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}

