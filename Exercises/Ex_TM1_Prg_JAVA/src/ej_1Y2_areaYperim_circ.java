import java.util.Scanner;

public class ej_1Y2_areaYperim_circ {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// pi  * r2
        System.out.println("Introduce the radium of the circle");
		int radius = Integer.valueOf(sc.nextLine());

		double pi = Math.PI ; 	
				
		double res_area = pi * Math.pow(radius,2); // Math.pow es para elevar al cuadrado 2 --- area
		double res_perim = (pi * radius * 2) ; // --- perimetro


		System.out.println("The area of the circunfernce is = " + res_area );
		System.out.println("The area of the circunfernce is = " + res_perim );


		sc.close();
	}

}

