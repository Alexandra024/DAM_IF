package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_2_Fecha;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Fecha> fechas = new HashSet<>();
        
        Fecha fecha1 = new Fecha(10, 5, 2024);
        Fecha fecha2 = new Fecha(10, 5, 2024);
        
        fechas.add(fecha1);
        System.out.println(fechas.contains(fecha2)); // Devuelve true gracias a hashCode()
    }
}
