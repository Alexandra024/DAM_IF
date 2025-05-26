package Ex_TM3_Prg_JAVA.src.Examen3EV;

public class Direccion {
    
    public String nombreCalle;
    public int puerta;
    public int piso;
    public enum TipoDireccion {
        CASA, APARTAMENTO, OFICINA, AVENIDA 
    }
    public TipoDireccion tipo;
    public int CP;

}