package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

import java.util.ArrayList;
import java.util.List;

public class VerificarVehiculos {
    public static void main(String[] args) {
        // Crear una lista de vehículos desordenados
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil("Sedán"));
        vehiculos.add(new Lancha("Yate"));
        vehiculos.add(new VehiculoAnfibio("Hydra"));
        vehiculos.add(new Camion("Trailer"));
        vehiculos.add(new MotoAnfibia("Quadski"));
  

        // Contadores para cada tipo de vehículo
        int terrestresCount = 0;
        int acuaticosCount = 0;
        int anfibiosCount = 0;

        // Listas para almacenar cada tipo de vehículo
        List<Vehiculo> terrestres = new ArrayList<>();
        List<Vehiculo> acuaticos = new ArrayList<>();
        List<Vehiculo> anfibios = new ArrayList<>();

        // Recorrer la lista de vehículos y verificar su tipo
        for (Vehiculo vehiculo : vehiculos) {
            boolean esTerrestre = vehiculo instanceof Terrestre;
            boolean esAcuatico = vehiculo instanceof Acuatico;

            if (esTerrestre && esAcuatico) {
                anfibiosCount++;
                anfibios.add(vehiculo);
            } else if (esTerrestre) {
                terrestresCount++;
                terrestres.add(vehiculo);
            } else if (esAcuatico) {
                acuaticosCount++;
                acuaticos.add(vehiculo);
            }
        }

        // Mostrar los resultados
        System.out.println("--- Vehículos Terrestres (" + terrestresCount + ") ---");
        for (Vehiculo terrestre : terrestres) {
            terrestre.mostrarModelo();
            if (terrestre instanceof Terrestre) {
                ((Terrestre) terrestre).conducir();
            }
            System.out.println();
        }

        System.out.println("\n--- Vehículos Acuáticos (" + acuaticosCount + ") ---");
        for (Vehiculo acuatico : acuaticos) {
            acuatico.mostrarModelo();
            if (acuatico instanceof Acuatico) {
                ((Acuatico) acuatico).navegar();
            }
            System.out.println();
        }

        System.out.println("\n--- Vehículos Terrestres-Acuáticos (" + anfibiosCount + ") ---");
        for (Vehiculo anfibio : anfibios) {
            anfibio.mostrarModelo();
            if (anfibio instanceof Terrestre) {
                ((Terrestre) anfibio).conducir();
            }
            if (anfibio instanceof Acuatico) {
                ((Acuatico) anfibio).navegar();
            }
            System.out.println();
        }
    }
}