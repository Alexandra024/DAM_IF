package OOP_ejercicios.ejercicios_segundaEV_2entrega.Ej_8_Tarjeta;

import java.util.Scanner;

public class TestTarjeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear una tarjeta con datos iniciales
        Tarjeta TarjetaSara = new Tarjeta(343583023, 2320, 321257, 1000);

        System.out.print("Introduce tu número secreto: ");
        int pinIngresado = Integer.parseInt(sc.nextLine());

        if (!TarjetaSara.comprobarPin(pinIngresado)) {
            System.out.println("Error: Número secreto incorrecto.");
        } else {
            System.out.println("Número secreto correcto.");
            System.out.println("Saldo actual: " + TarjetaSara.getSaldo() + " €");

            // Imprimir número de cuenta correctamente
            System.out.println("Número de cuenta: " + TarjetaSara.getNumeroCuenta());

            // Intentar sacar dinero
            System.out.print("¿Cuánto deseas retirar? ");
            double cantidad = Double.valueOf(sc.nextLine());
            System.out.println(TarjetaSara.sacarDinero(cantidad));

            // Intentar ingresar dinero
            System.out.print("¿Cuánto deseas ingresar? ");
            double ingreso = Double.valueOf(sc.nextLine());
            System.out.println(TarjetaSara.ingresarDinero(ingreso));

            // Mostrar saldo final
            System.out.println("Saldo final: " + TarjetaSara.getSaldo() + " €");
        }

        sc.close();
    }
}