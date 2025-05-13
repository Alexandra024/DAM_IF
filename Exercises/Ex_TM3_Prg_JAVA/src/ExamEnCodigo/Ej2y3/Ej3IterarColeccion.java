package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.Ej2y3;

// Escribe el código que utilizarías para recorrer una colección de tres formas distintas.
// For-each, for , iterator


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

// CON LIST

public class Ej3IterarColeccion {
    public static void main(String[] args) {
        // Crear una lista de ejemplo
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Sofía");

        System.out.println("Recorrido usando un bucle for:");
        for (int i = 0; i < nombres.size(); i++) { // Iteramos desde 0 hasta el tamaño de la lista
            System.out.println(nombres.get(i)); // Imprimimos el elemento en la posición actual
        }

        System.out.println("\nRecorrido usando un bucle for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre); // Imprimimos cada elemento de la lista
        }

        // System.out.println("\nRecorrido usando un Iterator:");
        // Iterator<String> iterador = nombres.iterator();
        // while (iterador.hasNext()) { // Mientras haya elementos en la colección
        //     String nombre = iterador.next(); // Obtenemos el siguiente elemento
        //     System.out.println(nombre); // Imprimimos el elemento actual
        // }

    }
}
// CON SET

// public class IterarHashSet {
//     public static void main(String[] args) {
//         Set<String> colores = new HashSet<>();
//         colores.add("Rojo");
//         colores.add("Verde");
//         colores.add("Azul");

//         System.out.println("Recorrido usando for-each:");
//         for (String color : colores) {
//             System.out.println(color);
//         }
//     }
// }
