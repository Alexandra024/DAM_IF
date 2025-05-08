package Ex_TM3_Prg_JAVA.src.OrdenarColecciones;

import java.util.*;

public class GestorVuelos {
    public static void main(String[] args) {
        LinkedList<Vuelo> vuelos = new LinkedList<>();
        vuelos.add(new Vuelo("AB123", "Madrid", "París", LocalTime.of(10, 15), 120));
        vuelos.add(new Vuelo("CD456", "Barcelona", "Londres", LocalTime.of(8, 30), 150));
        vuelos.add(new Vuelo("EF789", "Valencia", "Roma", LocalTime.of(14, 45), 135));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el criterio de ordenación:");
        System.out.println("1. Número de vuelo");
        System.out.println("2. Ciudad de origen");
        System.out.println("3. Ciudad de destino");
        System.out.println("4. Hora de salida");
        System.out.println("5. Duración del vuelo");
        int opcion = scanner.nextInt();

        Comparator<Vuelo> comparador;

        switch (opcion) {
            case 1: comparador = ComparadoresVuelo.porNumero; break;
            case 2: comparador = ComparadoresVuelo.porOrigen; break;
            case 3: comparador = ComparadoresVuelo.porDestino; break;
            case 4: comparador = ComparadoresVuelo.porSalida; break;
            case 5: comparador = ComparadoresVuelo.porDuracion; break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        Collections.sort(vuelos, comparador);

        System.out.println("Lista de vuelos ordenada:");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}

