package Ex_TM3_Prg_JAVA.src.Circuitos;

public class Test {
    public static void main(String[] args) {
        Circuito serie1 = new CircuitoSerie(34);
        serie1.annadirResistencias(200);
        serie1.annadirResistencias(400);
        serie1.annadirResistencias(500);

        Circuito serie2 = new CircuitoSerie(45);
        serie2.annadirResistencias(50);
        serie2.annadirResistencias(700);

        Circuito paralelo1 = new CircuitoParalelo(100);
        paralelo1.annadirResistencias(100);

        PlacaCircuitos placa = new PlacaCircuitos();
        placa.addCircuito(paralelo1);
        placa.addCircuito(serie1);
        placa.addCircuito(serie2);

        System.out.println(placa.intensidadTotal());
    }
}
