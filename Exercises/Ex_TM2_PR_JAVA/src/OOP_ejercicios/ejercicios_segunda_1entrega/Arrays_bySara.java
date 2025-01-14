package OOP_ejercicios.ejercicios_segunda_1entrega;
import java.util.Scanner;

public class Arrays_bySara{

    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el número a verificar
        System.out.print("Ingresa un número para verificar si es capicúa: ");
        Integer numeroStr = Integer.valueOf(sc.nextLine());

        //Convertir el String en int 
        if (numeroStr > 0){ 
            System.out.println(numeroStr + "...");
        }else {
            int numObligPos = numeroStr * -1 ;
            System.out.println("Solo pueden ser números positivos.. Vamos a hacer la comprobación con el ingresado siendo este entero.." 
                                + numObligPos + "...");
        }
        
        int nOriginal = numeroStr; 
        int nReverso = 0;     

        // Comprobamos si el número tiene más de un dígito
        if (numeroStr < 0) {
            return false; // Si es negativo no puede ser capicúa
        }

        while (numeroStr > 0) {
            int digito = numeroStr % 10;    // Extraemos el último dígito
            nReverso = nReverso * 10 + digito; // Agregamos el dígito al reverso
            numeroStr /= 10;  // Eliminamos el último dígito del número
        }

        // Comparamos el número original con el reverso
        return nOriginal == nReverso;
    
        
    }

}