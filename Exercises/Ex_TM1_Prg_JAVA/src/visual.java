import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.Random;  // importamos la clase Random para crear el num random

public class visual {
    
// leer los numeros, poner los tres primeros en orden ascendente  
		//leer numeros introducidos ordenarlos de manera ascendente
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres números: " );
        double n1_u = Double.valueOf(sc.nextLine());
        double n2_u = Double.valueOf(sc.nextLine());
        double n3_u = Double.valueOf(sc.nextLine());

        System.out.println("Tus tres números son:" + n1_u + "," + n2_u + "," + n3_u );

        //utilizando metodos --> .sort()
            //ASCENDENTE
        double[] num_input = {n1_u, n2_u, n3_u};
        Arrays.sort(num_input); // --- ordena de manera ascendente (menor a mayor)
        System.out.println(Arrays.toString(num_input));

            //DESENDENTE



        // no utilizando metodos


        
        sc.close();


    }

}