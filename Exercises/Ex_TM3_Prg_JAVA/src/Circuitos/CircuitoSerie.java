package Ex_TM3_Prg_JAVA.src.Circuitos;

public class CircuitoSerie extends Circuito {
    
    protected CircuitoSerie (int voltaje) {
        super(voltaje); // llamamos al constructor de la clase padre
    }

    // calculo de la intensidad
    @Override
    public float calcularIntensidad() {
        int sumaResistencias = 0;
        for (int r : ResistenciasList) {
            sumaResistencias += r; // suma de las resistencias
        }
        return sumaResistencias != 0 ? (float) voltaje / sumaResistencias : 0;
        // si la suma de resistencias es diferente de 0, devolvemos el voltaje 
        // entre la suma de resistencias, si no devolvemos 0
    }
}
