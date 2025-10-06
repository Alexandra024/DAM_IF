package OOP_ejercicios.ejercicios_segundaEV_2entrega.Atleta;

public class Atleta {
    private int id;
    private String name_atlet;
    private double time;
    private static int contador = 1;
    private static String seleccion = "Colombia";
    private static int tiempoEquipo = 0;


    public Atleta(String name_atlet, double time) {
        id = contador++; // no se usa this. en variables estáticas o cuando no hay confusión con los nombres.
        this.name_atlet = name_atlet;
        this.time = time;
    }

    public int getId() { return id; }
    public String getNameAtlet() { return name_atlet; }
    public double getTime() { return time; }

    public void setNameAtlet(String name_atlet) { this.name_atlet = name_atlet; }
    public void setTime(double time) { this.time = time; }

    public double correrMetros400(){
        double tiempoEquipo = 0;
        tiempoEquipo += time;
        return tiempoEquipo;
    }

    public static void nombreSeleccion(){
        System.out.println("Nombre de la seleccion " + seleccion);
    }

    public static void tiempoTotal(){
        System.out.println("Tiempo total " + tiempoEquipo);
    }

}
