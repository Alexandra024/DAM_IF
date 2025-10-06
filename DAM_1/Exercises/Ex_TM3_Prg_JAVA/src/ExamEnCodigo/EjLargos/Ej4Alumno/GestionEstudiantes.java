package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej4Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionEstudiantes {
    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Carlos", 20, 8.5));
        estudiantes.add(new Estudiante("Ana", 19, 9.2));
        estudiantes.add(new Estudiante("Benito", 21, 7.8));
        estudiantes.add(new Estudiante("Diana", 18, 9.0));
        estudiantes.add(new Estudiante("Esteban", 20, 8.8));
        estudiantes.add(new Estudiante("Zoe", 19, 9.5));

        System.out.println("Lista original:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 1. Ordenar por nombre (orden natural)
        Collections.sort(estudiantes);
        System.out.println("\nLista ordenada por nombre:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 2. Ordenar por edad (ascendente)
        Collections.sort(estudiantes, new OrdenarPorEdad());
        System.out.println("\nLista ordenada por edad:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 3. Ordenar por calificación promedio (descendente)
        Collections.sort(estudiantes, new OrdenarPorCalificacion());
        System.out.println("\nLista ordenada por calificación promedio:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}