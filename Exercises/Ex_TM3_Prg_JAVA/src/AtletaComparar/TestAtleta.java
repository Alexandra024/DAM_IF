package Ex_TM3_Prg_JAVA.src.AtletaComparar;

import java.util.Arrays;
import java.util.Comparator;

public class TestAtleta {
    // Ordenar tanto array list como array primitivo
    public static void main(String[] args) {
        AtletaComparable[] atletas = new AtletaComparable[4];
        // Ejemplo 
        // AtletaComparable AtletaComparable1 = new AtletaComparable("Ana", 10);
        // si no pones el índice de donde está, solo contendrá null references 
        // en memoria, no puedes acceder a sus datos

        atletas[0] = new AtletaComparable("Carlos", 12, 32);
        atletas[1] = new AtletaComparable("Ana", 10, 55);
        atletas[2] = new AtletaComparable("Luis", 15, 12);
        atletas[3] = new AtletaComparable("Sofía", 11, 23);

        System.out.println("Lista ordenada");
        for(AtletaComparable var_atleta : atletas){
            System.out.println(var_atleta);
        }

        // Instancia 
        Comparator<AtletaComparable> comparaEdades = new ComparatorEdades();

        // Ordenar el array
        Arrays.sort(atletas, comparaEdades);
        
        System.out.println("Lista desordenada");
        for(AtletaComparable var_atleta : atletas){
            System.out.println(var_atleta);
        }

        // System.out.println(toString);
    }
    
}
