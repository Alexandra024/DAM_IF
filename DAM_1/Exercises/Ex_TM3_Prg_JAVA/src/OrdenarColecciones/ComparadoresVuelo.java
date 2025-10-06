package Ex_TM3_Prg_JAVA.src.OrdenarColecciones;

import java.util.Comparator;

public class ComparadoresVuelo {
    public static final Comparator<Vuelo> porNumero =
            Comparator.comparing(Vuelo::getNumero);

    public static final Comparator<Vuelo> porOrigen =
            Comparator.comparing(Vuelo::getOrigen);

    public static final Comparator<Vuelo> porDestino =
            Comparator.comparing(Vuelo::getDestino);

    public static final Comparator<Vuelo> porSalida =
            Comparator.comparing(Vuelo::getSalida);

    public static final Comparator<Vuelo> porDuracion =
            Comparator.comparingInt(Vuelo::getDuracion);
}

