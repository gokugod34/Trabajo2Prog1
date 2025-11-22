public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", "Gomez", 45, "DNI123");

        
        ListaEnlazada materiasE1 = new ListaEnlazada();
        materiasE1.agregar(new Materia("Matematica", 8.5));
        materiasE1.agregar(new Materia("Programacion", 9.0));

        ListaEnlazada materiasE2 = new ListaEnlazada();
        materiasE2.agregar(new Materia("Biologia", 9.1));
        materiasE2.agregar(new Materia("Quimica", 8.7));

        ListaEnlazada materiasE3 = new ListaEnlazada();
        materiasE3.agregar(new Materia("Fisica", 7.2));
        materiasE3.agregar(new Materia("Programacion", 8.0));

        ListaEnlazada materiasE4 = new ListaEnlazada();
        materiasE4.agregar(new Materia("Dibujo", 8.0));
        materiasE4.agregar(new Materia("Historia del Arte", 7.5));

        ListaEnlazada materiasE5 = new ListaEnlazada();
        materiasE5.agregar(new Materia("Anatomia", 9.4));
        materiasE5.agregar(new Materia("Bioquimica", 9.2));

        Estudiante e1 = new Estudiante("Lucas", "Perez", 20, "DNI201", "Ingenieria", 8.5, materiasE1);
        Estudiante e2 = new Estudiante("Mariana", "Alvarez", 22, "DNI202", "Medicina", 9.1, materiasE2);
        Estudiante e3 = new Estudiante("Sergio", "Lopez", 21, "DNI203", "Ingenieria", 7.2, materiasE3);
        Estudiante e4 = new Estudiante("Pedro", "Garcia", 23, "DNI204", "Arquitectura", 8.0, materiasE4);
        Estudiante e5 = new Estudiante("Carla", "Molina", 19, "DNI205", "Medicina", 9.4, materiasE5);

        ListaEnlazada materiasProf1 = new ListaEnlazada();
        materiasProf1.agregar("Anatomia");
        materiasProf1.agregar("Fisiologia");

        Profesor prof1 = new Profesor("Dr. Raul", "Sanchez", 52, "DNI900", "Fisiologia", 25, materiasProf1);

        Universidad uni = new Universidad("Universidad Ejemplo");
        uni.agregarMiembro(p1);
        uni.agregarMiembro(e1);
        uni.agregarMiembro(e2);
        uni.agregarMiembro(e3);
        uni.agregarMiembro(e4);
        uni.agregarMiembro(e5);
        uni.agregarMiembro(prof1);

        System.out.println("---- Miembros de la universidad ----");
        uni.mostrarMiembros();

        System.out.println("\n---- Descripciones (polimorfismo) ----");
        Nodo actual = uni.getMiembros().getPrimero();
        while (actual != null) {
            Persona miembro = (Persona) actual.dato;
            System.out.println(miembro.describir());
            actual = actual.siguiente;
        }

        
        double promedioRec = Estudiante.calcularPromedioRecursivo(materiasE1.getPrimero(), 0, 0);
        System.out.printf("\nPromedio recursivo de Lucas = %.2f\n", promedioRec);

        
        int cantidadMedicina = AlgoritmosRecursivos.contarEstudiantesPorCarreraRec(uni.getEstudiantes().getPrimero(), "Medicina");
        System.out.printf("\nCantidad en Medicina (recursivo): %d\n", cantidadMedicina);

        
        Estudiante encontrado = AlgoritmosRecursivos.buscarEstudiantePorDocumentoRec(uni.getEstudiantes().getPrimero(), "DNI203");
        System.out.println("\nBusqueda recursiva por documento DNI203:");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("\n---- Estudiantes antes de ordenar ----");
        imprimirEstudiantes(uni.getEstudiantes());

        
        AlgoritmosOrdenamiento.bubbleSortPorApellido(uni.getEstudiantes());
        System.out.println("\n---- Estudiantes despues de ordenar por apellido (ASC) ----");
        imprimirEstudiantes(uni.getEstudiantes());

        
        Estudiante resBusqueda = AlgoritmosOrdenamiento.busquedaBinariaPorApellido(uni.getEstudiantes(), "Lopez");
        System.out.println("\nBusqueda binaria por apellido 'Lopez':");
        System.out.println(resBusqueda != null ? resBusqueda : "No encontrado");

        System.out.println("\n---- Fin de la ejecucion ----");
    }

    private static void imprimirEstudiantes(ListaEnlazada lista) {
        Nodo actual = lista.getPrimero();
        while (actual != null) {
            Estudiante e = (Estudiante) actual.dato;
            System.out.println(e.simpleString());
            actual = actual.siguiente;
        }
    }
}
