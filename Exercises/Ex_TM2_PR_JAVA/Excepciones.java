// Estamos aprendiendo las excepciones NO MARCADAS (dirigidas por consola)
// si sale un error como este se debe corregir el programa no hacer esto

    // - IndexOutOfBoundsException --> cuando intentas acceder al indice inexistente
    // - NullPointerException --> cuando intentas usar un objeto que es null (porque no lo has creado, al llamarlo)
    // - ArithmeticException -->  operación matemática inválida, (dividir un número entre 0)
    // - ClassCastException --> cuando intentas forzar una conversión de un objeto a un tipo incompatible

public class Excepciones {
    public static void main(String[] args) {
        
        int[] numeros = {10, 20, 30}; // crea lista de arrays

        try {
            System.out.println("Intentando acceder al índice 4...");
            int  n = numeros[4]; // índice inexistente

        } catch(IndexOutOfBoundsException e){
            System.out.println("ejecuta al capturar excepcion; mensaje al usurario obligatorio");

        } finally {
            System.out.println("ejecuta final");
        }

    }
}
