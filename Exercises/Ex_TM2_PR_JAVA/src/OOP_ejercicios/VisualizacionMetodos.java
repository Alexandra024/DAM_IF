package OOP_ejercicios;
import java.util.Scanner;

import java.util.Arrays; 
// aqui podemos utilizar el modo toString para imprimir arrays el sout no funciona

import OOP_ejercicios.ejercicios_segundaEV_1entrega.Propia_classArrays;
public class VisualizacionMetodos {
    
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






        
        System.out.println("---------- TO STRING ------------");
 
        System.out.println("---------- COPY OF ------------");

        System.out.println("---------- COPY OF RANGE ------------");

        System.out.println("-------- EQUALS --------------");

	}

}


