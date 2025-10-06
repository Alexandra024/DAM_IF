//import java.util.Scanner;

public class Operaciones {

    final double pi = 3.14159265358979323846264338327950288419716939937510582097494459231;

    public static double suma(double n1,double n2) {  //sumar dos numeros
        return n1 + n2;
    }
    public static double resta(double n1,double n2) { //restar dos numeros
        return n1 - n2;
    }
    public static double dividir(double n1,double n2) { //dividir dos numeros
        return n1 / n2;
    }
    public static double multiplicar(double n1,double n2) { //multiplicar dos numeros
        return n1 * n2;
    }

    public static int absoluto(int n) { //absoluto 

        if (n == 0){
            System.out.println(0);
            return 0;
        }else if (n < 0){
            int r = -n;
            System.out.println(r);
            return r;
        }else {
            System.out.println(n);
            return n;
        }
    }

    public static double max(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        }

        double maximo = numeros[0]; // tomamos el primer valor del array [0] y lo asignamos en la variable maximo
        for (double num : numeros) { // bucle q recorre cada elemento num toma el valor del  
                                        //              siguiente elemento de numeros sin utilizar índices
            if (num > maximo) { //compara si num es mayor que el almacenado como maximo
                maximo = num; //si es verdadero, se actualiza y se le asigna el valor de num a maximo
            } // maximo contendrá el valor mas grande al final del arreglo
        }
        return maximo;
    }

    public static double min(double[] numeros) {
        if (numeros == null || numeros.length == 0) { //si el array no ha sido inicializado o esta vacio
            throw new IllegalArgumentException("El arreglo no puede estar vacío."); // lanzar mensaje de error determinado
        }

        double minimo = numeros[0]; //
        for (double num : numeros) { //
            if (num < minimo) { //si el numero es menor que el minimo
                minimo = num; // intercambian valor para q el minimo se llame así
            }
        }
        return minimo;
    }
 
    public static double raiz(double numero) {
        double x = numero; 
        double raiz; // declara la variable para almacenar una aproximación de la raíz en cada iteración
        while (true) {
            raiz = 0.5 * (x + (numero / x)); // aplicamos el método de Herón para una aproximación de la raíz
            if (Math.abs(x - raiz) < 0.0001) break; // compara con la librería para saber si es correcto el resutado
            x = raiz; // si no se alcanza la precisión adecuada vuelve a hacer otra estimación desde el principio para mas precisión
        }
        return raiz; // devuelve el valor de la raíz
    }

    public static int factorial(int n) {
        int res = 1; //almacenar resultado
        for (int i = 1; i <= n; i++) { //pasa por todos los numeros hasta llegar al numero n
            res *= i; // va multiplicandose por todos los numeros anteriores(menores de n) dentro del bucle
        }
        return res; // devuelve elresultado de esas multiplicaciones 
    }

    public static int potencia(int n,int elevado_a) { //potencia dos numeros (base,exponente)

        int res = 1; // cada numero elevado a 0 da 1

        for (int i= 0 ; i < elevado_a; i++){ // nunca poner i== elevado_a pq eso nunca se cumple (0 == (el n de veces))
            res *= n; // multiplica el resultado otra vez por la base
        }
 
        return res;
    }
    /* ---------------------> VISUALIZACION DE QUE FUNCIONA LA POTENCIA
    public static void  main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);
        
        int n= Integer.valueOf(sc.nextLine());
        int elevado_a= Integer.valueOf(sc.nextLine());
        
        int res = potencia(n, elevado_a);
        System.out.println("El resultado es" + res);
        
        sc.close();
    }
     */
}
    

