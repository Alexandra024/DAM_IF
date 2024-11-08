import java.util.Scanner;

public class Bisiesto { //hace falta mejoras ?? poner dia y mes?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Introduce una fecha ");
        
        int usNum = Integer.valueOf(sc.nextLine());
        
        if (usNum % 4 == 0 && (usNum % 400 == 0 || usNum % 100 != 0)) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
        sc.close();
    }
}