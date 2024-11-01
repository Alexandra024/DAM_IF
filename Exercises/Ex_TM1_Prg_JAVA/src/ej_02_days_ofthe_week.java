
import java.util.Scanner;

public class Ej_02_days_ofthe_week {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		

        System.out.println("Input a number from 1 to 7 (days of the week): ");
		int input = Integer.valueOf(sc.nextLine());

		if (input == 1){
			System.out.println("Monday");
		}else if (input == 2){
			System.out.println("Tuesday");
		}else if (input == 3){
			System.out.println("Wednesday");
		}else if (input == 4){
			System.out.println("Thursday");
		}else if (input == 5){
			System.out.println("Friday");
		}else if (input == 6){
			System.out.println("Saturday");
		}else if (input == 7){
			System.out.println("Sunday");
		}
		
		sc.close();	
	}

}