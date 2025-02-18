package OOP_ejercicios.ejercicios_segundaEV_2entrega.Ej_7_Director_Pelicula;

public class Pelicula {
    private String titulo;
    private int año;
    private Director director;

    // Constructor
    public Pelicula(String titulo, int año, Director director) {
        this.titulo = titulo;
        this.año = año;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.titulo + ", Año: " + this.año + ", Director: " + director;
    }

    // impresion
    public void impresion() {
        System.out.println(this.toString());
    }
}
