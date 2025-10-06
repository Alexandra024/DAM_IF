package EX_3EV_ORDINARIA;

import java.util.ArrayList;
import java.util.List;

public class GestorLibreria {

    private List<Venta> ventasDelDia = new ArrayList<>();
    private List<CestaRegalo> cestasDelDia = new ArrayList<>();
    private double totalCaja = 0;

    // ➕ Añadir venta a la lista
    public void agregarVenta(Venta v) {
        ventasDelDia.add(v);
        totalCaja += v.getTotal();
    }

    // ➕ Añadir cesta a la lista
    public void agregarCesta(CestaRegalo c) {
        try {
            totalCaja += c.getTotal();  // puede lanzar excepción
            cestasDelDia.add(c);
        } catch (Exception e) {
            System.out.println("⚠️ Error al añadir cesta: " + e.getMessage());
        }
    }

    // 📋 Listar ventas realizadas
    public void listarVentas() {
        System.out.println("🔹 Ventas del día:");
        for (Venta v : ventasDelDia) {
            v.emitirTicket();
        }
    }

    // 📋 Listar cestas creadas
    public void listarCestas() {
        System.out.println("🎁 Cestas de regalo:");
        for (CestaRegalo c : cestasDelDia) {
            try {
                c.emitirTicket();
            } catch (Exception e) {
                System.out.println("⚠️ Cesta no válida: " + e.getMessage());
            }
        }
    }

    // 📦 Imprimir todo lo del día
    public void hacerCaja() {
        System.out.println("🧾 RESUMEN DEL DÍA:");
        listarVentas();
        listarCestas();
        System.out.printf("💰 TOTAL EN CAJA: €%.2f\n", totalCaja);
    }
}

