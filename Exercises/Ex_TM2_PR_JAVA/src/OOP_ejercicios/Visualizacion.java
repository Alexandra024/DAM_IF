package OOP_ejercicios;
import java.util.Scanner;

public class Visualizacion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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


