import java.util.Scanner;
    
public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = Integer.valueOf(sc.nextLine());

        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.valueOf(sc.nextLine());

        if (esAmigo(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
        sc.close();
    }

    // Método para calcular la suma de divisores propios
    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // Método para comprobar si dos números son amigos
    public static boolean esAmigo(int num1, int num2) {
        return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1;
    }
}

