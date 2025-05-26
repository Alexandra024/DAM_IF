package Ex_TM3_Prg_JAVA.src.Examen3EV;

import java.util.*;

public abstract class Empleado implements Calculable{
    public String nombre;
    private int id;
    protected Direccion direccion;

    // CONSTRUCTOR
    public Empleado(String nombre, int id, Direccion direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }

    // ASBTRACT METHODS
    public abstract void mostrarInformacion();
    public abstract double calcularSalarioTotal(); // if u dont calculate now IT MUST BE ABSTRACT
}


