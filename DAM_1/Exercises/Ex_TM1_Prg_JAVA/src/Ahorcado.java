import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        // Palabra secreta a adivinar
        String palabraSecreta = "java";
        // Variable para almacenar las letras correctas que se adivinan
        StringBuilder palabraAdivinada = new StringBuilder("____"); 
        // Número de intentos disponibles
        int intentos = 6; 
        // Variable para comprobar si el jugador ha ganado
        boolean haGanado = false;

        Scanner scanner = new Scanner(System.in);

        // Mostrar mensaje de bienvenida
        System.out.println("Bienvenido al Ahorcado!");
        System.out.println("La palabra tiene " + palabraSecreta.length() + " letras.");
        
        // Juego principal
        while (intentos > 0 && !haGanado) {
            System.out.println("\nPalabra actual: " + palabraAdivinada);
            System.out.println("Tienes " + intentos + " intentos restantes.");
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().charAt(0);

            // Comprobar si la letra está en la palabra secreta
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && palabraAdivinada.charAt(i) == '_') {
                    palabraAdivinada.setCharAt(i, letra);
                    letraCorrecta = true;
                }
            }

            // Si la letra no es correcta, restamos un intento
            if (!letraCorrecta) {
                intentos--;
                System.out.println("La letra no está en la palabra.");
            }

            // Verificar si el jugador ha ganado
            if (palabraAdivinada.toString().equals(palabraSecreta)) {
                haGanado = true;
            }
        }

        // Finalizar el juego
        if (haGanado) {
            System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("\n¡Se te acabaron los intentos! La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
}
