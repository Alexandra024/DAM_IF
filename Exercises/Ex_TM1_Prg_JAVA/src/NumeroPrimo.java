import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para comprobar si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        scanner.close();
    }

    // Comprobar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(num); i++) { // Solo revisa hasta la raíz cuadrada del número
            if (num % i == 0) {
                return false; // Si es divisible por `i`, no es primo
            }
        }

        return true; // Si no se encuentra divisor, es primo
    }
}
