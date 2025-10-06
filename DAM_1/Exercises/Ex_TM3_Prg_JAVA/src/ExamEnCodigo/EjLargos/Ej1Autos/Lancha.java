package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class Lancha extends Vehiculo implements Acuatico {
    public Lancha(String modelo) {
        super(modelo);
    }

    @Override
    public void porAgua() {
        System.out.println(getModelo() + " está navegando por el agua.");
    }
}
