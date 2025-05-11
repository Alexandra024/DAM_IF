package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

public class Revista extends MaterialBiblioteca {
    
    public int nEdicion;

    public Revista(String titulo, String codigo, String anioPublicacion, int nEdicion) {
        super(titulo, codigo, anioPublicacion); // Assuming the parent class has a constructor that accepts a title
        this.nEdicion = nEdicion;
    }

    
}
