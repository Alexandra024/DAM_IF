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
    }

    public static double totalCesta(){ // excepcion si pasa de los 100

        if totalCesta()> 100 {

        }
    }


    // toString
}
