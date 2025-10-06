package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.io.*; respuesta rapida

// La clase File en Java proporciona una serie de métodos para interactuar 
// con archivos y directorios. Escribe un código en un Test, donde me uses 
// los métodos de File. Indica en un comentario que hace cada uno.

public class Ej7ClaseFile {
    public static void main(String[] args) {
        // Ruta del archivo para leerlo
        String ruta = "document.txt";

        try {
            // BufferedReader para leer el archivo línea por línea
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String textoArch;

            // Mientras haya líneas en el archivo, se imprimen en la consola
            while ((textoArch = br.readLine()) != null) {
                System.out.println(textoArch);
            }

            // Se cierra el BufferedReader cuando termine el bucle(=false)
            br.close();
        } catch (IOException e) {
            // Captura y muestra cualquier error que ocurra al leer el archivo
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}



class MiniFileTest {

    public static void main(String[] args) {

        String nombreArchivo = "miArchivoSimple.txt";
        File archivo = new File(nombreArchivo);

        try {
            // Crea un nuevo archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("Archivo ya existe: " + archivo.getName());
            }

            // Verifica si el objeto File representa un archivo
            System.out.println("Es un archivo? " + archivo.isFile());

            // Obtiene la ruta absoluta
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace(); // Imprime el error si algo sale mal al crear el archivo
        } finally {
            // Intenta eliminar el archivo al finalizar (limpieza)
            if (archivo.exists()) {
                if (archivo.delete()) {
                    System.out.println("Archivo eliminado: " + archivo.getName());
                } else {
                    System.out.println("No se pudo eliminar el archivo: " + archivo.getName());
                }
            }
        }
    }
}