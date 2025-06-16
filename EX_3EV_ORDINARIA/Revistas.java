package EX_3EV_ORDINARIA;

public class Revistas extends Obra {
    
    public long nSerie;
    public int iva = 7;

    public Revistas(String titulo, String autor, int annoED, int precio, long nSerie,int iva) {
        super(titulo, autor, annoED, precio);
        this.nSerie = nSerie;
        this.iva = iva;
    }

    @Override 
    public double precioFinal () {
        return precio + (precio * (double) iva / 100);
    }

    // toString
    @Override
    public String toString() {
        return "Revistas [nSerie=" + nSerie + ", iva=" + iva + "]";
    }

}
