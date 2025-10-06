package Granja_Ex;

/**
 * 
 */
public class Perro extends Animal {

	private String raza;
	private String pedigri;

	// constructor
	public Perro(String raza, String pedigri, int age, String name, String vet, int annoNac) {
		super(age, name, vet, annoNac);
		this.raza = raza;
		this.pedigri = pedigri;
	}

	// getters y setters
	public String getraza() { return raza; }
	public void setraza(String raza) { this.raza = raza; }
	public String getpedigri() { return pedigri; }
	public void setpedigri(String pedigri) { this.pedigri = pedigri; }

	// métodos
	@Override
	public String hacerSonido() {
		return getName() + "Ladra y dice gua gua";
	}

	@Override
	public String eat() {
		return getName() + "Come croquetas";
	}

	@Override
	public String move() {
		return getName() + "Corre felizmente";
	}

	// completo
	public String toString() {
		return "Perro [raza=" + raza + ", pedigri=" + pedigri + ", getraza()=" + getraza() + ", getpedigri()="
				+ getpedigri() + ", hacerSonido()=" + hacerSonido() + ", eat()=" + eat() + ", move()=" + move() + "age="
				+ getAge() + ", name=" + getName() + ", toString()=" + super.toString() + "]";
	}

}
