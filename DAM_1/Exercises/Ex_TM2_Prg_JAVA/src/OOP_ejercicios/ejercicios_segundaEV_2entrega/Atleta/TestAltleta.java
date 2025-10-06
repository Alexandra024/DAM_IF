package OOP_ejercicios.ejercicios_segundaEV_2entrega.Atleta;

public class TestAltleta {
    public static void main(String[] args) {
        
        Atleta atleta1 = new Atleta("Alejandro Perlaza",9.55);
        atleta1.correrMetros400();
        Atleta atleta2 = new Atleta("Anthony Zambrano",9.28);
        atleta1.correrMetros400();
        Atleta atleta3 = new Atleta("Diego Palomeque",9.53);
        atleta1.correrMetros400();
        Atleta atleta4 = new Atleta("Gilmar Herrera",9.29);
        atleta1.correrMetros400();

        Atleta.nombreSeleccion();
        Atleta.tiempoTotal();
    }
}
