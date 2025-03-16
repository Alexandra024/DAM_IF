package Granja_Ex;

public class Granja {
    private Animal[] animals; // array de animales
    private int contadorAnimales = 0;

    public Granja() {
        animals = new Animal[3]; // inicializamos el array con 3 animales
    }

    public void addAnimal(Animal a) { // añadir un animal al array
        this.animals[this.contadorAnimales] = a; // añadimos el animal al array
        this.contadorAnimales++; // incrementamos el contador de animales
    }

    public String toString() { // mostrar los datos de los animales
        String datos = ""; // variable para almacenar los datos
        for (Animal a : animals) { // recorremos el array de animales
            datos += a.toString() + "\n"; // añadimos los datos del animal al string
        }
        return datos;
    }

    public String toStringMover() {
        String datos = "";
        for (Animal a : animals) {
            datos += a.move() + "\n";
        }
        return datos;
    }

    public String toStringComer() {
        String datos = "";
        for (Animal a : animals) {
            datos += a.eat() + "\n";
        }
        return datos;
    }

    public String toStringSonar() {
        String datos = "";
        for (Animal a : animals) {
            datos += a.hacerSonido() + "\n";
        }
        return datos;
    }

    public void vacunarGeneral() {
        for (Animal a : animals) {
            a.vacunar(a.getCartilla().getNameVet());
        }
    }
}
