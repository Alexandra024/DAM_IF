package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;
import java.util.ArrayList;
import java.util.List;

// El almacén realiza ventas, cada venta puede estar 
// formada un código de venta y por varios productos. 

// Se desea:
// 1. Realizar un diagrama donde se vean las relaciones entre clases, junto a los atributos
// y métodos de cada una.
// 4. Ejecutar el ejemplo del apartado 2 para ver que precio da la suma de la compra.
public class Venta {
   
    private String codVenta; 
    private List<Producto> productos;

    // public Venta(String codVenta, List<Producto> productos) {
    //     this.codVenta = codVenta;
    //     this.productos = productos;
    // }

     public Venta(String codigoVenta) {
        this.productos = new ArrayList<>();
        this.codVenta = codVenta;
    }
    
    public void agregarProd(Producto p){
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    // productos.toString() para ver la lista
    public String ticket() {
        return "Venta [codVenta=" + codVenta + ", productos=" + productos.toString() + "]";
    }

}
