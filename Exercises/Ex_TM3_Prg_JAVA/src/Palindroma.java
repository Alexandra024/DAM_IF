package Ex_TM3_Prg_JAVA.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindroma {
    // Crea una clase que reciba una frase y sea capaz de evaluar si la frase el palíndroma o no es palíndroma. 
    // Utiliza un ArrayList<Character> para implementar el ejercicio.

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Character> letrasASCII = new ArrayList<>();

        //Annadir letras minusculas y mayusculas
        for (char c = 'A' ; c <= 'Z'; c++) {
            letrasASCII.add(c);
        }

        // codigo demás porque lo convierto todo a mayusculas
        // for (char c = 'a' ; c <= 'z'; c++) {
        //     letrasASCII.add(c);
        // }

        // FORMA CON INT
        // for (int i = 0; i <= 127; i++) {
        //     char c = (char) i;
        //     if (Character.isLetter(c)) {
        //         letrasASCII.add(c);
        //     }
        // }

        // PREUEBAS
        // System.out.println("Lista de letras ASCII: " + letrasASCII);
        // char primerCaracter = letrasASCII.get(0);
        // System.out.println("primer caracter:" + primerCaracter);

        // Ejercicio
        System.out.print("Coloca la palabra, te diré si es o no palíndroma: "); // pedir la palabra
        String palabra = String.valueOf(sc.nextLine()); // user input
        
        String palabraMay = palabra.toUpperCase(); // poner en mayusculas la palabra
        int longitudPMay = palabraMay.length(); // longitud de la palabra

        for (int i= 0, j= longitudPMay-1; i < longitudPMay; i++, j-- ){ // SIEMPRE PONER EL TIPO DE DATO AL PRINCIPIO
            
            char caracterDelante = palabraMay.charAt(i);
            char caracterDetras = palabraMay.charAt(j);

            if ( caracterDelante != caracterDetras ) {
                System.out.println( palabra + ", NO es palíndroma.");
                return; // Sale del método principal
            }
        }
        System.out.println( palabra + ", es palíndroma.");
        sc.close();
        
    }
}
