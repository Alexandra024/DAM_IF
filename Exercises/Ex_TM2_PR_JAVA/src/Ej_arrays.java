import java.util.Scanner;

public class Ej_arrays {
    
    public static void iguales(String[] args) {
        // sumar dos arrays y el array suma ser del mismo tamaño
        int[] array = {1,2,4,3,2,1,4,3,5,2,6,7};

        int[] arr_a = {1,2,4,3};
        int[] arr_b = {1,2,4,3};

        // int[] suma = {arr_a + arr_b}; ESTO NO SE PUEDE HACER

        // asegurar el tamaño de cada array
        if (arr_a.length == arr_b.length){
            System.out.println("tamaño de los arrays: " + arr_a.length);
        }else{
            System.out.println("No son de la misma longitud");
        }

        // asegurar el tamaño de cada array

        int contador = 0; // contador de indices
        for (int len : num){
            contador++;
        }
        return contador;

        
    }

    public static void elementos_array(String[] args) {
        // Encuentra un elemento en un array y cuantas veces se repite. 
        // Nos devuelve las posiciones en las que está ese elemento.

        System.out.println(" ");

    }

    public static void duplica_valores_array(String[] args) {
        // Duplica todos los valores de un array
        System.out.println(" ");

    }

    public static void concatena_arrays(String[] args) {
        // Fusiona dos arrays en un tercero (todos los elementos de 
        // ambos arrays en el tercero)
        System.out.println(" ");

    }

    public static void capicua(String[] args) {
        // Confirma si un número es capicúa con un array.
        Scanner sc = new Scanner(System.in)

        String input = String.valueOf(sc.nextLine());
        System.out.println(" ");
        

    }

    public static void interseccion_coincidencias(String[] args) {

        // Interseccion. Dos arrays. En un tercer array se muestran todos los elementos que 
        // coinciden en los dos primeros.
        System.out.println(" ");


    }
}
