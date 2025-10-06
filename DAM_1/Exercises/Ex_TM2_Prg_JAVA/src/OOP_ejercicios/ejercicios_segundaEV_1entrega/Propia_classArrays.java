package OOP_ejercicios.ejercicios_segundaEV_1entrega;
import java.util.Scanner;

public class Propia_classArrays{

    // RESTO ....

        // deepEquals(array1, array2): Compara si dos arrays multidimensionales son iguales.
        // deepToString(array): Convierte un array multidimensional en una representación de cadena.
        // hashCode(array): Genera un código hash basado en el contenido del array.
        // asList(T... a): Convierte un array en una lista (tipo List).
        // parallelSort(array): Ordena el array en paralelo para mejorar el rendimiento en arrays grandes.
        // stream(array): Convierte el array en un Stream para operaciones funcionales.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay muchos metodos :( , estos son algunos ");
    }
    

    // fill(array, value): Llena todo el array con un valor específico.
    public static void fill(int[] arrayFill , int value){
        for (int i=0 ; i < arrayFill.length; i++){
            arrayFill[i] = value;    
        }
    }

    // sort(array): Ordena los elementos del array en orden ascendente.
    public static void sort(int[] arraySort) { //BUBBLE SORT
        int longitud = arraySort.length;
        for( int i=0; i < longitud - 1 ; i++){ // recorre el array
            for(int j=0; j < longitud - i - 1; j++){ // recorre el array una posicion menos que i 
                if (arraySort[j] > arraySort[j + 1]) { //compara el elemento actual con el siguiente [1] > [2] 
                    int temp = arraySort[j]; // variable temporal
                    arraySort[j] = arraySort[j + 1];
                    arraySort[j + 1] = temp;
                }

            }
        }
    }

    // binarySearch(array, key): Realiza una búsqueda binaria en un array previamente ordenado.

    public static long binarySearch(long[] arrayBnrySrch, long clave ) {
        
        // se parte a la mitad y va localizando por mitades
        if {

        }else{
            System.out.println("..el elemento no se encuentra en el array..");
        }
    }

    // toString(array): Convierte el array en una representación de cadena.
    // copyOf(array, newLength): Crea una copia del array original con una nueva longitud.
    // copyOfRange(array, from, to): Copia un rango específico del array en uno nuevo.
    // equals(array1, array2): Compara si dos arrays son iguales en contenido.

}