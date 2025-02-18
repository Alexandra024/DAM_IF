package OOP_ejercicios.ejercicios_segundaEV_2entrega.Figuras;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void escribirCirculo() {
        System.out.println("Soy Circulo");
    }
}
