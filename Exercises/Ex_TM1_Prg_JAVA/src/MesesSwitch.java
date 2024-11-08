import java.util.Scanner;

public class MesesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número (del 1 al 12) para obtener el mes correspondiente: ");
        int numeroMes = Integer.valueOf(sc.nextLine());

        String nombreMes;

        switch (numeroMes) {
            
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número inválido.";
                break;

        }
        System.out.println("Mes:" + nombreMes);
        sc.close();
    }
}

// tirar un dado mil veces,hacer pocentajes de resultados (rirarlo de manera random) en un array primitivo, 0 inutilizamos
// guardamos las tiradas en las posiciones del array, a medida q sale cada numero añadir cuantas vece sale el caso de q haya salido 1 y su porcentaje despues

/*el 1 se hace en un diagrama de flujo en clase en papel */

/*-->desplazamiento circular del array, desplaza los elementos del array va destruyendo uno a otro para tomarel lugar 
--> sobre un array de elementos enteros inicializado con (contabilidad del contenido) 20 num inicializamos, cuales son  0, 1 ,2,3 (si espositivo y negativo)
-->ahorcado (array es char) (10 opciones)  el muñeco hay q hacerlo en metodos
*/