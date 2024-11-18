import java.util.Scanner;

public class Tempo { 

    public static void bisiesto(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Introduce un año, valoraré si es o no bisisesto ");
        
        int usNum = Integer.valueOf(sc.nextLine());
        
        if (usNum % 4 == 0 && (usNum % 400 == 0 || usNum % 100 != 0)) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
        sc.close();
    }

    // Método para obtener los días máximos en un mes (sin considerar años bisiestos)
    public static int diasEnMes(int MM) {
        switch (MM) {
            case 2: // Febrero
                return 28; // O 29 si es año bisiesto
            case 4: case 6: case 9: case 11: // Abril, Junio, Septiembre, Noviembre
                return 30;
            default: // Todos los demás meses
                return 31;
        }
    }

    public static String fecha_correcta(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la fecha: DD/MM/AAAA");
        Integer DD = Integer.valueOf(sc.nextLine());
        Integer MM = Integer.valueOf(sc.nextLine());
        Integer AAAA = Integer.valueOf(sc.nextLine());
        
        // Integer fechaIntroducida=  System.out.println("esta  es la fecha escrita" + DD + "/" + MM + "/" + AAAA);
 
        
        if (MM < 1 || MM > 12) {
            System.out.println("Mes no válido. Por favor, introduce un valor entre 1 y 12.");
        }

        if (DD >= 1 && DD <= diasEnMes(MM)) {
            DDValido = true;
        } else {
            System.out.println("Día no válido. Por favor, introduce un valor entre 1 y " + diasEnMes(MM) + ".");
        }
        
        System.out.println("Fecha válida: " + DD + "/" + MM);

        sc.close();

    }
}