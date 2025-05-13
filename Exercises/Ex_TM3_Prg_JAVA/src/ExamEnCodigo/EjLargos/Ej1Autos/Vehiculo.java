package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class Vehiculo {
    private String modelo;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() { return modelo; } 
    public void setModelo(String modelo) { this.modelo = modelo; }

    // // Podemos agregar métodos comunes a todos los vehículos si es necesario
    // public void mostrarModelo() {
    //     System.out.println("Modelo: " + this.modelo);
    // }

    @Override
    public String toString() {
        return "Vehiculo [modelo=" + modelo + "]";
    }

    
}
