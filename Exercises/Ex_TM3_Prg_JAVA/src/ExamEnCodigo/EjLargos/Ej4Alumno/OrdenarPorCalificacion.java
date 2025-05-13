package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej4Alumno;

import java.util.Comparator;

public class OrdenarPorCalificacion implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        // Orden descendente: restamos la calificación del segundo a la del primero
        return Double.compare(estudiante2.getCalificacionPromedio(), estudiante1.getCalificacionPromedio());
    }
}
