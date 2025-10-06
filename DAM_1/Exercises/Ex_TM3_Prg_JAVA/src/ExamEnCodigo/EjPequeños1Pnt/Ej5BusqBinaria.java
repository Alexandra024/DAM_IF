package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt;

import java.util.*;

// En un ArrayList de Alumno quiero realizar una búsqueda binaria. de un alumno. 
// ¿Qué debo hacer? ¿Qué es necesario tener implementado para su funcionamiento?
// Crea el código que resuelva el problema.


class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int id;

    public Alumno(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; } 
    public int getId() { return id; }

    @Override
    public int compareTo(Alumno otro) {
        // Por ejemplo, comparar por id
        return Integer.compare(this.id, otro.id);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' + ", id=" + id + '}';
    }
}

public class Ej5BusqBinaria {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ana", 3));
        alumnos.add(new Alumno("Luis", 1));
        alumnos.add(new Alumno("Maria", 2));

        // Es necesario ORDENAR la lista antes de la búsqueda binaria
        Collections.sort(alumnos);

        // Alumno a buscar (por id)
        Alumno buscado = new Alumno("Cualquiera", 2);

        int index = Collections.binarySearch(alumnos, buscado);

        if (index >= 0) {
            System.out.println("Encontrado: " + alumnos.get(index));
        } else {
            System.out.println("No encontrado");
        }
    }
}
