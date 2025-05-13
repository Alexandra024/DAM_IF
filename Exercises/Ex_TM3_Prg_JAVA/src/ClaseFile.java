package Ex_TM3_Prg_JAVA.src;

import java.io.*; // java.io.File especificamente
public class ClaseFile {
    
    public static void main(String[] args) {
        // Crear un objeto File
        File file = new File("ejemlo.txt");

        // Verificar si el archivo existe
        if (file.exists()) {
            System.out.println("El archivo existe.");
            System.out.println("Nombre del archivo: " + file.getName());
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            System.out.println("Escribible: " + file.canWrite());
            System.out.println("Legible: " + file.canRead());
            System.out.println("Tamaño del archivo en bytes: " + file.length());
        } else {
            System.out.println("El archivo no existe.");
            try {
                // Crear el archivo si no existe
                if (file.createNewFile()) {
                    System.out.println("Archivo creado: " + file.getName());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error.");
                e.printStackTrace();
            }
        }
    }

}
