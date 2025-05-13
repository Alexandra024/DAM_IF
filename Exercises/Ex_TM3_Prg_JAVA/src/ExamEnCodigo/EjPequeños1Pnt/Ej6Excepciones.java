package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt;

// Crea un pequeño método que lance una excepción personalizada hecha por ti. 
// Crea el código de la excepción personalizada.

public class Ej6Excepciones {
    // Almacena el resultado de la operación
    int resultado;

    // Constructor 
    public Ej6Excepciones() {
        try {
            resultado = 10 / 0;
        } catch (ArithmeticException exx) {
            // Capturar la excepción de división por cero
            System.out.println("No se puede dividir por cero");
            // Asignar un valor por defecto al resultado
            resultado = 0;
        }
    }

    // Método para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("resultado: " + resultado);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Instancia de la clase
        Ej6Excepciones instancia = new Ej6Excepciones();
        instancia.mostrarResultado();
    }
}