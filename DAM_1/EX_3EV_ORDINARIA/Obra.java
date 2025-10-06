/**
 * Clase abstracta que representa una obra literaria o artística.
 * Contiene información básica como el título, autor, año de edición y precio.
 * Proporciona métodos para acceder a estos atributos y un método abstracto
 * para calcular el precio final de la obra, que debe ser implementado por las subclases.
 * 
 * @author sarab
 * @version 1.0
 * 
 * @param titulo Título de la obra.
 * @param autor Autor de la obra.
 * @param annoED Año de edición de la obra.
 * @param precio Precio base de la obra.
 */

package EX_3EV_ORDINARIA;

public abstract class Obra {

    public String titulo;
    public String autor;
    public int annoED;
    public int precio;

    public Obra (String titulo, String autor, int annoED, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.annoED = annoED;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnnoED() { return annoED; }
    public int getPrecio() { return precio; }

    public abstract double precioFinal();

    // toString
    @Override
    public String toString() {
        return "Obra [titulo=" + titulo + ", autor=" + autor + ", annoED=" + annoED + ", precio=" + precio + "]";
    }
    
}

