public class Notas {
    public static void main(String[] args) {
        // Array de notas
        double[] notas = {7.5, 8.0, 9.2, 5.5, 6.8};

        // Inicializar las variables para máxima, mínima y suma
        double maxima = notas[0];
        double minima = notas[0];
        double suma = 0;

        // Recorrer el array para calcular la máxima, mínima y la suma
        for (int i = 0; i < notas.length; i++) {
            // Actualizar la máxima y mínima
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
            if (notas[i] < minima) {
                minima = notas[i];
            }
            // Sumar las notas para calcular la media
            suma += notas[i];
        }

        // Calcular la media
        double media = suma / notas.length;

        // Mostrar resultados
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Nota mínima: " + minima);
        System.out.println("Media de las notas: " + media);
    }
}
