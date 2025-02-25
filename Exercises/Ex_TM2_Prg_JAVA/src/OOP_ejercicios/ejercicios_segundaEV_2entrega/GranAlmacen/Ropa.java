package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;

// ctrl derecho > source > formar tostring O getters y setters ...

public class Ropa extends Producto {
    private String material;

    public Ropa(double precio,String nombre,String codigoBarras,String material) {
        super(precio, nombre, codigoBarras);
        this.material = material;
    }
    public String getMaterial() { return material; }
    
	@Override
    public String toString() {
        return "Ropa [material=" + material + ", getMaterial()=" + getMaterial() + "]";
    }
}
