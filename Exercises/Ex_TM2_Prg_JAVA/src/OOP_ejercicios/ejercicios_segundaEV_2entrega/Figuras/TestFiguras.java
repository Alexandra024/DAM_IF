package OOP_ejercicios.ejercicios_segundaEV_2entrega.Figuras;

public class TestFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(5, 10);
        Rectangulo r = new Rectangulo(5, 10);
        
        System.out.println("Area del circulo: " + c.calcularArea());
        System.out.println("Area del triangulo: " + t.calcularArea());
        System.out.println("Area del rectangulo: " + r.calcularArea());
        
        for (int i = 0; i < 1; i++) { // bucle para probar el polimorfismo(=)
            c.escribirCirculo();
            t.escribirTriangulo();
            r.escribirRectangulo();
        }
       
        System.out.println(c instanceof Circulo);
        System.out.println(t instanceof Triangulo);
        System.out.println(r instanceof Rectangulo);
    }   
}
