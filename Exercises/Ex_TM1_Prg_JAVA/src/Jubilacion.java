import java.util.Scanner;

public class Jubilacion {
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int Df, Mf, Af; // --- variables finales (Jubilado)
		int DD, MM, AAAA; // --- variables actuales (no Jubilado)
        
        System.out.print("Introduce tú fecha de nacimiento (DD/MM/AAAA):");
         Df = Integer.valueOf(sc.nextLine());
         Mf = Integer.valueOf(sc.nextLine());
         Af = Integer.valueOf(sc.nextLine());

		System.out.print("Introduce la fecha de hoy (DD/MM/AAAA):");
		 DD = Integer.valueOf(sc.nextLine());
		 MM = Integer.valueOf(sc.nextLine());
		 AAAA = Integer.valueOf(sc.nextLine());
		

		if (AAAA-Af >= 65) {
			System.out.println("Jubilado");
            
        } else if (AAAA-Af == 65) {
            // comprueba el mes y el dia para determinar en el año en el que se jubila si lo está o no
            if (MM > Mf || (MM == Mf && DD >= Df)) {
                System.out.println("Jubilado");
            } else {
                System.out.println("No Jubilado");
            }
        } else {
            System.out.println("No Jubilado");
        }
            
        sc.close();
    }
}
