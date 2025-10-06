package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt.Ej8Serializable;

import java.io.Serializable;

// Serializar una clase Java que incluye composición con otra clase, Persona y Dirección.
// implica implementar la interfaz Serializable en ambas clases y asegurarse de que todos 
// los atributos de las clases compuestas también sean serializables.

public class Persona implements Serializable {
    // serialVersionUID para la clase Persona.
    private static final long serialVersionUID = 20240527002L; // Otro ID de versión

    private String nombre;
    private int edad;
    private Direccion direccion; // Composición: una Persona tiene una Direccion

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion; // Asignamos el objeto Direccion
    }

    // Getters 
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public Direccion getDireccion() { return direccion; }

    // Método toString  
    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + ", Edad: " + edad + ", Direccion: (" + direccion + ")]";
    }
}

