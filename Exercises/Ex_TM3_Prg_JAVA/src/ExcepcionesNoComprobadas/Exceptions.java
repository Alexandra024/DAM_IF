package Ex_TM3_Prg_JAVA.src.ExcepcionesNoComprobadas;

public class Exceptions {

        public static void ArrayIndexOutOfBoundsException() {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Índice fuera de los límites del arreglo
        }
    
        public static void IllegalArgumentException() {
            int edad = -5;
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        }
    
        public static void NullPointerException() {
            String texto = null;
            System.out.println(texto.length()); // Acceso a método de una referencia null
        }
    
        public static void ArithmeticException() {
            int resultado = 10 / 0; // División por cero
            System.out.println(resultado);
        }

        // ArithmeticException
        // Operación    | ¿Lanza ArithmeticException?   | Tipo de dato
        // 10 / 0       | ✅ Sí                         | int
        // 10 % 0       | ✅ Sí                         | int
        // 10.0 / 0.0   | ❌ No (da Infinity)           | double
        // 0.0 / 0.0    | ❌ No (da NaN)                | double
    
        public static void main(String[] args) {
    
            // ArrayIndexOutOfBoundsException();
            // IllegalArgumentException();
            // NullPointerException();
            // ArithmeticException();
        }
    }
    