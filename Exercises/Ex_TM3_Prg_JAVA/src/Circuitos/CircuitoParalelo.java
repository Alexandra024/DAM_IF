package Ex_TM3_Prg_JAVA.src.Circuitos;


public class CircuitoParalelo extends Circuito {

    protected CircuitoParalelo(int voltaje) {
        super(voltaje); // llamamos al constructor de la clase padre
    }

    // calculo de la intensidad
    @Override
    public float calcularIntensidad() {
        float intensidadTotal = 0;
        for (int r : ResistenciasList) {
            if (r != 0) {
                intensidadTotal += (float) voltaje / r;
            }
        }
        return intensidadTotal;
    }
}
