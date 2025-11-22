public class AlgoritmosRecursivos {

    
    public static double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }
        Materia materia = (Materia) actual.dato;
        return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + materia.getNota());
    }

    
    public static int contarEstudiantesPorCarreraRec(Nodo actual, String carrera) {
        if (actual == null) return 0;
        Estudiante e = (Estudiante) actual.dato;
        int esEsta = e.getCarrera().equalsIgnoreCase(carrera) ? 1 : 0;
        return esEsta + contarEstudiantesPorCarreraRec(actual.siguiente, carrera);
    }

    
    public static Estudiante buscarEstudiantePorDocumentoRec(Nodo actual, String documento) {
        if (actual == null) return null;
        Estudiante e = (Estudiante) actual.dato;
        if (e.getDocumento().equalsIgnoreCase(documento)) return e;
        return buscarEstudiantePorDocumentoRec(actual.siguiente, documento);
    }
}
