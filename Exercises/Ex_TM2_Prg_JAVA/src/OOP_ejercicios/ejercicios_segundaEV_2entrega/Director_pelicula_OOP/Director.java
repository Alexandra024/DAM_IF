package OOP_ejercicios.ejercicios_segundaEV_2entrega.Director_pelicula_OOP;

public class Director { 
    
    // Atributos de la clase
    private String nombre;
    private String pais_origen;
    private int ano_nacimiento;

    // Constructor para inicializar los atributos
    public Director(String nombre, String paisOrigen, int anoNacimiento) {
        this.nombre = nombre;
        this.pais_origen = paisOrigen;
        // atributo de la clase = ...
        // ... = parámetro del metodo (cuando se hace una llamada)
        this.ano_nacimiento = anoNacimiento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPaisOrigen() { return pais_origen; }
    public void setPaisOrigen(String pais_origen) { this.pais_origen = pais_origen; }

    public int getAnoNacimiento() { return ano_nacimiento; }
    public void setAnoNacimiento(int ano_nacimiento) { this.ano_nacimiento = ano_nacimiento; }







    // Método
    private static void main(String[] args){
        // Crear un objeto Director
        Director nuevDirector = new Director();
        
        // Leer el valor del atributo -> getter
        // Cambiar el valor del atributo -> setter



    }


    public static void imprimir() {        
        // Añadir un método público llamado "imprimir", que escriba 
        // en pantalla los datos del director

        Director nuevDirector = new Director();

    // Sobrescribir toString ; método sobrecargado y sobreescrito
    @Override
        toString.Director
    

    }

    // test
    public static void main() {
    // Para ir haciendo pruebas, añade una clase Test con el método main.

    }
}
