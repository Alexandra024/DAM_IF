package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt.Ej8Serializable;

// Direccion.java
import java.io.Serializable;

public class Direccion implements Serializable {
    // serialVersionUID es crucial para la compatibilidad entre versiones de la clase
    // Es una buena práctica definirlo explícitamente.
    private static final long serialVersionUID = 20240527001L; // Ejemplo de un ID de versión

    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    // Getters 
    public String getCalle() { return calle; }
    public String getCiudad() { return ciudad; }
    public String getCodigoPostal() { return codigoPostal; }

    // Método toString 
    @Override
    public String toString() {
        return "Calle: " + calle + ", Ciudad: " + ciudad + ", CP: " + codigoPostal;
    }
}