package Ex_TM3_Prg_JAVA.src.FicherosCaracteres;

// Ejercicio 1:Lee un fichero de caracteres que previamente creaste con un notepad++  desde tu 
// codigo java. Llama al fichero miFichero.txt.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        String nombreArchivo = "miFichero.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
