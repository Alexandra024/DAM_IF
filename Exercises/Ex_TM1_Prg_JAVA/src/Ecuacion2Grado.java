import java.util.Scanner;

public class Ecuacion2Grado {
    
    public static void main(String[] args) {
		
		int a, b, c;
		int resP, resN;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Introduzca 3 números que serán las variable A, B y C de la ecuación de segundo grado:  ");
		a = Integer.valueOf(sc.nextLine());
		b = Integer.valueOf(sc.nextLine());	
		c = Integer.valueOf(sc.nextLine());
		resP = ((-b)+((b^2-4*a*c)^1/2))/(2*a);
		resN = ((-b)-((b^2-4*a*c)^1/2))/(2*a);
		System.out.println("El primer resultado de la ecuación es " + resP + " y el segundo es " + resN);
	
        sc.close();
    }

}
