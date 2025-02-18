package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;
  
    public CuentaCorriente(float saldo, float tasaAnual){
      super(saldo, tasaAnual);
    }
    
    @Override
    public void retirar(float cantidad){
      float nuevoSaldo = getSaldo() - cantidad; // se resta la cantidad a retirar al saldo
      setSaldo(nuevoSaldo); // actuaizamos el saldo
      setnRetiros(getnRetiros() + 1); // aumentamos el numero de retiros;
      if (nuevoSaldo < 0){ // si el saldo es negativo
        sobregiro = (nuevoSaldo * -1);
      }
    }

    
  }
