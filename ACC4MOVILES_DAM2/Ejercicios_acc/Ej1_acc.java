package ACC4MOVILES_DAM2.Ejercicios_acc;

import java.io.File;

public class Ej1_acc {
    public static void main(String[] args) {
        // inicializa la variable ruta con un punto . que representa el directorio actual

        String ruta= ".";
        if(args.length >= 1) ruta = args[0]; //pedimos el primer argumento(ruta)
        // crea el obj File + una instancia de File
        File fich = new File(ruta);

        if (fich.exists()) { // verificacion de la
            // esistencia del fichero o directorio
            System.out.println("No existe el fichero o Directorio");
        } else {
            if (fich.isFile()){
                System.out.println("Es un fichero." + ruta);
                //creamos un array con los objetos File
                File[] ficheros = fich.listFiles(); // Ojo, ficheros o directorios
                // Recorremos el array y annadimos un prefijo para 
                // mostrar si el objeto es un fichero o dorectorio
                for (File f: ficheros){
                    String textoDescr = f.isDirectory() ? "/" : f.isFile() ? "-" : "?";
                    System.out.println("(" + textoDescr + ")" + f.getName());
                }
            }

        }
    }
}
