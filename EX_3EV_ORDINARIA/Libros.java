package EX_3EV_ORDINARIA;

public class Libros extends Obra implements Regalable {

    public long ISBN;
    public int iva = 3;
    public String lazoColor;

    public Libros(String titulo, String autor, int annoED, int precio, long ISBN, int iva) {
        super(titulo, autor, annoED, precio);
        this.ISBN = ISBN;
        this.iva = iva;
    }

    @Override
    public double precioFinal() {
        return precio + (precio * (double) iva / 100);
    }

    @Override
    public void ponerLazo(String color) {
        this.lazoColor = color; // creacion de atributo al principio de la clase
        System.out.println("Lazo puesto en el libro: " + color);
    }

    // toString
    @Override
    public String toString() {
        return "Libros [ISBN=" + ISBN + ", iva=" + iva + ", lazoColor=" + lazoColor + "]";
    }
   
}
