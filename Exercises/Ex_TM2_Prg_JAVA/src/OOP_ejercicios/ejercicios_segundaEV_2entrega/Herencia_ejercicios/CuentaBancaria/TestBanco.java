package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

public class TestBanco {
    
    public static void main(String[] args) {
        
        // Crear una cuenta de ahorros con saldo inicial de $15,000 y tasa de interés del 2%
        CuentaAhorros cuentaAhorrosSara = new CuentaAhorros(15000, 2, true);
        
        // Consignar $5,000 a la cuenta de ahorros
        cuentaAhorros.consignar(5000);
        
        // Retirar $2,000 de la cuenta de ahorros
        cuentaAhorros.retirar(2000);
        
        // Generar el extracto mensual de la cuenta de ahorros
        cuentaAhorros.extractoMensual();
        
    }
}
