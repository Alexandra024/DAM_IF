package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjLargos.Ej1Autos;

public class Camion extends Vehiculo implements Terrestre {
    public Camion(String modelo) {
        super(modelo);
    }

    @Override
    public void porTierra() {
        System.out.println(getModelo() + " está conduciendo por tierra.");
    }
}