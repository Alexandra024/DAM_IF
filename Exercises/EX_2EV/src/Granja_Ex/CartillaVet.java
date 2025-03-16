package Granja_Ex;

public class CartillaVet {

	private int annoNac;
	private int nVac = 0;
	private int nEnferm = 0;
	private String nameVet;

	// CONSTUCTOR
	public CartillaVet(int annoNac, int nVac, int nEnferm, String nameVet) { 
		// Throws IllegalArgumentException if nVac or nEnferm are negative
		if (nVac < 0 || nEnferm < 0) {
			throw new IllegalArgumentException("El número de vacunas y enfermedades no puede ser negativo");
		}
		this.annoNac = annoNac;
		this.nVac = nVac++;
		this.nEnferm = nEnferm++;
		this.nameVet = nameVet;
	}
		
	// getters && setters
	public int getAnnoNac() { return annoNac; }
	public void setAnnoNac(int annoNac) { this.annoNac = annoNac; }
	public String getNameVet() { return nameVet; }
	public void setNameVet(String nameVet) { this.nameVet = nameVet; }

	// getters && setters of nVac & nEnferm > 0
	public int getnVac() { return nVac; }
	public int getnEnferm() { return nEnferm; }

	public void setnVac(int nVac) { 
		if (nVac >= 0 ){
			this.nVac = nVac; }
	}	
	public void setnEnferm(int nEnferm) { 
		if (nEnferm >= 0 ){
		this.nEnferm = nEnferm; }
	}

	// Métodos ------------------------
    // public void enfermar(String nameVet) {
    //     this.nameVet = nameVet;
    //     nEnferm++;
    // }

    // public void vacunar(String nameVet) {
    //     this.nameVet = nameVet;
    //     nVac++;
    // } 

}


