package Granja_Ex;

public class GranjaTest {

	public static void main(String[] args) {

		// añadimos los perros y los gatos ademas de sacarlos por pantalla
		Perro p1 = new Perro("labrador", "calle", 5, "María", "sí", 2018);
		Perro p2 = new Perro("pastor alemán", "mestizo", 7, "Carlos", "sí", 2016);
		Perro p3 = new Perro( "beagle", "bueno", 3, "Thomas", "no", 2000);
		
		Gato g1 = new Gato("siamés", "calle", 4, "Lucía", "sí", 2019);
		Gato g2 = new Gato("persa", "mestizo", 6, "Ana", "no", 2017);
		
		Granja gr1 = new Granja();

		
		gr1.addAnimal(p1);
		gr1.addAnimal(p2);
		gr1.addAnimal(g1);
		
		System.out.println(gr1.toString());
		
		gr1.vacunarGeneral();
		
		p2.enfermar("Lolita");
		
		System.out.println(gr1.toStringComer());
		System.out.println(gr1.toStringMover());
		System.out.println(gr1.toStringSonar());
		
		System.out.println("TOTAL ANIMALES "+ g1.getTotalAnimales());
		
		System.out.println(gr1.toString());
	}
}
