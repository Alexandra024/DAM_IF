package OOP_ejercicios;
public class ApuntesOOP {
  public static void main(String[] args) {
      Coche miCoche = new Coche(); // Crear un objeto de la clase Coche
      miCoche.velocidad = 120; // Asignar un valor a la velocidad
      miCoche.color = "Rojo"; // Asignar un valor al color
      miCoche.modelo = "Sedan"; // Asignar un valor al modelo

      // Mostrar las caracteristicas del coche
      miCoche.mostrarCaracteristicas();

      // Llamar al metodo acelerar
      miCoche.acelerar(30);
  }
}

class Coche { // ---> CLASE

  // ---> ATRIBUTOS
  int velocidad; // Atributo para la velocidad del coche
  String color; // Atributo para el color del coche
  String modelo; // Atributo para el modelo del coche


  // ---> METODOS
  // Metodo para acelerar el coche
  public void acelerar(int incremento) {
      velocidad += incremento;
      System.out.println("El coche ha acelerado. Nueva velocidad: " + velocidad + " km/h");
  }

  // Metodo para mostrar las caracteristicas del coche
  public void mostrarCaracteristicas() {
      System.out.println("Modelo: " + modelo);
      System.out.println("Color: " + color);
      System.out.println("Velocidad actual: " + velocidad + " km/h");
  }
}
