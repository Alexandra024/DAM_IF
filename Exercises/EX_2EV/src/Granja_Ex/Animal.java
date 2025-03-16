package Granja_Ex;

/**
 * @author Sara Alexandra Barsan
 * @version 1.0.0
 * @since 1.0.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Animal {

	/**
	 * @Atributo Nombre del animal
	 * @Atributo Edad del animal
	 * @Atributo totalAnimales: la suma de los animales que se creados
	 * @Atributo CartillaVet: contiene los datos de la cartillaVet; médica del animal
	 * **/

	private static int totalAnimales = 0; // static = 0 inicializa el valor de la variable
	private int age;
	private String name;
	private CartillaVet cartillaVet; // contiene los datos de la cartillaVet; médica del animal

	/**
	 * CONSTRUCTOR
	 * 
	 * @param name: name del animal
	 * @param age: age del animal (no puede ser negativa)
	 * @param annoNac: año de nacimiento del animal, atributo de la cartillaVet;
	 * @param vet: name del veterinario encargado del animal, atributo de cartillaVet;
	 * @param VCartillaVet: creamos una cartillaVet; nueva cada vez que creamos un nuevo animal (agregacion fuerte) con vacunas y enfermedades a 0
	 * **/
	
	public Animal(int age, String name, String vet, int annoNac) {
		totalAnimales++;
		this.name = name;
		this.cartillaVet = new CartillaVet(annoNac, 0, 0, vet);
		// Throws IllegalArgumentException if age is negative
		if (age>=0) {
			this.age = age;
		}
	}

	// getters y setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public static int getTotalAnimales() { return totalAnimales; }

	public CartillaVet getCartilla() { return cartillaVet; }
	public void setCartilla(CartillaVet cartillaVet) { this.cartillaVet = cartillaVet; }
	
	/**
	 * @METHOD setEdad : pide un número entero para establecer la age del animal (si la age es negativa no se reestablecera)
	 **/
	
	 public void setAge(int age) {
		if (age>=0) {
			this.age = age;}
	}
	
	/**
	 * METODOS
	 * **/
	/**
	 * @METHOD hacerSonido : devuelve un String con el sonido que hace el animal
	 * @METHOD eat : devuelve un String con lo que come el animal
	 * @METHOD move : devuelve un String con la manera en la que se mueve el animal
	 **/
	public String hacerSonido() { return ""; }
	public String eat() { return ""; }
	public String move() { return ""; }

	// extras
	// public void dormir() { System.out.println("Zzz"); }
	// public void despertar() { System.out.println("Estoy despierto"); }

	/**
	 * @METHOD enfermar : pide un veterinario para que diagnostique una enfermedad al animal y suma 1 a la cuenta de enfermedades del animal
	 * @METHOD vacunar : pide un veterinario para que ponga la vacuna al animal y suma 1 a la cuenta de vacunas del animal
	 * @param vet : el veterinario que diagnosticará la enfermedad y la vacuna
	 **/
	
	public void enfermar(String vet) {
		cartillaVet.setNameVet(vet);
		cartillaVet.setnEnferm(cartillaVet.getnEnferm()+1);
	}
		
	public void vacunar(String vet) {
		cartillaVet.setNameVet(vet);
		cartillaVet.setnVac(cartillaVet.getnVac()+1);
	}
	
	/**
	 * @METHOD toString : devuelve un String con toda la informacion del animal
	 **/
	
	public String toString() {
		return"Nombre: " + name 
				+"\nEdad: "+age+" años"
				+"\nNacido en "+ cartillaVet.getAnnoNac()
				+"\nNombre del veterinario: "+cartillaVet.getNameVet()
				+"\nNumero de enfermedades: "+cartillaVet.getnEnferm()
				+"\nNumero de vacunaciones: "+cartillaVet.getnVac()
				+"\nEste animal hace "+hacerSonido()
				+"\nEste animal come "+eat()
				+"\nEste animal "+move();
	}

}
