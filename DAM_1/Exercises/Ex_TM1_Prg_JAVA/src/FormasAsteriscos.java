
public class FormasAsteriscos {

    public static void main(String[] args) {
        // Llama a los métodos para dibujar las formas
        triangulo(); // llama a triángulo
        triangulo_invertido(); // llama a triángulo invertido (EXTRA)
        rectangulo(); // llama a rectángulo
        cuadrado(); // llama a cuadrado
    }

    public static void triangulo() {
        int filas_t= 5;
        for (int i=1; i<=filas_t; i++){ //filas que imprimir 
            //*(si no pones q tipo de argumento es(int) no funcionará)
            for (int j=1; j<=i; j++){ // imprime los asteriscos
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public static void triangulo_invertido() { // EXTRA
        int filas_ti= 5;
        for (int i=0; i<=filas_ti; i++){ //filas que imprimir 

            for (int j=0; j<=filas_ti-i; j++){ // imprime los asteriscos
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
    
    public static void rectangulo() {
        int filas= 5;
        for (int i=1; i<=filas; i++){ //filas que imprimir 
            
            for (int j=1; j<=filas*2; j++){ // imprime los asteriscos
                // si pones *2 te sale 
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
    

    public static void cuadrado() {
        int filas_c = 5;
        for (int i=1; i<=filas_c; i++){ //filas que imprimir 
            
            for (int j=1; j<=filas_c; j++){ // imprime los asteriscos
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------"); 
    }
}
