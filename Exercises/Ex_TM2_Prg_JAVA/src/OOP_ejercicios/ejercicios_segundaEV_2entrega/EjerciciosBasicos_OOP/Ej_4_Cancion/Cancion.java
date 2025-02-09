package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_4_Cancion;

public class Cancion {
    private String titulo;
    private String autor;

    // Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor por defecto
    public Cancion() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
    }

    // Métodos Get y Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método toString para mostrar la información de la canción
    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

