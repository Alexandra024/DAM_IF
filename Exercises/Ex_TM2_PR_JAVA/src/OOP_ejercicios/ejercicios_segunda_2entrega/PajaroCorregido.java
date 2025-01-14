package OOP_ejercicios.ejercicios_segunda_2entrega;

public class PajaroCorregido {

    private static int contador = 10001;
    private static int total = 0;
    private String tipoPajaro;
    private String nombrePajaro;
    private int idPajaro;
    private String plumaje;
    private String color;

    public Pajaro(String tipoPajaro, String nombrePajaro) {
        this.tipoPajaro = tipoPajaro;
        this.nombrePajaro = nombrePajaro;
        this.idPajaro = contador++;
        this.newPajaro();
    }

    public Pajaro(String tipoPajaro, String nombrePajaro, String plumaje, String color) {
        this.tipoPajaro = tipoPajaro;
        this.nombrePajaro = nombrePajaro;
        this.idPajaro = contador++;
        this.plumaje = plumaje;
        this.color = color;
        this.newPajaro();
    }

    public String getTipoPajaro() {
        return tipoPajaro;
    }

    public void setTipoPajaro(String tipoPajaro) {
        this.tipoPajaro = tipoPajaro;
    }

    public String getNombrePajaro() {
        return nombrePajaro;
    }


    public void setNombrePajaro(String nombrePajaro) {
        this.nombrePajaro = nombrePajaro;
    }
    
    public String getNombrePajaro() {
        return nombrePajaro;
    }
    
    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
    
    public String getPlumaje() {
        return plumaje;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void newPajaro() {
        total++;
    }
    
    public static int getTotal() {
        return total;
    }
    
    @Override
    public String toString() {
        return "\nTipo de Pajaro: " + tipoPajaro + "\n" +
               "Nombre del Pajaro: " + nombrePajaro + "\n" +
               "Identificador: " + idPajaro + "\n" +
               "Plumaje: " + plumaje + "\n" +
               "Color del plumaje: " + color + "\n";
    }
    
}


