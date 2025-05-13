package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class Automovil extends Vehiculo implements Terrestre {
    public Automovil(String modelo) {
        super(modelo);
    }

    @Override
    public void porTierra() {
        System.out.println(getModelo() + " está conduciendo por tierra.");
    }
}
