package Ex_TM3_Prg_JAVA.src.Examen3EV;

import java.io.Serializable;
import java.util.*;
import java.io.Serializable;

public abstract class Empleado implements Calculable, Serializable{
    public String nombre;
    private int id;
    protected Direccion direccion;

    // CONSTRUCTOR
    public Empleado(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public Direccion getDireccion() { return direccion; }

    // ASBTRACT METHODS
    public abstract void mostrarInformacion();    // if u dont calculate now IT MUST BE ABSTRACT

    public double calcularSalarioTotal() { // Had so much trouble with this
        // Default implementation, can be overridden by subclasses
        return 0.0;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + "]";
    }

}


