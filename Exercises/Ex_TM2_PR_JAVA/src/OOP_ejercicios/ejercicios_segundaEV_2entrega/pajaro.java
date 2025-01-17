package OOP_ejercicios.ejercicios_segundaEV_2entrega;
// PAGINA 101 - apoyo módulo
// https://aulavirtual33.educa.madrid.org/ies.islasfilipinas.madrid/pluginfile.php/6463/mod_resource/content/1/Programaci%C3%B3n%20en%20Java.pdf
    
    // construye un tipo pajaron q que tenoa : color especie; cada uno tiene una clave;
    // al instanciar el objeto se incrementa el numero de pajaros
    // datos + id (generado desde el objeto, no introducido  por usuario)
    // sabremos cauntos pajaros estan creados en cada momento
    // instanciamos en el test varios pajaros y mostrar sus datos, aparecerá cada uno con un id distinto
    // y finalmente visualizaré el num de pajaros totales


public class pajaro {

    private static int Npajaros= 1000;
    private int id ;
    private char color ; 
    private int edad ; 

    
    public Pajaro(){ // Constructor sin parámetros.
        id = Npajaros++; // variable local y el atributo de clase:
        color = 'v';
        edad = 0; 
        nuevoPajaro();
    }

    public Pajaro(int id, int edad, char cc){ // Constructor con dos parámetros.
        id = id;
        edad = edad;
        color = cc ; // var parametro = var
        nuevoPajaro();
    }
    
    
    public void printColor() {
        switch (color) {
        case 'v':
        System.out.println("verde");
        break;
        case 'a':
        System.out.println("amarillo");
        break;
        case 'g':
        System.out.println("gris");
        break;
        case 'n':
        System.out.println("negro");
        break;
        case 'b':
        System.out.println("blanco");
        break;
        default:
        System.out.println("color no establecido");
        } 

        
        // String toString(){
        // }
 
        }       
}
