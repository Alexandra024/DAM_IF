package Ejercicios;
import java.io.File;

public class ListadoDirectorio {

    public static void main(String[] args) {
        // inicializa la variable ruta con un punto (.), que representa el directorio actual
        String ruta = "";
        
        // comprueba si se ha pasado un argumento al ejecutar el programa.
        if (args.length >= 1) ruta = args[0];
        
        // Creación del objeto File. crea una instancia de la clase File
        File fich = new File(ruta);

        if (fich.exists()) { // Verificación de la existencia del fichero o directorio
            System.out.println("No existe el fichero o directorio: " + ruta + ".");
        } else {
            if (fich.isFile()) { // Comprobamos si es un fichero o directorio
                System.out.println(ruta + " es un fichero.");
            } else {
                System.out.println(ruta + " es un directorio. Contenidos: ");
                
                // Creamos un array con los objetos File
                File[] ficheros = fich.listFiles(); // ojo, ficheros o directorios
                
                // Recorremos el array y añadimos un prefijo para mostrar si el objeto es un fichero o directorio
                for (File f : ficheros) {
                    String textoDescr = f.isDirectory() ? "/" : f.isFile() ? "_" : ":";
                    System.out.println("("+ textoDescr +") " + f.getName());
                }
            }
        }
    }
}
