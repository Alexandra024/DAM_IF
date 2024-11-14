import java.util.Scanner;
import java.util.Random; // importamos la clase Random para crear el num random

public class Juegos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // --- lee inputs usuario
        Random rand_int = new Random(); // --- instancia de la clase de numero random (+ variable)

        // (crear variable para que genere el numero)
        int numRandom = rand_int.nextInt(1, 11); // --- range (inclusivo,exclusivo +1 facilita errores)
        // System.out.println(numRandom); // print numero random *pruebas

        while (true) {
            System.out.println("Adivina en un rando del 1 al 10, pon 0 para salir del bucle");
            int numUsuario = Integer.valueOf(sc.nextLine());

            if (numUsuario == numRandom) {
                System.out.println("Ganaste!");
            } else if (numUsuario != numRandom){
                System.out.println("Prueba de nuevo");
                continue;
            }else if (numUsuario == 0) {
                break;
            }

            System.out.println("Partida terminada");
        }
        sc.close();// --- cerrar el scanner (sino no funciona el programa)
    }
}