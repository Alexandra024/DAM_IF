package OOP_ejercicios.ejercicios_segundaEV_2entrega.Ej_11_Biblioteca;

class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;

    public Persona(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + fechaNacimiento + ")";
    }
}