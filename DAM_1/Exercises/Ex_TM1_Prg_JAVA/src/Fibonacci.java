import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números de Fibonacci quieres calcular?: ");
        int n = Integer.valueOf(sc.nextLine());

        int a = 0, b = 1, siguiente;

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        sc.close();
    }
}
