package EX_3EV_ORDINARIA;

import java.util.ArrayList;

public class CestaRegalo {
    
    ArrayList<Libros> libro = new ArrayList<>();
    ArrayList<Regalable> productos = new ArrayList<>();
    
    public void addLibro(Libros li){  // annadir libro
        libro.add(li); 
    }

    // annadir toda la lista
    public void agregarLibros(ArrayList<Libros> listaLibros){
        libro.addAll(listaLibros);
    }

    public static void emitirTicket(ArrayList<Libros> libro, ArrayList<Regalable> productos, double totalCesta){
        System.out.println("Ticket de la cesta:");
        for (Libros li : libro ){
            System.out.println(li.getTitulo());
        }
        for (Regalable r : productos){
            // Imprime la representación del producto Regalable
            System.out.println(r.toString());
        }

        System.out.printf("Total cesta: €%.2f\n", totalCesta);
            // con el €%.2f\n hay que poner una , no un +

            // NO FUNCIONA PERO ES UNA IDEA
        // for (Libros li : libro) {
        // System.out.println("Libro: " + li.getTitulo());
        // }

        // for (Regalable r : productos) {
        //     if (r instanceof Libro) {
        //         Libro l = (Libro) r;
        //         System.out.println("Libro (Regalable): " + l.getTitulo());
        //     } else if (r instanceof Flor) {
        //         Flor f = (Flor) r;
        //         System.out.println("Flor: " + f.getTipoFlor());
        //     } else {
        //         System.out.println("Producto: " + r.toString());
        //     }
        // }
    }

    // static o no??
    public double totalCesta() throws CestaCaraException { // excepcion si pasa de los 100

        double total = 0;

        for (Libros li : libro){
            total += li.precioFinal();
        }
        
        for (Regalable r : productos){
            total += r.getPrecio();
        }

        if (total > 100){
            throw new CestaCaraException("Esta cesta es cara:" + total);
        }
        return total;
    }


    // toString
}
