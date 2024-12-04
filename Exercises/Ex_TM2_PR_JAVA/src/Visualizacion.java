import java.util.Scanner;

public class Visualizacion {
    public static boolean capicua(int[] num) {
        // Confirma si un número es capicúa con un array.
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero y te diré si es capicúa: ");


        for(int i = 0; i < 50; i++){
            for (int j = 0; j < 50; j--){
                if (num[i] !=num[i])
                return false;
            }
            return true;
        }

    }

    public static void main(System[]args){

        int numr = 434;



    }
}
