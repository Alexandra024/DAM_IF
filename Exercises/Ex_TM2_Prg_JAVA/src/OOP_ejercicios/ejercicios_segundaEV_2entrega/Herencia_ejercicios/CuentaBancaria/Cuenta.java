package OOP_ejercicios.ejercicios_segundaEV_2entrega.Herencia_ejercicios.CuentaBancaria;

class Cuenta{
    private float saldo;
    private int nConsignaciones = 0;
    private int nRetiros = 0;
    private float tasaAnual; // %
    private float comisionMensual = 0; 
  
    public Cuenta(float saldo, float tasaAnual){
      this.saldo = saldo;
      this.tasaAnual = tasaAnual;
    }
  
    // METODOS
    public void consignar(float cantidad){
      saldo += cantidad;
      nConsignaciones++;
    }
  
    public void retirar(float cantidad){
      if (cantidad <= saldo){
      saldo -= cantidad;
      nRetiros++;
      } else {System.out.println("No hay suficiente saldo");
      }
    }
  
    public void intMensual(){ 
      // se añade el interes mensual
      float interesMensual = (saldo * tasaAnual / 12);
      saldo += interesMensual;
    }
  
    public void extractoMensual(){
      saldo -= comisionMensual;
      //interes mensual
      intMensual();
    }
  
    // Getters
    public int getnConsignaciones() { return nConsignaciones; }
    public int getnRetiros() { return nRetiros; }
    public float gettasaAnual() { return tasaAnual; }
    public float getcomisionMensual() { return comisionMensual; }
    public float getSaldo() { return saldo; }
    // Setters
    public void setnConsignaciones(int nConsignaciones) { this.nConsignaciones = nConsignaciones; }
    public void setnRetiros(int nRetiros) { this.nRetiros = nRetiros; }
    public void settasaAnual(float tasaAnual) { this.tasaAnual = tasaAnual; }
    public void setcomisionMensual(float comisionMensual) { this.comisionMensual = comisionMensual; }
    public void setSaldo(float saldo) { this.saldo = saldo; }
    
    public String toString() {
      return "Saldo: " + saldo + "\n" + "Consignaciones: " + nConsignaciones + "\n" +
       "Retiros: " + nRetiros + "\n" + "Comision mensual: " + comisionMensual +

        "\n===== Estado de la Cuenta =====\n" + "Saldo: " + saldo + "\nNúmero de consignaciones: " + nConsignaciones 
        + "\nNúmero de retiros: " + nRetiros + "\nTasa anual: " + tasaAnual + "%" 
        + "\nComisión mensual: " + comisionMensual + "\n===============================";
    }
}