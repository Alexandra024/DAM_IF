package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;

public class Producto {
    public double precio;
    public String nombre;
    public String codigoBarras;

    public Producto(double precio, String nombre, String codigoBarras) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
    }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCodigoBarras() { return codigoBarras; }
    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }

    @Override
    public String toString() {
        return "Producto [getPrecio()=" + getPrecio() + ", getNombre()=" + getNombre() + ", getCodigoBarras()="
                + getCodigoBarras() + "]";
    }

}
