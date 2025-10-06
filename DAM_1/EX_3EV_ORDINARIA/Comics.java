package EX_3EV_ORDINARIA;

import java.util.Arrays;

public class Comics extends Obra {

    public String[] tipoComic;
    public int iva = 10;


    public Comics(String titulo, String autor, int annoED, int precio, String[] tipoComic, int iva) {
        super(titulo, autor, annoED, precio);
        tipoComic = new String []{"MANGA", "HUMOR", "MARVEL"};
        this.iva = iva;
                                            
    }

    @Override 
    public double precioFinal () {
        return precio + (precio * (double) iva / 100);
    }

    @Override
    public String toString() {
        return "Comics [tipoComic=" + Arrays.toString(tipoComic) + ", iva=" + iva + "]";
    }

    // toString

    
}