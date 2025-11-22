public class Profesor extends Persona {
    private String especialidad;
    private int antiguedad;
    private ListaEnlazada materiasImpartidas;

    public Profesor(String nombre, String apellido, int edad, String documento,
                    String especialidad, int antiguedad, ListaEnlazada materiasImpartidas) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.antiguedad = antiguedad;
        this.materiasImpartidas = materiasImpartidas != null ? materiasImpartidas : new ListaEnlazada();
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }
    public ListaEnlazada getMateriasImpartidas() { return materiasImpartidas; }
    public void setMateriasImpartidas(ListaEnlazada materiasImpartidas) { this.materiasImpartidas = materiasImpartidas; }

    @Override
    public String describir() {
        return String.format("Profesor: %s %s, especialidad: %s, antiguedad: %d años, doc: %s",
                getNombre(), getApellido(), especialidad, antiguedad, getDocumento());
    }
}
