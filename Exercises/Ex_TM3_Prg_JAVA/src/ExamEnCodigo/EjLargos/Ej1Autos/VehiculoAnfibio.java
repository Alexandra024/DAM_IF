package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class VehiculoAnfibio extends Vehiculo implements Terrestre, Acuatico {
    public VehiculoAnfibio(String modelo) {
        super(modelo);
    }

    @Override
    public void porTierra() {
        System.out.println(getModelo() + " puede conducir en la tierra.");
    }

    @Override
    public void porAgua() {
        System.out.println(getModelo() + " puede navegar en el agua.");
    }
}
