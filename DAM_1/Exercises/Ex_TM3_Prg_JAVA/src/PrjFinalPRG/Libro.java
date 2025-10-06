package Ex_TM3_Prg_JAVA.src.PrjFinalPRG;

public class Libro extends MaterialBiblioteca implements Comparable<Libro> {
    
    public Autor autor;
    public boolean prestado;

    public Libro(String titulo, String codigo, String anioPublicacion, String nombreAutor, String editorial, boolean prestado) {
        super(titulo, codigo, anioPublicacion); // Assuming the parent class has a constructor that accepts a title
        this.prestado = prestado;
        // El autor se crea dentro del libro -> composición
        this.autor = new Autor(nombreAutor, editorial);
    }

    @Override // clase abstracta del padre
    public String getTipoMaterial(){
        return "material: ...";
    }
   
    @Override
    public void prestar(){
        System.out.println("se ha prestado el Libro");
    }
    @Override
    public void devolver(){
        System.out.println("se ha devuelto el Libro");
    }

    @Override
    public String getResumenCatalogo(){
        return "Catalogo Libro: ..." ;
    }

    @Override // CompareTo - composicion
    public int compareTo(Libro otroLibro) {
        return this.getTitulo().compareToIgnoreCase(otroLibro.getTitulo());
    }

    protected class Autor { // clase anidada
        protected String nombre;
        protected String editorial;

        public Autor(String nombre, String editorial) {
            this.nombre = nombre;
            this.editorial = editorial;
        }

        public String getNombre() { return nombre; } 
        public String getEditorial() { return editorial; }

    }
}
