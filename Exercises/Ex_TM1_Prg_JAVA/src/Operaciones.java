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


    // raiz y factorial



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
    

