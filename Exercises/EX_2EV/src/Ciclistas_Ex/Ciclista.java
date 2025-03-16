package Ciclistas_Ex;

public class Ciclista {
    
    private String nombre;
    private int id;
    private double tiempo;
    
    public Ciclista(String nombre, double tiempo) {
        this.nombre = nombre;
        this.id = id++;
        this.tiempo = tiempo;
    }
           
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return id; }
    public double getTiempo() { return tiempo; }
    
    @Override
    public String toString() {
        return "Ciclista [ID=" + id + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
    }
}
    