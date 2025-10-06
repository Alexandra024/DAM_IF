package OOP_ejercicios.ejercicios_segundaEV_1entrega;
import java.util.Scanner;

import java.util.Arrays; 
// aqui podemos utilizar el modo toString para imprimir arrays el sout no funciona
public class VisualizacionMetodos_classArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------- FILL ------------");
        int[] tamañoArray = new int[5];
        Propia_classArrays.fill(tamañoArray,42);
        
        System.out.println(Arrays.toString(tamañoArray)); // impresion valida
        
        System.out.println("---------- SORT ------------");
        int[] array_sort = {5, 2, 9, 1, 5, 6};
        // Imprimir array antes de ordenar
        System.out.println("Antes de ordenar: " + Arrays.toString(array_sort));
        
        // Llamar al método sort
        Propia_classArrays.sort(array_sort);
        
        // Imprimir array después de ordenar
        System.out.println("Después de ordenar: " + Arrays.toString(array_sort));
        
        System.out.println("--------- BINARY SEARCH -------------");
        int[] array_search = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int result = Propia_classArrays.binarySearch(array_search, key);
        if (result >= 0) {
            System.out.println("Elemento encontrado en el índice: " + result);
        } else {
            System.out.println("Elemento no encontrado");
        }
        
        System.out.println("---------- TO STRING ------------");
        System.out.println(Arrays.toString(array_search));
     
        System.out.println("---------- COPY OF ------------");
        int[] array_copy = Propia_classArrays.copyOf(array_search, array_search.length);
        System.out.println(Arrays.toString(array_copy));

        System.out.println("---------- COPY OF RANGE ------------");
        int[] array_copy_range = Propia_classArrays.copyOfRange(array_search, 2, 5);
        System.out.println(Arrays.toString(array_copy_range));

        System.out.println("-------- EQUALS --------------");
        boolean areEqual = Propia_classArrays.equals(array_search, array_copy);
        System.out.println("Los arrays son iguales: " + areEqual);

	}

}


