package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;

public class Alimentacion extends Producto {
   
    private int dia;
    private int mes;
    private int anno;

    public Alimentacion(double precio,String nombre,String codigoBarras,int dia,int mes,int anno) {
        super(precio, nombre, codigoBarras);
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnno() { return anno; }

    public String getFechaCaducidad() {
        return dia + "/" + mes + "/" + anno;
    }
    
    @Override
	public String toString() {
		return "Alimentacion [\n dia=" + getDia() + ",\n mes=" + getMes() + 
            ",\n anno=" + getAnno() + ",\n toString()=" + super.toString()+ "]"+"\n";
	}
	
}
