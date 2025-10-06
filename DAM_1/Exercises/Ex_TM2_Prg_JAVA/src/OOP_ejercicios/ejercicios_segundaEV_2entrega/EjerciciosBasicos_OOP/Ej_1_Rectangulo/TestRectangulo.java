package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_1_Rectangulo;

public class TestRectangulo {
    public static void main(String[] args) {
		/*Crear una clase Rectángulo, con atributos base y altura. 
        Crear también el constructor de la clase y los métodos necesarios 
        para calcular el área y el perímetro. Crear otra clase PruebaRectangulo 
        que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros. */
       
        BasicFigura rectangulo1 = new BasicFigura(15, 2);
		BasicFigura rectangulo2 = new BasicFigura(2, 2);
		BasicFigura rectangulo3 = new BasicFigura(1, 4);
		
		System.out.println("1: " + rectangulo1);
		System.out.println("2: " + rectangulo2);
		System.out.println("3: " + rectangulo3);
    }
}
