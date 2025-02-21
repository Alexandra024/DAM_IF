package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;
  
    public float getSobregiro(){return sobregiro;}
    public void setSobregiro(float sobregiro){this.sobregiro = sobregiro;}

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

    @Override
    public void consignar(float cantidad){
        super.consignar(cantidad);
        if (sobregiro > 0 ){
            float nuevoSaldo = getSaldo() - sobregiro;
            System.out.println("Su saldo actualizado es:" + nuevoSaldo);
        }
    }

    @Override
    public void extractoMensual(){
        super.extractoMensual();
    }

    public int transacciones(){
        return getnRetiros() + getnConsignaciones();
    }    

    public String toString(){
        return "Saldo:" + getSaldo() + "\n Comisión Mensual:" + getcomisionMensual() +
        "\n Transacciones realizadas:" + transacciones() + "\n Sobregiro:" + getSobregiro() + "\n=================";
    }
  }
