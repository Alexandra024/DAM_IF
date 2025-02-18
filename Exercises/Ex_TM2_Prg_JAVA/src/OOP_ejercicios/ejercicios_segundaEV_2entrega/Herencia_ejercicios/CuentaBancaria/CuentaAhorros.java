package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

class CuentaAhorros extends Cuenta{
    private boolean actividad;
  
    public CuentaAhorros(float saldo, float tasaAnual){
      super(saldo, tasaAnual);
      actividad = saldo < 10000;
    }
  
    @Override
    public void consignar(float cantidad){
      if (actividad == true){
        super.consignar(cantidad);
        System.out.println("Se puede consignar en esta cuenta" + cantidad);
      }else{
        System.out.println("No se puede consignar en esta cuenta");
      }
    }
  
    @Override
    public void retirar(float cantidad){
      if (actividad == true){
        super.retirar(cantidad);
      }else{
        System.out.println("No se puede retirar en esta cuenta");
      }
    }
    //Getters
    public boolean getActividad(){ return actividad; }
  
    @Override
    public void extractoMensual(){
      if (getnRetiros() > 4){
        setcomisionMensual(1000);
      }
  
      super.extractoMensual();
      
      if( getActividad() == true){
        System.out.println("Cuenta Activa");
      }else{
        System.out.println("Cuenta Inactiva");
      }
    }
  
    public int transacciones(){
      return getnRetiros() + getnConsignaciones();
    }
  
    public String toString(){
      return "Saldo:" + getSaldo() + "\n Comisión Mensual:" + getcomisionMensual() + 
        "\n Transacciones:" + transacciones();
    }
  
}