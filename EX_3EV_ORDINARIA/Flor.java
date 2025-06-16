package EX_3EV_ORDINARIA;


public class Flor implements Regalable {
    
    public enum TipoFlor {
        ROSA, CLAVEL, MARGARITA
    }

    // atributos para el lazo y el tipo de flor
    public TipoFlor tipo;
    public String lazoColor;

    public Flor(TipoFlor tipo){
        this.tipo= tipo;
    }

    @Override
    public void ponerLazo(String color) {
        this.lazoColor = color; // creacion de atributo al principio de la clase
        System.out.println("Lazo puesto en la flor: " + color);
    }

    // toString
    @Override
    public String toString() {
        return "Flor [tipo=" + tipo + ", lazoColor=" + lazoColor + "]";
    }
    
}

  