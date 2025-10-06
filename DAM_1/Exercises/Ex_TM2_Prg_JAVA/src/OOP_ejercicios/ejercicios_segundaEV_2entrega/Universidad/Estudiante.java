package OOP_ejercicios.ejercicios_segundaEV_2entrega.Universidad;

public class Estudiante {
    public String carrera;
    public int semestre;

    public Estudiante(String nombre, String direccion, String carrera, int semestre){
        nombre = nombre; // ver si esta bien o no este y direcciion
        direccion = direccion;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }


    
}
