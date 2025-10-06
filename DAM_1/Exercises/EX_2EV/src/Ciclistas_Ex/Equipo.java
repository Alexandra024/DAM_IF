package Ciclistas_Ex;

import java.util.ArrayList;

public class Equipo {
    private String name;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String name) {
        this.name = name;
        this.ciclistas = new ArrayList<>();
    }

    public void addCiclista(Ciclista c){
        ciclistas.add(c);
    }

    public String mostrarCiclistas(){
        String s = "";
        for (Ciclista i : ciclistas){
            s += " \n " + "Numero de ciclista: " + i.getNumero() + " - " + i.getNombre() + i.toString();
            
        }
        return s;
    }

    public String mostrarTiempoTotal(){
        String s = " ";
        double tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempo();
        }
        s += "Tiempo total del equipo: " + tiempoTotal;
        return s;
    }

    @Override
    public String toString() {
        return "Equipo [name=" + name + ", ciclistas=" + ciclistas + "]";
    }
}
