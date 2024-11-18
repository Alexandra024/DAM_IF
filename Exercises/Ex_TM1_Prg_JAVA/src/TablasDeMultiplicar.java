public class TablasDeMultiplicar {
    public static void main(String[] args) {
        // Bucle externo para las tablas del 1 al 10
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            
            // Bucle interno para los multiplicadores del 1 al 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            
            // Separador entre tablas
            System.out.println();
        }
    }
}
