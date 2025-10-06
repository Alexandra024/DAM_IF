package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_1_Rectangulo;

public class BasicFigura {
    private float altura, base, area, perimetro;
	
	//constructor
	public BasicFigura(float altura, float base) {
		this.altura = altura;
		this.base = base;
		this.area = area();
		this.perimetro = perimetro();
	}
	
	
    @Override
    public String toString() {
        return "Datos del rectangulo[altura: " + altura + "  Base: "+ base + " area: "+ area + " perimetro: "+ perimetro +"]";
    }
	
    
    public float area() {
    	return this.altura * this.base;	
    }
    public float perimetro() {
    	return (2*this.altura) + (2*this.base);	
    }

	
}
