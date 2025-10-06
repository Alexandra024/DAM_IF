package Ciclistas_Ex;

public class Contrarrelojista extends Ciclista {
    private int velocidadMax;

    public Contrarrelojista(String nombre, double tiempo, int velocidadMax) {
        super(nombre, tiempo);
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "Contrarrelojista [velocidadMax=" + velocidadMax + ", toString()=" + super.toString() + "]";
    } 
}
