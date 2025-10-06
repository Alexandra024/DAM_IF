package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;

public class Electronica extends Producto {
 
    private double plusgarantia;
    private int annosGarantia= 3;

    public Electronica(double precio,String nombre,String codigoBarras,double plusgarantia) {
        super(precio,nombre, codigoBarras); // orden de parametros importa
        this.plusgarantia = plusgarantia;
    }
        
    public double getPlusgarantia() { return plusgarantia; }
    public int getAnnosGarantia() { return annosGarantia; }

    public double getPrecioElectr(){
        return (float) (super.getPrecio() + getPlusgarantia());
    }

    @Override
    public String toString() {
        return "Electronica [plusgarantia=" + getPlusgarantia() + ", codigoBarras=" + getCodigoBarras() + ", toString()="
                + super.toString() + "]"+"\n";
    }
	
}
