// import java.util.Arrays;
import java.util.Scanner;

public class OrdenNumAscDesc {
    
// leer los numeros, poner los tres primeros en orden ascendente  
		// leer numeros introducidos ordenarlos de manera ascendente
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres números: " );
        double n1_u = Double.valueOf(sc.nextLine());
        double n2_u = Double.valueOf(sc.nextLine());
        double n3_u = Double.valueOf(sc.nextLine());

        System.out.println("Tus tres números son:" + n1_u + "," + n2_u + "," + n3_u );

        //utilizando metodos --> .sort()
            //ASCENDENTE
        // double[] num_input = {n1_u, n2_u, n3_u};
        // Arrays.sort(num_input); // --- ordena de manera ascendente (menor a mayor)
        // System.out.println(Arrays.toString(num_input));

        // no utilizando metodos
            //DESCENDENTE

        if (n1_u > n2_u && n2_u > n3_u){
            System.out.println(n1_u + "," + n2_u + "," + n3_u);
        }else if (n2_u > n3_u && n3_u > n1_u){
            System.out.println(n2_u + "," + n3_u + "," + n1_u);
        }else if (n3_u > n1_u && n1_u > n2_u){
            System.out.println(n3_u + "," + n1_u + "," + n2_u);
        }else if (n3_u > n2_u && n2_u > n1_u){
            System.out.println(n3_u + "," + n2_u + "," + n1_u);
        }else if (n2_u > n1_u && n1_u > n3_u){
            System.out.println(n2_u + "," + n1_u + "," + n3_u);
        }else {
            System.out.println("no mas bucles porfavor");
        }

        // bubble sort algoritmo para descendentes
        // hay q hacer dos bucles , el externo te dice cuantas vueltas da (-1 de los q hay en el array ),
        // en el segundo bucle va iterando uno por uno
        
        sc.close();

    }

} 
