import java.util.Scanner;
import java.util.Random;  // importamos la clase Random para crear el num random


public class Juegos1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // --- lee inputs
        Random numRandom = new Random(); // --- creacion de numero random
        System.out.println();

        
        // pedir un numero hasta q se encuentre el indicado++
        int numUsuario = Integer.valueOf(sc.nextLine());


        while (true){
            System.out.println("Adivina");
            
            if (input== 0){
                break;
            }

        }
        sc.close(); // --- cerrar el scanner (sino no funciona el programa)
    }

}