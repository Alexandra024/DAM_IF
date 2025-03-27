package Ex_TM3_Prg_JAVA.src.Circuitos;

import java.util.ArrayList;

public abstract class Circuito {

    protected int voltaje;
    protected ArrayList<Integer> ResistenciasList;

    public Circuito(int voltaje) {
        this.voltaje = voltaje;
        this.ResistenciasList = new ArrayList<Integer>(); // inicializamos la lista de resistencias
    }

    public void annadirResistencias(int resistencia) {
        ResistenciasList.add(resistencia);
    }

    public abstract float calcularIntensidad(); // método abstracto que debe ser implementado en las subclases

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [voltaje=" + voltaje + ", resistencias=" + ResistenciasList + "]";
    }
}