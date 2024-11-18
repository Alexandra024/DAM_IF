import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Denominaciones de billetes y monedas en euros
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        int[] monedas = {2, 1, 50, 20, 10, 5, 2, 1}; // Monedas (1€ y céntimos)

        System.out.print("Introduce la cantidad total de la compra (€): ");
        double totalCompra = scanner.nextDouble();

        System.out.print("Introduce el importe entregado (€): ");
        double importeEntregado = scanner.nextDouble();

        if (importeEntregado < totalCompra) {
            System.out.println("El importe entregado es insuficiente.");
            return;
        }

        double cambio = importeEntregado - totalCompra;
        System.out.printf("Cambio a devolver: %.2f€\n", cambio);

        // Convertir el cambio a céntimos para facilitar el cálculo
        int cambioCentimos = (int) Math.round(cambio * 100);

        // Descomponer en billetes
        System.out.println("Billetes:");
        for (int billete : billetes) {
            int cantidad = cambioCentimos / (billete * 100); // Billetes en céntimos
            if (cantidad > 0) {
                System.out.println(billete + "€: " + cantidad);
                cambioCentimos %= billete * 100; // Reducir el cambio restante
            }
        }

        // Descomponer en monedas
        System.out.println("Monedas:");
        for (int moneda : monedas) {
            int cantidad;
            if (moneda >= 1) { // Monedas en euros
                cantidad = cambioCentimos / (moneda * 100);
                if (cantidad > 0) {
                    System.out.println(moneda + "€: " + cantidad);
                    cambioCentimos %= moneda * 100;
                }
            } else { // Monedas en céntimos
                cantidad = cambioCentimos / moneda;
                if (cantidad > 0) {
                    System.out.println(moneda + " céntimos: " + cantidad);
                    cambioCentimos %= moneda;
                }
            }
        }

        scanner.close();
    }
}
