package Ciclistas_Ex;

public class Velocista extends Ciclista {
    private double potencia ;
    private double velocidad;

    public Velocista(String nombre, double tiempo, double potencia, double velocidad) {
        super(nombre, tiempo);
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Velocista [potencia=" + potencia + ", velocidad=" + velocidad + ", toString()=" + super.toString()
                + "]";
    }
}
