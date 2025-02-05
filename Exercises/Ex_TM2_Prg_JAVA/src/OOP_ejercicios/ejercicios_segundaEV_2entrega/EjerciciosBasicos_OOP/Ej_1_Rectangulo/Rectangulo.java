package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_1_Rectangulo;

// Crear una clase Rectángulo, con atributos base y altura. Crear también el 
// constructor de la clase y los métodos necesarios para calcular el área y el 
// perímetro. Crear otra clase PruebaRectangulo que pruebe varios rectángulos 
// y muestre por pantalla sus áreas y perímetros.
public class Rectangulo {
    //Atributos base y altura
    private int base;
    private int altura;

    //Constructor
    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //Getters y setters
    public int getBase() { return base;}
    public void setBase(int base) {this.base = base;}

    public int getAltura() { return altura;}
    public void setAltura(int altura) {this.altura = altura;}

    // MÉTODOS:

        // Método para calcular el perímetro
    public double calculoPerimetro() {
        return 2* (base + altura);
    }
    
        // Método para calcular el área
    public double calculoArea() {
        return base * altura;
    }

    // Sobreescribir en el método toString()
    @Override
    public String toString(){
        
        return "Área: " + calculoArea() + 
                " & Perímetro: " + calculoPerimetro() ;
    }    

}
