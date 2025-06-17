package EX_3EV_ORDINARIA;

public class Venta {
    
    
    private int id;
    private String libro;
    private int cantidad;
    private double precioUnitario;

    public Venta(int id, String libro, int cantidad, double precioUnitario) {
        this.id = id;
        this.libro = libro;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getLibro() { return libro; }
    public void setLibro(String libro) { this.libro = libro; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public double getTotal() { return cantidad * precioUnitario; }

    public String emitirTicket() { // forma eficiente de hacer un ticket
        StringBuilder sb = new StringBuilder(); // modifica el contenido internamente sin crear un nuevo objeto cada vez 
        sb.append("----- TICKET DE VENTA -----\n");
        sb.append("ID Venta: ").append(id).append("\n");
        sb.append("Libro: ").append(libro).append("\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("Precio unitario: ").append(String.format("%.2f", precioUnitario)).append(" €\n");
        sb.append("Importe total: ").append(String.format("%.2f", getImporteTotal())).append(" €\n");
        sb.append("--------------------------\n");
        return sb.toString();
    }

    // Alias para compatibilidad con toString
    public double getImporteTotal() {
        return getTotal();
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", libro='" + libro + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", importeTotal=" + getImporteTotal() +
                '}';
    }


    // toString
}
