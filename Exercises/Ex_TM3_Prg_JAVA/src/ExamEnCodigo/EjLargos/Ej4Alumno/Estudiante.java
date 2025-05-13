package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej4Alumno;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private double calificacionPromedio;

    public Estudiante(String nombre, int edad, double calificacionPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacionPromedio = calificacionPromedio;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getCalificacionPromedio() { return calificacionPromedio; }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        // Orden natural: por nombre (alfabético)
        return this.nombre.compareTo(otroEstudiante.getNombre());
    }

    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", calificacionPromedio=" + calificacionPromedio +
               '}';
    }
}
