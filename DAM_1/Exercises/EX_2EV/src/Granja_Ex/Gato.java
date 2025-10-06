package Granja_Ex;

/**
 * @author Sara Alexandra Barsan
 * @version 1.0.0
 * 
 * CLASE HIJA Gato HEREDA Animal
 * **/
public class Gato extends Animal {

	private String colorPelo;
	private String pais;

	// constructor
	public Gato(String colorPelo, String pais, int age, String name, String vet, int annoNac) {
		super(age, name, vet , annoNac);
		this.colorPelo = colorPelo;
		this.pais = pais;
	}

	// getters y setters
	public String getcolorPelo() { return colorPelo; }
	public void setcolorPelo(String colorPelo) { this.colorPelo = colorPelo; }
	public String getPais() { return pais; }
	public void setPais(String pais) { this.pais = pais; }

	// métodos
	@Override
	public String hacerSonido() {
		return getName() + "Maulla y dice miau miau";
	}

	@Override
	public String eat() {
		return getName() + "Come pescado";
	}

	@Override
	public String move() {
		return getName() + "Salta de un mueble a otro";
	}

	// completo
	public String toString() {
		return "Gato [colorPelo=" + getcolorPelo() + ", pais=" + getPais() + ", hacerSonido=" + hacerSonido()
				+ ", eat()=" + eat() + ", move()=" + move() + "age=" + getAge() + ", name=" + getName()
				+ ", toString()=" + super.toString() + "]";
	}

}
