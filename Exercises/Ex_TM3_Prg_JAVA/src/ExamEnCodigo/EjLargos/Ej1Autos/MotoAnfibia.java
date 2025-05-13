package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class MotoAnfibia extends Vehiculo implements Terrestre, Acuatico {
    public MotoAnfibia(String modelo) {
        super(modelo);
    }

    @Override
    public void porTierra() {
        System.out.println(getModelo() + " está conduciendo por la tierra (anfibia).");
    }

    @Override
    public void porAgua() {
        System.out.println(getModelo() + " está navegando por el agua (anfibia).");
    }
}
