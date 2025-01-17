package OOP_ejercicios.ejercicios_segundaEV_1entrega;
import java.util.Scanner;

public class Ej_arraysUnidimensionales {
    
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

    public static boolean capicua() { // deberia meterse dentro de () algun parámetro? como num ????
        Scanner sc = new Scanner(System.in);

        // Confirma si un número es capicúa con un array.
        // Pedir al usuario el número a verificar
        System.out.print("Ingresa un número para verificar si es capicúa: ");
        Integer numeroStr = Integer.valueOf(sc.nextLine());

        //Convertir el String en int 
        if (numeroStr > 0){ 
            System.out.println(numeroStr + "...");
        }else {
            int numObligPos = numeroStr * -1 ;
            System.out.println("Solo pueden ser números positivos.. Vamos a hacer la comprobación con el ingresado siendo este entero.." 
                                + numObligPos + "...");
        }

        int nOriginal = numeroStr; 
        int nReverso = 0;     

        // Comprobamos si el número tiene más de un dígito
        if (numeroStr < 0) {
            return false; // Si es negativo no puede ser capicúa
        }

        while (numeroStr > 0) {
            int digito = numeroStr % 10;    // Extraemos el último dígito
            nReverso = nReverso * 10 + digito; // Agregamos el dígito al reverso
            numeroStr /= 10;  // Eliminamos el último dígito del número
        }

        // Comparamos el número original con el reverso
        return nOriginal == nReverso;
                

    }

    public static void interseccion_coincidencias(String[] args) {

        System.out.println(" ");
        System.out.println("Arrays para insercion");
        
        int [] o = {5, 3, 2, 4, 75};
        int [] p = {1, 5, 3, 7, 75};
        int acumQ = o.length;
        int acumR = p.length;
        int totalS = acumQ + acumR;
        int [] t = new int [totalS]; // array de ambos arrays
        int [] z = new int[t.length]; // array de iguales
        
        for(int i = 0; i < o.length /2 ; i++) {
            t[i] = o[i];	
        }
        
        for (int i = 0; i < o.length; i++) {
            t[o.length + i] = p[i];
        }
        
        System.out.println("Impresion de conjunto a");
        for(int i : o) {
            System.out.println(i);
        }
        System.out.println("Impresion de conjunto b");
        for(int i : p) {
            System.out.println(i);
        }
        
           System.out.println("Contenido de ambos conjuntos");
        for (int i : t) {
            System.out.println(i);
        }
        
        System.out.println("------------------");
        // este es para agregar solo los iguales al nuevo arr z
        // Comprobar los elementos comunes de o y p e insertarlos en z
        
        int zIndex = 0; // Índice para z
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (o[i] == p[j]) { // Si el elemento de o es igual al de p
                    z[zIndex] = o[i];
                    zIndex++;
                    break; // una vez encontrado, no sigue buscando el elemento
                }
            }
        }
        
        
        // usamos bucle general para
        for (int i = 0; i < zIndex; i++) {
            System.out.println(z[i]);
        }
        
    }
}
