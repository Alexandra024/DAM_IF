package EX_3EV_ORDINARIA.EjCollections;

public class Alumno {
    private String apellido;
    private double nota;
    private int curso;

    // Constructor, getters y setters

    public Alumno(String apellido, double nota, int curso) {
        this.apellido = apellido;
        this.nota = nota;
        this.curso = curso;
    }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
    public int getCurso() { return curso; }
    public void setCurso(int curso) { this.curso = curso; }
}

