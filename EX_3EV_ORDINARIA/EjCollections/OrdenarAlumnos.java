package EX_3EV_ORDINARIA.EjCollections;

import java.util.*;

public class OrdenarAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("García", 7.5, 2));
        alumnos.add(new Alumno("López", 9.0, 1));
        alumnos.add(new Alumno("García", 8.0, 1));

        // Ordenar por apellido, luego por curso, luego por nota descendente
        alumnos.sort(Comparator
            .comparing(Alumno::getApellido)
            .thenComparing(Alumno::getCurso)
            .thenComparing(Comparator.comparingDouble(Alumno::getNota).reversed())
        );

        // Mostrar resultado
        for (Alumno a : alumnos) {
            System.out.println(a.getApellido() + " " + a.getNota() + " " + a.getCurso());
        }
    }
}

