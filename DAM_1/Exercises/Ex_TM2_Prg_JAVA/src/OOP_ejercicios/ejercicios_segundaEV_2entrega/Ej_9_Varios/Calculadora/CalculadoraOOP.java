package OOP_ejercicios.ejercicios_segundaEV_2entrega.Ej_9_Varios.Calculadora;

import java.util.Scanner;
public class CalculadoraOOP {
    private float num, acumulador;
    private char symbol;
    private Scanner input = new Scanner(System.in);

    public CalculadoraOOP(float num, float acumulador) {
        this.num = num;
        this.acumulador = acumulador;
    }

    public void setNumFromInput() {
        while (true) {
            System.out.print("Introduce un numero: ");
            String inputStr = input.nextLine();  // Usamos nextLine para leer toda la entrada
            try {
                this.num = Float.parseFloat(inputStr);  // Convertimos el input a float
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Por favor, introduce un numero.");
            }
        }
    }

    public void setsymbol(char symbol) {
        this.symbol = symbol;
    }

    public void resetCalculator() {
        this.num = 0;
        this.acumulador = 0;
        System.out.println("0");
    }

    public void startCalculator() {
        setNumFromInput();  // Inicializa el primer número
        acumulador = num;  // Asigna el primer número a "acumulador"
        
        while (true) {
            System.out.print("Introduce una operacion (+, -, *, /, r reiniciar y c total, e para cerrar): ");
            String operation = input.nextLine();  // Usamos nextLine para leer toda la entrada de la operación
            if (operation.length() == 1) {
                symbol = operation.charAt(0);  // Asignamos solo el primer carácter ingresado
            } else {
                System.out.println("Operación no válida.");
                continue;
            }
            
            if (symbol == 'c') {
                System.out.println("Total: " + acumulador);
                System.out.println("Gracias por usar la calculadora guapo.");
                continue;
            }
            
            else if (symbol == 'r') {
                resetCalculator();
                continue;
            }
            
            else if (symbol == 'e') {
            	System.out.println("Saliste de la calculadora");
            	break;
            }

            setNumFromInput();  // Pide un nuevo número después de cada operación

            switch (symbol) {
                case '+':
                    suma();
                    break;
                case '-':
                    resta();
                    break;
                case '*':
                    multiplicar();
                    break;
                case '/':
                    dividir();
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    continue;
            }
        }
    }

    public void suma() {
        this.acumulador += this.num;
        System.out.println("Resultado: " + this.acumulador);
    }

    public void resta() {
        this.acumulador -= this.num;
        System.out.println("Resultado: " + this.acumulador);
    }

    public void multiplicar() {
        this.acumulador *= this.num;
        System.out.println("Resultado: " + this.acumulador);
    }

    public void dividir() {
        if (this.num != 0) {
            this.acumulador /= this.num;
            System.out.println("Resultado: " + this.acumulador);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }
}

