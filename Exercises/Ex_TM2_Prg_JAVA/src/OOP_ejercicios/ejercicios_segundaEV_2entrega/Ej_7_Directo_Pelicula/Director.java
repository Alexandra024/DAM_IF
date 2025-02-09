package OOP_ejercicios.ejercicios_segundaEV_2entrega.Ej_7_Directo_Pelicula;

public class Director {
    private String nombre;
    private String pais;
    private int año;

    // Constructor
    public Director(String nombre, String pais, int año) {
        this.nombre = nombre;
        this.pais = pais;
        this.año = año;
    }

    @Override
    public String toString() {
        return nombre + " (" + pais + ", " + año + ")";
    }
}

