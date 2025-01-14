package OOP_ejercicios.ejercicios_segunda_1entrega;
import java.util.Scanner;

public class Ej_arrays {
    
    public static void iguales(String[] args) {
        // sumar dos arrays y el array suma ser del mismo tamaño

        int[] arr_a = {1,2,4,3};
        int[] arr_b = {1,2,4,3};

        // asegurar el tamaño de cada array
        if (arr_a.length == arr_b.length){
            System.out.println("tamaño de los arrays: " + arr_a.length);
            
            //Nuevo array para almacenar la suma
            int[] arr_sum = new int[arr_a.length]; // resultado = [0,0,0,0]

            // Sumar elementos de los arrays
            for (int i = 0; i < arr_a.length; i++) { 
                arr_sum[i] = arr_a[i] + arr_b[i]; 
            }

            // Imprimir el array suma
            System.out.print("Array suma: { ");
            for (int i = 0; i < arr_sum.length; i++) { 
                System.out.print(arr_sum[i]); // imprime cada valor
                if (i < arr_sum.length - 1) { // si no es el último elemento
                    System.out.print(", "); // imprime la coma
                }
            }
            System.out.println("}");            
        } else {
            System.out.println("No son de la misma longitud");
        }
        
    }
    // - [ ]  Fusionar dos arrays ordenados en un tercero.

    public static void elementos_array(String[] args) {
        
        // Encuentra un elemento en un array y cuantas veces se repite. 
        // Nos devuelve las posiciones en las que está ese elemento.
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("El elemento " + array[i] + " se repite en las posiciones " + i + " y " + j);
                }
            }
            
        }
    }

    public static void duplica_valores_array(String[] args) {
        
        // Duplica todos los valores de un array
         System.out.println(" ");
         System.out.println("Duplicar los valores de los elementos de un array");
         int[] array = {1, 2, 3, 4, 5};
         
         //multiplicar el array por 2
         int[] arrayDuplicado = new int[array.length]; // resultado = [0,0,0,0,0]
         for (int i = 0; i < array.length; i++) { // [1,2,3,4,5]
             arrayDuplicado[i] = array[i] * 2; // [2,4,6,8,10]
            }
 
         System.out.print("Array duplicado: { ");
         for (int i = 0; i < arrayDuplicado.length; i++) { // RESULTADO [2,4,6,8,10]
             System.out.print(arrayDuplicado[i]); 
             if (i < arrayDuplicado.length - 1) { // si no es el último elemento IMPRIME LA COMA
                 System.out.print(", ");
             }
         }
         System.out.println(" }");

    }

    public static void concatena_arrays(String[] args) {
        // Fusiona dos arrays en un tercero (todos los elementos  
        // de ambos arrays en el tercero)
        System.out.println(" ");

        //concatenar dos arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        // Nuevo array con la suma de los dos arrays
        int[] arr3 = new int[arr1.length + arr2.length];

        // Copiar los elementos de arr1 en arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copiar los elementos de arr2 en arr3
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        //imprimir el array arr3
        System.out.print("Array arr3: { ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void capicua(String[] args) {
        // Confirma si un número es capicúa con un array.

        String input = String.valueOf(sc.nextLine());
        System.out.println(" ");
        

    }

    public static void interseccion_coincidencias(String[] args) {
    
        // - [ ]  Intersección de dos arrays en un tercero.

        // Interseccion. Dos arrays. En un tercer array se muestran todos los elementos que 
        // coinciden en los dos primeros.
        System.out.println(" ");


    }
}
