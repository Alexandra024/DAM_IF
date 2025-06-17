package EX_3EV_ORDINARIA;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 📚 OBRAS
        Libro l1 = new Libro("El Quijote", 25);
        Libro l2 = new Libro("1984", 30);
        Revista r1 = new Revista("National Geographic", 10);
        Revista r2 = new Revista("Muy Interesante", 12);
        Comic c1 = new Comic("Spiderman", 8);
        Comic c2 = new Comic("Batman", 9);

        // 🌸 OBJETOS FLORALES
        Flor f1 = new Flor("Rosas", 15);
        Flor f2 = new Flor("Tulipanes", 18);

        // 🧾 VENTAS
        Venta venta1 = new Venta();
        venta1.addProducto(l1);
        venta1.addProducto(r1);
        venta1.addProducto(c1);
        venta1.emitirTicket();

        Venta venta2 = new Venta();
        venta2.addProducto(l2);
        venta2.addProducto(r2);
        venta2.addProducto(c2);
        venta2.emitirTicket();

        // 🎁 CESTAS
        CestaRegalo cesta1 = new CestaRegalo();
        cesta1.addProducto(f1);
        cesta1.addProducto(l1);
        try {
            cesta1.emitirTicket();
        } catch (Exception e) {
            System.out.println("⚠️ Cesta 1: " + e.getMessage());
        }

        CestaRegalo cesta2 = new CestaRegalo();
        cesta2.addProducto(f2);
        cesta2.addProducto(l2);
        cesta2.addProducto(r2);
        cesta2.addProducto(c1); // puede pasar los 100€
        try {
            cesta2.emitirTicket();
        } catch (Exception e) {
            System.out.println("⚠️ Cesta 2: " + e.getMessage());
        }

        // 🛒 GESTIÓN
        GestorLibreria gestor = new GestorLibreria();
        gestor.agregarVenta(venta1);
        gestor.agregarVenta(venta2);
        gestor.agregarCesta(cesta1);
        gestor.agregarCesta(cesta2);

        gestor.hacerCaja(); // imprime resumen del día
    }
}

