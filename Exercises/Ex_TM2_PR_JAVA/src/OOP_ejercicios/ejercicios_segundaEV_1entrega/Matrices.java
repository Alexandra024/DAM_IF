package OOP_ejercicios.ejercicios_segundaEV_1entrega;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir dimensiones de las matrix
        System.out.println("Define el numero de filas y de columnas de la Matriz A:");
        int filas = Integer.valueOf(sc.nextLine()); // 2
        int columnas = Integer.valueOf(sc.nextLine()); // 3

        // Crear matrices

        int[][] matrixA = new int[filas][columnas];
        int[][] matrixRes = new int[filas][columnas];

        // MATRIZ A

        // relleno de matrix (A)
        System.out.println("Introduce los elementos de la matriz A:");
        for (int i = 0; i < filas; i++) {
            System.out.print("{ ");
            for (int j = 0; j < columnas; j++) {
                matrixA[i][j] = j;
                System.out.print(matrixA[i][j] + " ");
                // matrixA[i][j] = Integer.valueOf(sc.nextLine()); // Pedir los elementos
            }

            System.out.println("}");
        }

        // Matriz B 2x3 con valores ya asignados:

        int[][] matrixB = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // suma matrices
        System.out.println("Suma de matrices");
        for (int i = 0; i < filas; i++) {
            System.out.print("{ ");
            for (int j = 0; j < columnas; j++) {
                matrixRes[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixRes[i][j] + " ");
            }

            System.out.println("}");
        }

        sc.close();
    }

    public static void productoMatrix(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz A (2x3)
        int[][] matrizA = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // Matriz B (3x2)
        int[][] matrizB = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        if (matrizA[0].length != matrizB.length) {
            System.out.println(
                    "No se pueden multiplicar las matrices: el número de columnas de A debe ser igual al número de filas de B.");
            sc.close();
            return;

        }

        // obliga a dar el resultado en las medidas correctas
        int[][] matrizResultado = new int[matrizA.length][matrizB[0].length];

        // Calcular el producto de las matrices
        for (int i = 0; i < matrizA.length; i++) { // Filas de A
            for (int j = 0; j < matrizB[0].length; j++) { // Columnas de B
                matrizResultado[i][j] = 0; // Inicializar
                for (int k = 0; k < matrizA[0].length; k++) { // Columnas de A / Filas de B
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimir la matriz resultado
        System.out.println("La matriz resultado es:");
        for (int i = 0; i < matrizResultado.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j]);
                if (j < matrizResultado[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }
        sc.close();
    }
}
