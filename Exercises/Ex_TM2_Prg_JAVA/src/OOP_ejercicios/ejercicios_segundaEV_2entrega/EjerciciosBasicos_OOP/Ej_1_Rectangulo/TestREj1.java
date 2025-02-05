package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_1_Rectangulo;

import java.util.Scanner;

public class TestREj1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //  Pedimos al usuario los valores del rectángulo
        // System.out.print("Introduce la base del rectángulo: ");
        // double base = Double.valueOf(sc.nextLine());

        // System.out.print("Introduce la altura del rectángulo: ");
        // double altura = Double.valueOf(sc.nextLine());
        
        Rectangulo rectangulo1 = new Rectangulo(20, 40);
        Rectangulo rectangulo2 = rectangulo1;
        // Rectangulo rectangulo2 = new Rectangulo(60, 0);
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        
    }
}
