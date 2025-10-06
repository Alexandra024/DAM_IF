package Ex_TM3_Prg_JAVA.src.Circuitos;

import java.util.ArrayList;

public class PlacaCircuitos {
    private ArrayList<Circuito> circuitos; 

    public PlacaCircuitos() {
        circuitos = new ArrayList<Circuito>(); // inicializamos la lista de circuitos
    }

    public void addCircuito(Circuito circuito) {
        if (circuito != null) {
            circuitos.add(circuito);
        } else {
            System.out.println("Error: Attempted to add a null circuit.");
        }
    }
    
    public float intensidadTotal(){
        float total = 0 ;
        for (Circuito circuito : circuitos) {
            total += circuito.calcularIntensidad();
        }
        return total;
    } 
}
