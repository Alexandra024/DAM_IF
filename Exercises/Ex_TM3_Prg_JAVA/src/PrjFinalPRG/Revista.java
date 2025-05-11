package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

public class Revista extends MaterialBiblioteca {
    
    public int numeroEdicion;

    public Revista(String titulo, String codigo, String anioPublicacion, int numeroEdicion) {
        super(titulo, codigo, anioPublicacion); // Assuming the parent class has a constructor that accepts a title
        this.numeroEdicion = numeroEdicion;
    }

    
}
