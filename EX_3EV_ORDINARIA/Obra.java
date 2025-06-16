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

