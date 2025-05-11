package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

// Clase abstracta que representa material de biblioteca
public abstract class MaterialBiblioteca {  
    
    // Campos para almacenar el título, código y año de publicación del material
    protected String titulo; 
    protected String codigo; // Codigo de barras
    protected String anioPublicacion; // Año de publicación

    // Constructor para inicializar los campos
    public MaterialBiblioteca(String titulo, String codigo, String anioPublicacion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
    }

    // Método abstracto que debe ser implementado por las clases derivadas para especificar el tipo de material
    public abstract String getTipoMaterial();

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "MaterialBiblioteca [titulo=" + titulo + ", codigo=" + codigo + ", anioPublicacion=" + anioPublicacion
                + ", getTipoMaterial()=" + getTipoMaterial() + "]";
    } 

}
