
public class NumerosMuchos {

	public static void main(String[] args) { // numeros del 100 al 200 PARES

        for (int i = 100; i < 201; i++) { // --- range (empieza,termina/condicion SIEMPRE VERDADERA), acumulador
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

	
}

