public class Estudiante extends Persona {
    private String carrera;
    private double promedio;
    private ListaEnlazada materias;

    public Estudiante(String nombre, String apellido, int edad, String documento,
                      String carrera, double promedio, ListaEnlazada materias) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = materias != null ? materias : new ListaEnlazada();
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }
    public ListaEnlazada getMaterias() { return materias; }
    public void setMaterias(ListaEnlazada materias) { this.materias = materias; }

    @Override
    public String describir() {
        return String.format("Estudiante: %s %s, carrera: %s, promedio: %.2f, doc: %s",
                getNombre(), getApellido(), carrera, promedio, getDocumento());
    }

    public String simpleString() {
        return String.format("%s %s - %s - Prom: %.2f (doc:%s)",
                getNombre(), getApellido(), carrera, promedio, getDocumento());
    }

    // Método recursivo para calcular promedio
    public static double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }
        Materia materia = (Materia) actual.dato;
        return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + materia.getNota());
    }
}
