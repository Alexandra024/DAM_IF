package OOP_ejercicios.ejercicios_segunda_1entrega;
import java.util.Scanner;

public class Arrays_bySara{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regulador = "-?\\d+"; // Permite números negativos o positivos

        // Pedir al usuario el número a verificar
        System.out.print("Ingresa un número para verificar si es capicúa: ");
        String numeroStr = String.valueOf(sc.nextLine());

        //Convertir el String en int 
        if (numeroStr.matches(regulador)){ 
            // "matches" sirve para verificar si toda la cadena es un número válido con o sin signo.
            int numVerificado = Integer.valueOf(numeroStr);
        }else {
            // Mensaje de error si no coinciden con ser int
            System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
        }
        
        // Todo capicúa con un número par de cifras es divisible por 11.




        // array invertido [000 00] para albergar 
        int[] arrInvert = new int[arr1.length]; 

        for (int i = 0; i < arrInvert.length; i++){
            for (int j = 0; j < arrInvert.length; j++){
                if (arr1[] == arrInvert[]){
                    System.out.println("El número" + arrInvert + "es capicua");
                }
                else{
                    System.out.println("No es capicua.");
                }
            }
            
        }
    }

}