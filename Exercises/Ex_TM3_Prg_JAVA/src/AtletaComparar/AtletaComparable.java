package Ex_TM3_Prg_JAVA.src.AtletaComparar;

/**
 * Se les pide crear una clase llamada "Atleta" que represente a un atleta en una competencia.
 * Cada atleta debe tener un nombre y un tiempo (en segundos) registrado en una carrera.
 * 1. La clase "Atleta" debe implementar la interfaz Comparable para permitir la comparación entre atletas.
 * 2. El criterio de comparación debe ser el tiempo de la carrera en orden ascendente.
 * 
 * 3. Implementen el método compareTo correctamente.
 * 4. En la clase principal, creen un array de objetos "Atleta" con algunos valores de ejemplo.
 * 5. Ordenen el array utilizando Arrays.sort().
 * 6. Finalmente, impriman la lista ordenada de atletas.
 * Ejemplo de salida esperada:
 * Ana - 10 segundos
 * Sofía - 11 segundos
 * Carlos - 12 segundos
 * Luis - 15 segundos
 */
public class AtletaComparable implements Comparable<AtletaComparable> {
	
    protected String name;
    protected int timeS;

    public AtletaComparable (String name, int timeS){
        this.name = name;
        this.timeS = timeS;
    }

	@Override
	public int compareTo(AtletaComparable AtlC) { // siempre devuelte positivo , negativo o cero
		return Integer.compare(this.timeS, AtlC.timeS); // orden ascendente 
		// (AtlC.timeS , this.timeS)  orden descendente 
	}

    @Override
    public String compareTo(AtletaComparable Atl){
        return this.name.compareTo(Atl.name); 
    }

    

}
