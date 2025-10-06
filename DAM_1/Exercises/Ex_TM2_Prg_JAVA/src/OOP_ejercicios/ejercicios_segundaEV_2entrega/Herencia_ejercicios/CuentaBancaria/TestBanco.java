package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

public class TestBanco {
    
    public static void main(String[] args) {
        
        Cuenta cuetnaPropia = new Cuenta(4000, 30);

        //Numero de consignaciones
        cuetnaPropia.consignar(5);
        System.out.println("consignacion " + cuetnaPropia.getnConsignaciones());
        //Numero de retiros
        cuetnaPropia.retirar(40);
        System.out.println("retirar " + cuetnaPropia.getnRetiros());
        System.out.println("extracto mensual ");
        cuetnaPropia.extractoMensual();
        
        
        // imprimir todo
        System.out.println(cuetnaPropia);

        // Crear una cuenta de ahorros con saldo inicial de $15,000 y tasa de interés del 2%
        CuentaAhorros cuentaAhorrosSara = new CuentaAhorros(15000, 2);
        
        // Consignar $5,000 a la cuenta de ahorros
        cuentaAhorrosSara.consignar(5000);
        System.out.println("consignacion " + cuentaAhorrosSara.getnConsignaciones());
        // Retirar $2,000 de la cuenta de ahorros
        cuentaAhorrosSara.retirar(2000);
        System.out.println("retirar " + cuentaAhorrosSara.getnRetiros());
        // Generar el extracto mensual de la cuenta de ahorros
        System.out.print("extracto mensual ");
        cuentaAhorrosSara.extractoMensual();

        // imprimir todo
        System.out.println(cuentaAhorrosSara);


        CuentaCorriente cuentaCorrienteLucho = new CuentaCorriente(30000, 200);

        cuentaCorrienteLucho.consignar(3000);
        System.out.println("consignacion " + cuentaCorrienteLucho.getnConsignaciones());
        cuentaCorrienteLucho.retirar(500);
        System.out.println("retirar " + cuentaCorrienteLucho.getnRetiros());
        System.out.print("extracto mensual ");
        cuentaCorrienteLucho.extractoMensual();
        
        
        // imprimir todo
        System.out.println(cuentaCorrienteLucho);    

    }
}
