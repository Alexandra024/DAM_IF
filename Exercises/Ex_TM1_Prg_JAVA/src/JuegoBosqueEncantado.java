import java.util.Scanner;

public class JuegoBosqueEncantado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Introducción del juego
        System.out.println("El juego trata de ir hacia la izquierda o a la derecha. \n" +
                "HISTORIA: Estás en una bifurcación del camino en un bosque encantado y debes elegir ir a la izquierda o a la derecha.\n" +
                "A la izquierda, hay una casa misteriosa. A la derecha, hay un río con un puente colgante.\n");

        // Preguntar el nombre del jugador
        System.out.print("Hola, estás a punto de entrar en una de las mejores experiencias de tu vida. Dime tu nombre para poder referirme a ti el resto del juego: ");
        String nombreJugador = sc.nextLine();
        System.out.println("Hola " + nombreJugador + "!");

        // Primera elección del jugador
        System.out.print("Estás en una bifurcación del camino en un bosque encantado y debes elegir ir a la izquierda o a la derecha: ");
        String eleccion1 = sc.nextLine().toLowerCase();

        // Mensajes default
        String izq = "Tu elección ha sido la izquierda, ¿estás seguro de que quieres continuar por aquí? (si/no) ";
        String dcha = "Tu elección ha sido la derecha, ¿estás seguro de que quieres continuar por aquí? (si/no) ";
        String terminaJuego = "Tu elección no ha sido ni izquierda ni derecha, no puedes continuar :)";
        String preguntaCasa = "¿Qué quieres hacer ahora? (entrar/explorar) ";
        String preguntaPuente = "¿Vas a cruzar el puente o quieres explorar? (cruzar/explorar) ";

        // Lógica de elección
        if (eleccion1.equals("izquierda")) {
            System.out.print(izq);
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Perfecto! Podemos continuar...");
                System.out.println("Oh! Te has encontrado con una casa de estilo gótico del Siglo XIX.");
                System.out.print(preguntaCasa);
                String respuesta2 = sc.nextLine().toLowerCase();
                if (respuesta2.equals("entrar")) {
                    System.out.println("Oh! Has encontrado un tesoro. ¡Has ganado!");
                } else if (respuesta2.equals("explorar")) {
                    System.out.println("Te pierdes en el bosque, te encuentras con unos lobos y te terminas muriendo por desangrado. Has perdido.");
                } else {
                    System.out.println(terminaJuego);
                }
            } else {
                System.out.println(terminaJuego);
            }
        } else if (eleccion1.equals("derecha")) {
            System.out.println("Has llegado a un puente.");
            System.out.println("Perfecto! Podemos continuar...");
            System.out.print(preguntaPuente);
            String respuesta2 = sc.nextLine().toLowerCase();
            if (respuesta2.equals("cruzar")) {
                System.out.println("Mientras estás mirando el paisaje, una tabla del puente se rompe porque el puente estaba mal construido. Te has caído al río, donde te golpeas la cabeza con una roca y mueres. Ha terminado el juego.");
            } else if (respuesta2.equals("explorar")) {
                System.out.println("Has encontrado un bote y navegas por el mar. Encuentras tierras prósperas con indígenas amables que te hospedan y te alimentan por el resto de tu vida. ¡Has ganado!");
            } else {
                System.out.println(terminaJuego);
            }
        } else {
            System.out.println(terminaJuego);
        }

        sc.close();
    }
}
