package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

public class Revista extends MaterialBiblioteca {
    
    public int numeroEdicion;

    public Revista(String titulo, String codigo, String anioPublicacion, int numeroEdicion) {
        super(titulo, codigo, anioPublicacion); // Assuming the parent class has a constructor that accepts a title
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }

    @Override // clase abstracta del padre
    public String getTipoMaterial(){
        return "material: ...";
    }

    @Override
    public void prestar(){
        System.out.println("se ha prestado la Revista");
    }
    @Override
    public void devolver(){
        System.out.println("se ha devuelto la Revista");
    }

    @Override
    public String getResumenCatalogo(){
        return "Catalogo Revista: ..." ;
    }
}
