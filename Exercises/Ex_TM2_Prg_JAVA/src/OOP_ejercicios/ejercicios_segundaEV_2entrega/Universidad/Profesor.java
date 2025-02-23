package OOP_ejercicios.ejercicios_segundaEV_2entrega.Universidad;

public class Profesor {
    public String departamento; 
    public String categoria; 

    public Profesor(String nombre, String direccion, String departamento, String categoria){
        nombre = nombre; // ver si esta bien o no este y direcciion
        direccion = direccion;
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }


    
}
