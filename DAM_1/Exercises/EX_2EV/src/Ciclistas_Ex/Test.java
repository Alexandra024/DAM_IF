package Ciclistas_Ex;

public class Test {
    public static void main(String[] args) {
        // creacion de equipo
        Equipo equipo1 = new Equipo("Equipo1");

        // Ciclistas
        Velocista john = new Velocista("John", 25, 45, 22);
        Escalador mike = new Escalador("Mike", 22, 42, 12);
        Contrarrelojista jane = new Contrarrelojista("Jane", 38, 18);

        // Agregar ciclistas al array
        equipo1.addCiclista(john);
        equipo1.addCiclista(mike);
        equipo1.addCiclista(jane);
        
        // Mostrar Ciclistas
        System.out.println(equipo1.mostrarCiclistas());

        // obtener tiempos de todos los ciclistas del equipo
        System.out.println(equipo1.mostrarTiempoTotal());
    }
}
