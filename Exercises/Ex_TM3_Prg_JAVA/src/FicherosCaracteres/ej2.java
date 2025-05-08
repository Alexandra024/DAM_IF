package Ex_TM3_Prg_JAVA.src.FicherosCaracteres;

// Ejercicio 2:  Escribe un fichero de caracteres desde tu programa java, linea a linea.
    
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        // Nombre del archivo de salida
        String nombreArchivo = "vuelos.txt";

        // Líneas que queremos escribir en el archivo
        String[] lineas = {
            "Vuelo AB123 - Madrid a París - 10:15 - 120 min",
            "Vuelo CD456 - Barcelona a Londres - 08:30 - 150 min",
            "Vuelo EF789 - Valencia a Roma - 14:45 - 135 min"
        };

        // Escritura en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine(); // Añade un salto de línea
            }
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
