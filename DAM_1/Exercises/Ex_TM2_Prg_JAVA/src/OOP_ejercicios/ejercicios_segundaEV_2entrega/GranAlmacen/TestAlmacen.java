package OOP_ejercicios.ejercicios_segundaEV_2entrega.GranAlmacen;

public class TestAlmacen {

    public static void main(String[] args) {

        Alimentacion pizza = new Alimentacion(3.5,"Pizza", "123456789", 1, 1, 2025);
        System.out.println(pizza.toString());

        Ropa pijama = new Ropa(30, "Pijama", "987654321", "Algodón");
        System.out.println(pijama.toString());

        Electronica mp3 = new Electronica(80, "MP3", "192837465",8.5);
        System.out.println(mp3.toString());

        Venta venta1 = new Venta("V001");
        
        venta1.agregarProd(pizza);
        venta1.agregarProd(pijama);
        venta1.agregarProd(mp3);
        System.out.println(venta1.ticket());
        
        System.out.println();
       
        
        Venta venta2 = new Venta("V002");

        venta2.agregarProd(pizza);
        venta2.agregarProd(pizza);
        venta2.agregarProd(pizza);
        
        System.out.println(venta2.ticket());

    }
}
