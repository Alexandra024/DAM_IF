import java.util.Scanner;

public class Tempo { 

    public static void bisiesto(String[] args) {
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

    public static String fecha_correcta(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la fecha: DD/MM/AAAA");
        String dd = String.valueOf(sc.nextLine());
        String mm = String.valueOf(sc.nextLine());
        String aaaa = String.valueOf(sc.nextLine());
        
        String fechaIntroducida=  System.out.println("esta  es la fecha escrita" + dd + "/" + mm + "/" + aaaa);
 
        if  {
        }


        sc.close();



    }
}