package Ciclistas_Ex;

public class Escalador extends Ciclista {
    private float aceleracion;
    private float gradoInclinacion;

    public Escalador(String nombre, double tiempo, float aceleracion, float gradoInclinacion) {
        super(nombre, tiempo);
        this.aceleracion = aceleracion;
        this.gradoInclinacion = gradoInclinacion;
    }

    @Override
    public String toString() {
        return "Escalador [aceleracion=" + aceleracion + ", gradoInclinacion=" + gradoInclinacion + ", toString()="
                + super.toString() + "]";
    }
}
