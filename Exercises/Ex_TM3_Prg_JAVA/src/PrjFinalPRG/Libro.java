package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

public class Libro extends MaterialBiblioteca{
    
    public String autor;
    public boolean prestado;

    public Libro(String titulo, String codigo, String anioPublicacion, String autor, boolean prestado) {
        super(titulo, codigo, anioPublicacion); // Assuming the parent class has a constructor that accepts a title
        this.autor = autor;
        this.prestado = prestado;
    }

    

    @Override
    public  getTipomaterial(){
        return "Es un libro";
    }
}
