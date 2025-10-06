package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej4Alumno;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        return Integer.compare(estudiante1.getEdad(), estudiante2.getEdad());
    }
}
